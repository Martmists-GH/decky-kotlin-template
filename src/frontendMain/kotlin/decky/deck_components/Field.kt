@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import csstype.ClassName
import org.w3c.dom.HTMLDivElement
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes

external interface FieldProps : HTMLAttributes<HTMLDivElement>, FooterLegendProps {
    var label: ReactNode?
    var bottomSeparator: String? /* "standard" | "thick" | "none" */
    var description: ReactNode?
    var disabled: Boolean?
    var icon: ReactNode?
    var inlineWrap: String? /* "keep-inline" | "shift-children-below" */
    var childrenLayout: String? /* "below" | "inline" */
    var childrenContainerWidth: String? /* "min" | "max" | "fixed" */
    var spacingBetweenLabelAndChild: String? /* "none" */
    var padding: String? /* "none" | "standard" | "compact" */
    override var className: ClassName?
    var highlightOnFocus: Boolean?
    var indentLevel: Number?
    var verticalAlignment: String? /* "center" | "none" */
}

external var Field: FC<FieldProps /* FieldProps & RefAttributes<HTMLDivElement> */>
