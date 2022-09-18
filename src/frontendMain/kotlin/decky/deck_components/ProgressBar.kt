@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface ProgressBarItemProps : ItemProps {
    var indeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var nTransitionSec: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nProgress: Number?
        get() = definedExternally
        set(value) = definedExternally
    var focusable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProgressBarProps : Props {
    var indeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var nTransitionSec: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nProgress: Number?
        get() = definedExternally
        set(value) = definedExternally
    var focusable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProgressBarWithInfoProps : ProgressBarItemProps {
    var sTimeRemaining: Any?
        get() = definedExternally
        set(value) = definedExternally
    var sOperationText: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external var ProgressBar: FC<ProgressBarProps>

external var ProgressBarWithInfo: FC<ProgressBarWithInfoProps>

external var ProgressBarItem: FC<ProgressBarItemProps>
