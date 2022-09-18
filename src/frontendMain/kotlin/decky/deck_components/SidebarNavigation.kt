@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface SidebarNavigationPages {
    var title: String
    var route: String
    var content: Any
}

external interface SidebarNavigationProps : Props {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var pages: Array<SidebarNavigationPages>
    var showTitle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disableRouteReporting: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var SidebarNavigation: FC<SidebarNavigationProps>
