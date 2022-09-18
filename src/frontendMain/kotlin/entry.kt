import csstype.*
import decky.DefinePluginFn
import decky.ServerAPI
import decky.deck_components.*
import emotion.react.css
import kotlinx.browser.window
import kotlinx.js.get
import kotlinx.js.jso
import mui.icons.material.RocketLaunch
import react.FC
import react.Props
import react.VFC
import react.create
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.img
import kotlin.js.json

external interface ContentProps : Props {
    var serverAPI: ServerAPI
}

val Content = FC<ContentProps> {
    PanelSection {
        title = "Panel Section"

        PanelSectionRow {
            ButtonItem {
                layout="below"
                onClick = { e ->
                    showContextMenu(
                        VFC {
                            Menu {
                                label = "Menu"
                                cancelText = "Cancel"
                                onCancel = { }

                                MenuItem {
                                    onSelected = { }
                                    +"Item #1"
                                }
                                MenuItem {
                                    onSelected = { }
                                    +"Item #2"
                                }
                                MenuItem {
                                    onSelected = { }
                                    +"Item #3"
                                }
                            }
                        }.create(),
                        e.currentTarget ?: window
                    )
                }
                +"Server says yolo"
            }
        }

        PanelSectionRow {
            div {
                css {
                    display = Display.flex
                    justifyContent = JustifyContent.spaceBetween
                }
                img {
                    src = asset("logo.png")
                }
            }
        }

        PanelSectionRow {
            ButtonItem {
                layout = "below"
                onClick = {
                    Router.CloseSideMenus()
                    Router.Navigate("/decky-plugin-test")
                }

                +"Router"
            }
        }
    }
}

val DeckyPluginRouterTest = VFC {
    div {
        css {
            marginTop = 50.px
            color = NamedColor.white
        }

        +"Hello World!"
        DialogButton {
            onClick = {
                Router.NavigateToStore()
            }
            +"Go to Store"
        }
    }
}

@JsExport
val definePlugin: DefinePluginFn = { serverApi ->
    serverApi.routerHook.addRoute("/decky-plugin-test", DeckyPluginRouterTest, json(
        "exact" to true,
    ))

    jso {
        title = VFC {
            div {
                className = ClassName(staticClasses["Title"]!!)
                +"Example Plugin"
            }
        }.create()
        icon = VFC {
            RocketLaunch {
                width = 1.em.unsafeCast<Double>()
                height = 1.em.unsafeCast<Double>()
                fill = "currentColor"
            }
        }.create()
        content = Content.create {
            this.serverAPI = serverApi
        }
    }
}
