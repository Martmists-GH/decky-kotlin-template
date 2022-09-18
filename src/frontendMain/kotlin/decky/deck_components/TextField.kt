@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.HTMLInputElement
import react.FC
import react.dom.html.HTMLAttributes


external interface TextFieldProps : HTMLAttributes<HTMLInputElement> {
    var label: Any?
        get() = definedExternally
        set(value) = definedExternally
    var requiredLabel: Any?
        get() = definedExternally
        set(value) = definedExternally
    var description: Any?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bShowCopyAction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bShowClearAction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bAlwaysShowClearAction: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bIsPassword: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rangeMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rangeMax: Number?
        get() = definedExternally
        set(value) = definedExternally
    var mustBeNumeric: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mustBeURL: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mustBeEmail: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focusOnMount: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: String?
        get() = definedExternally
        set(value) = definedExternally
    var inlineControls: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: Any?
        get() = definedExternally
        set(value) = definedExternally
    var value: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var TextField: FC<TextFieldProps>
