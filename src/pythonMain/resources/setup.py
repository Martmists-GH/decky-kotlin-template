from os.path import abspath, dirname
from platform import system
from setuptools import setup, Extension, find_packages
from subprocess import Popen, PIPE
from sys import version_info


path = dirname(abspath(__file__))

osname = system()
debug = True  # TODO: fetch from setupMetadata, bug in KPy-Plugin

# Fetch configuration from gradle task
proc = Popen(["./gradlew", f"-PpythonVersion={version_info[0]}.{version_info[1]}", "setupMetadata"], stdout=PIPE, cwd=path+"/../../..")
proc.wait()
output = proc.stdout.read().decode()
real_output = output.split("===METADATA START===")[1].split("===METADATA END===")[0]

exec(real_output, globals(), locals())
# Types of variables from gradle metadata
has_stubs: bool
project_name: str
module_name: str
project_version: str
build_dir: str
root_dir: str
target: str
debug: bool

print("name: " + project_name)
print("version: " + project_version)
print(real_output)


def snake_case(name):
    return name.replace("-", "_").lower()


def extensions():
    folder = ["debugStatic", "releaseStatic"]
    if not debug:
        folder = folder[::-1]
    prefix = "_" if has_stubs else ""
    native = Extension(prefix + module_name,
                       sources=[f'{build_dir}/generated/ksp/{target}/{target}Main/resources/entrypoint.cpp'],
                       include_dirs=[f"{build_dir}/bin/{target}/{fold}/" for fold in folder],
                       library_dirs=[f"{build_dir}/bin/{target}/{fold}/" for fold in folder],
                       libraries=[project_name])

    return [native]


attrs = {}

if has_stubs:
    stub_root = f'{build_dir}/generated/ksp/{target}/{target}Main/resources'
    attrs["packages"] = find_packages(where=stub_root)
    attrs["package_dir"] = {"": stub_root}
else:
    attrs["packages"] = []

setup(
    name=snake_case(project_name),
    version=project_version,
    ext_modules=extensions(),
    **attrs
)
