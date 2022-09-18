@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.Props

external interface FooterLegendProps : Props {
    var actionDescriptionMap: Any?
    var onOKActionDescription: String?
    var onCancelActionDescription: String?
    var onSecondaryActionDescription: String?
    var onOptionsActionDescription: String?
    var onMenuActionDescription: String?
    var onButtonDown: (() -> Unit)?
    var onButtonUp: (() -> Unit)?
    var onOKButton: (() -> Unit)?
    var onCancelButton: (() -> Unit)?
    var onSecondaryButton: (() -> Unit)?
    var onOptionsButton: (() -> Unit)?
    var onGamepadDirection: (() -> Unit)?
    var onGamepadFocus: (() -> Unit)?
    var onGamepadBlur: (() -> Unit)?
    var onMenuButton: (() -> Unit)?
}
