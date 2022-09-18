@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface PanelSectionProps : Props {
    var title: String?
    var spinner: Boolean?
}

external var PanelSection: FC<PanelSectionProps>

external var PanelSectionRow: FC<Props>
