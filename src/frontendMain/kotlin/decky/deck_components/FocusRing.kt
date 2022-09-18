package decky.deck_components

import csstype.ClassName
import react.ElementType
import react.FC
import react.Props
import react.ReactNode

external interface FocusRingProps : Props {
    var className: ClassName?
    var rootClassName: String?
    var render: ElementType<*>?
    var children: ReactNode
    var NavigationManager: Any?
}

external var FocusRing: FC<FocusRingProps>
