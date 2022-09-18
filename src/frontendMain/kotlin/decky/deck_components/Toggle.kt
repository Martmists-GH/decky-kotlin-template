@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface ToggleProps : Props {
    var value: Boolean
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((checked: Boolean) -> Unit)?
    var navRef: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external var Toggle: FC<ToggleProps>
