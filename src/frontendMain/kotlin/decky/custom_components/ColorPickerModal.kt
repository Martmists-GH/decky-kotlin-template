@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.custom_components

import react.FC
import react.Props

external interface ColorPickerModalProps : Props {
    var closeModal: () -> Unit
    var onConfirm: ((HSLString: String) -> Any?)?
    var title: String
    var defaultH: Number?
    var defaultS: Number?
    var defaultL: Number?
    var defaultA: Number?
}

@Deprecated("Not available yet as of decky-frontend-lib 3.1.4")
external var ColorPickerModal: FC<ColorPickerModalProps>
