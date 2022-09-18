@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.HTMLInputElement
import react.FC
import react.ReactNode
import react.dom.events.ChangeEventHandler
import react.dom.html.HTMLAttributes


external interface TextFieldProps : HTMLAttributes<HTMLInputElement> {
    var label: ReactNode?
    var requiredLabel: ReactNode?
    var description: ReactNode?
    var disabled: Boolean?
    var bShowCopyAction: Boolean?
    var bShowClearAction: Boolean?
    var bAlwaysShowClearAction: Boolean?
    var bIsPassword: Boolean?
    var rangeMin: Number?
    var rangeMax: Number?
    var mustBeNumeric: Boolean?
    var mustBeURL: Boolean?
    var mustBeEmail: Boolean?
    var focusOnMount: Boolean?
    var tooltip: String?
    var inlineControls: ReactNode?
    var onChange: ChangeEventHandler<HTMLInputElement>?
    var value: String?
}

external var TextField: FC<TextFieldProps>
