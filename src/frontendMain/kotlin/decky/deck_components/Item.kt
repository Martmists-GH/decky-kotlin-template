@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.Props
import react.ReactNode

external interface ItemProps : Props {
    var label: String?
    var description: String?
    var layout: String? /* "below" | "inline" */
    var icon: ReactNode?
    var bottomSeparator: String? /* "standard" | "thick" | "none" */
    var indentLevel: Number?
    var tooltip: String?
}
