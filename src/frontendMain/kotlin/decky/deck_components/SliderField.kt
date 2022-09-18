@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC


external interface NotchLabel {
    var notchIndex: Number
    var label: String
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SliderFieldProps : ItemProps {
    var value: Number
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var step: Number?
        get() = definedExternally
        set(value) = definedExternally
    var notchCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var notchLabels: Array<NotchLabel>?
        get() = definedExternally
        set(value) = definedExternally
    var notchTicksVisible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var resetValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var editableValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var validValues: dynamic /* "steps" | "range" | ((value: Number) -> Boolean)? */
        get() = definedExternally
        set(value) = definedExternally
    var valueSuffix: String?
        get() = definedExternally
        set(value) = definedExternally
    var minimumDpadGranularity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onChange: ((value: Number) -> Unit)?
}

external var SliderField: FC<SliderFieldProps>
