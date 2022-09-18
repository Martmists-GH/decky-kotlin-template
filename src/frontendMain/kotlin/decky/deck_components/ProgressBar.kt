@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props
import react.ReactNode

external interface ProgressBarItemProps : ItemProps {
    var indeterminate: Boolean?
    var nTransitionSec: Number?
    var nProgress: Number?
    var focusable: Boolean?
}

external interface ProgressBarProps : Props {
    var indeterminate: Boolean?
    var nTransitionSec: Number?
    var nProgress: Number?
    var focusable: Boolean?
}

external interface ProgressBarWithInfoProps : ProgressBarItemProps {
    var sTimeRemaining: ReactNode?
    var sOperationText: ReactNode?
}

external var ProgressBar: FC<ProgressBarProps>

external var ProgressBarWithInfo: FC<ProgressBarWithInfoProps>

external var ProgressBarItem: FC<ProgressBarItemProps>
