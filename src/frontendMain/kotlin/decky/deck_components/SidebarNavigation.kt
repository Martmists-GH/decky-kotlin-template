@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props
import react.ReactNode

external interface SidebarNavigationPages {
    var title: String
    var route: String
    var content: ReactNode
}

external interface SidebarNavigationProps : Props {
    var title: String?
    var pages: Array<SidebarNavigationPages>
    var showTitle: Boolean?
    var disableRouteReporting: Boolean?
}

external var SidebarNavigation: FC<SidebarNavigationProps>
