@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.events.EventTarget
import react.FC
import react.Props
import react.ReactNode

external var showContextMenu: (children: ReactNode, parent: EventTarget?) -> Unit

external interface MenuProps : Props {
    var label: String
    var onCancel: (() -> Unit)?
    var cancelText: String?
}

external var Menu: FC<MenuProps>

external interface MenuItemProps : Props {
    var onSelected: (() -> Unit)?
}

external var MenuItem: FC<MenuItemProps>
