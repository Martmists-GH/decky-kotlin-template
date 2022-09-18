@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import csstype.ClassName
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.events.MouseEvent
import react.CSSProperties
import react.FC
import react.RefAttributes

external interface DialogButtonProps : RefAttributes<HTMLDivElement> {
    var label: String?
    var style: CSSProperties?
    var className: ClassName?
    var noFocusRing: Boolean?
    var description: String?
    var layout: String? /* "below" */
    var onClick: ((e: MouseEvent) -> Unit)?
    var disabled: Boolean?
    var bottomSeparator: Boolean?
}

external var DialogButton: FC<DialogButtonProps>
