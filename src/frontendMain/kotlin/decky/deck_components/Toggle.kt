@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface ToggleProps : Props {
    var value: Boolean
    var disabled: Boolean?
    var onChange: ((checked: Boolean) -> Unit)?
    var navRef: Any?
}

external var Toggle: FC<ToggleProps>
