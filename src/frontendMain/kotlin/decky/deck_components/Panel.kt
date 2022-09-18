@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props

external interface PanelSectionProps : Props {
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var spinner: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var PanelSection: FC<PanelSectionProps>

external var PanelSectionRow: FC<Props>
