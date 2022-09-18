@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC

external interface ToggleFieldProps : ItemProps {
    var checked: Boolean
    var disabled: Boolean?
    var onChange: ((checked: Boolean) -> Unit)?
}

external var ToggleField: FC<ToggleFieldProps>
