import com.github.gmazzo.gradle.plugins.generators.BuildConfigKotlinGenerator
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    kotlin("multiplatform") version "1.7.0"
    id("com.martmists.kpy.kpy-plugin") version "0.4.6"
    id("com.github.gmazzo.buildconfig") version "3.0.3"
}

group = "com.martmists"
version = System.getenv("GIT_TAG") ?: "0.0.3"
val production: String? by project
val isDevelopment = production != "true"

repositories {
    mavenCentral()
}

kotlin {
    js("frontend", IR) {
        browser {
            commonWebpackConfig {
                outputFileName = "index.js"
            }
        }
        binaries.executable()
    }

    linuxX64("python") {
        binaries {
            staticLib(listOf(if (isDevelopment) DEBUG else RELEASE)) {
                binaryOptions["memoryModel"] = "experimental"
            }
        }
    }

    linuxX64("backend") {
        binaries {
            executable(listOf(if (isDevelopment) DEBUG else RELEASE)){
                binaryOptions["memoryModel"] = "experimental"
            }
        }
    }

    sourceSets {
        val frontendMain by getting {
            dependencies {
                implementation(npm("decky-frontend-lib", "3.0.0"))

                // Kotlin Wrappers
                for (module in listOf(
                    "react",
                    "react-dom",
                    "react-router-dom",
                    "emotion",
                    "mui",
                    "mui-icons",
                )) {
                    implementation("org.jetbrains.kotlin-wrappers:kotlin-$module")
                }
            }
        }
    }
}

dependencies {
    "frontendMainImplementation"(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:1.0.0-pre.387"))
}

val plugin by sourceSets.creating {
    resources {
        srcDir("src/plugin")
    }
}
val python by sourceSets.creating {
    resources {
        srcDir("src/pythonMain/python")
    }
}

tasks {
    named("prepareKotlinBuildScriptModel") {
        dependsOn("generateBuildConfig")
    }

    withType<Kotlin2JsCompile> {
        kotlinOptions {
            freeCompilerArgs += listOfNotNull(
                if (isDevelopment) null else "-Xir-minimized-member-names",
                if (isDevelopment) null else "-Xir-dce",
                if (isDevelopment) "-source-map" else null,
                if (isDevelopment) "-source-map-embed-sources=always" else null,
                "-Xir-build-cache",
                "-opt-in=kotlin.js.ExperimentalJsExport",
            )
        }
    }

    withType<KotlinCompile<KotlinCommonOptions>> {
        dependsOn("generateBuildConfig")

        kotlinOptions {
            freeCompilerArgs += listOfNotNull(
                "-Xenable-incremental-compilation",
            )
        }
    }

    val webpackTask by named<KotlinWebpack>("frontendBrowser${if (isDevelopment) "Development" else "Production"}Webpack") {
        outputs.upToDateWhen { false }
    }

    val buildPython by creating(Exec::class) {
        dependsOn("pythonBinaries")

        executable = "python3.10"
        args("src/pythonMain/resources/setup.py", "build", "--build-lib=${buildDir}/python")

        outputs.dir("${buildDir}/python")
    }

    val installPythonDev by creating(Exec::class) {
        dependsOn(buildPython)

        executable = "python3.10"
        args("-m", "pip", "install", "--use-pep517", "-e", "src/pythonMain/resources")
    }

    val bundle by creating(Copy::class) {
        val backendMain by kotlin.sourceSets.getting
        val frontendMain by kotlin.sourceSets.getting

        dependsOn(webpackTask, named("backendBinaries"))

        destinationDir = file("${buildDir}/bundle")

        into(project.name) {
            from(
                backendMain.resources,
                python.resources,
                buildPython,
                "README.md",
                "LICENSE",
            )
            from(plugin.resources){
                filesMatching("*.json") {
                    expand(mapOf(
                        "project" to project.name.toLowerCase(),
                        "version" to project.version,
                    ))
                }
            }
            into("dist") {
                into("assets") {
                    from(frontendMain.resources)
                }

                from(webpackTask.destinationDirectory) {
                    filter {
                        it.replace("module.exports = __webpack_exports__.definePlugin;", "return __webpack_exports__.definePlugin;")
                    }
                }
            }
            into("bin") {
                from("${buildDir}/bin/backend/${if (isDevelopment) "debug" else "release"}Executable") {
                    rename(".*\\.kexe", "backend")
                }
            }
        }
    }

    val bundleZip by creating(Zip::class) {
        dependsOn(bundle)

        archiveFileName.set("${project.name}-${project.version}.zip")
        destinationDirectory.set(file("${buildDir}/bundled"))
        from(bundle.destinationDir)
    }

    val build by getting {
        dependsOn(bundleZip)
    }
}

kpy {
    target.set("python")
    moduleName.set("example_plugin")
    metadata("debug", if (isDevelopment) "True" else "False")
}

buildConfig {
    generator(BuildConfigKotlinGenerator())
    packageName("")
    buildConfigField("String", "NAME", "\"${project.name}\"")
    buildConfigField("Boolean", "DEBUG", isDevelopment.toString())
}
