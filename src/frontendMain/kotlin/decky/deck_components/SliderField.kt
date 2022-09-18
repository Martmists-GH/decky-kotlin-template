@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC


external interface NotchLabel {
    var notchIndex: Number
    var label: String
    var value: Number?
}

external interface SliderFieldProps : ItemProps {
    var value: Number
    var min: Number?
    var max: Number?
    var step: Number?
    var notchCount: Number?
    var notchLabels: Array<NotchLabel>?
    var notchTicksVisible: Boolean?
    var showValue: Boolean?
    var resetValue: Number?
    var disabled: Boolean?
    var editableValue: Boolean?
    var validValues: dynamic /* "steps" | "range" | ((value: Number) -> Boolean)? */
    var valueSuffix: String?
    var minimumDpadGranularity: Number?
    var onChange: ((value: Number) -> Unit)?
}

external var SliderField: FC<SliderFieldProps>
