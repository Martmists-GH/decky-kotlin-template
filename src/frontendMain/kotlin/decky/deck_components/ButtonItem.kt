@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.events.MouseEvent
import react.FC

external interface ButtonItemProps : ItemProps {
    var onClick: ((e: MouseEvent) -> Unit)?
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var ButtonItem: FC<ButtonItemProps>
