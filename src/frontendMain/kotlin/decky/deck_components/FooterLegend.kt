@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.Props

external enum class GamepadButton {
    INVALID /* = 0 */,
    OK /* = 1 */,
    CANCEL /* = 2 */,
    SECONDARY /* = 3 */,
    OPTIONS /* = 4 */,
    BUMPER_LEFT /* = 5 */,
    BUMPER_RIGHT /* = 6 */,
    TRIGGER_LEFT /* = 7 */,
    TRIGGER_RIGHT /* = 8 */,
    DIR_UP /* = 9 */,
    DIR_DOWN /* = 10 */,
    DIR_LEFT /* = 11 */,
    DIR_RIGHT /* = 12 */,
    SELECT /* = 13 */,
    START /* = 14 */,
    LSTICK_CLICK /* = 15 */,
    RSTICK_CLICK /* = 16 */,
    LSTICK_TOUCH /* = 17 */,
    RSTICK_TOUCH /* = 18 */,
    LPAD_TOUCH /* = 19 */,
    LPAD_CLICK /* = 20 */,
    RPAD_TOUCH /* = 21 */,
    RPAD_CLICK /* = 22 */,
    REAR_LEFT_UPPER /* = 23 */,
    REAR_LEFT_LOWER /* = 24 */,
    REAR_RIGHT_UPPER /* = 25 */,
    REAR_RIGHT_LOWER /* = 26 */,
    STEAM_GUIDE /* = 27 */,
    STEAM_QUICK_MENU /* = 28 */
}


external interface GamepadEventDetail {
    var button: Number
    var is_repeat: Boolean?
    var source: Number
}

external interface FooterLegendProps : Props {
    var actionDescriptionMap: Any?
    var onOKActionDescription: String?
    var onCancelActionDescription: String?
    var onSecondaryActionDescription: String?
    var onOptionsActionDescription: String?
    var onMenuActionDescription: String?
    var onButtonDown: ((evt: GamepadEvent) -> Unit)?
    var onButtonUp: ((evt: GamepadEvent) -> Unit)?
    var onOKButton: ((evt: GamepadEvent) -> Unit)?
    var onCancelButton: ((evt: GamepadEvent) -> Unit)?
    var onSecondaryButton: ((evt: GamepadEvent) -> Unit)?
    var onOptionsButton: ((evt: GamepadEvent) -> Unit)?
    var onGamepadDirection: ((evt: GamepadEvent) -> Unit)?
    var onGamepadFocus: ((evt: GamepadEvent) -> Unit)?
    var onGamepadBlur: ((evt: GamepadEvent) -> Unit)?
    var onMenuButton: ((evt: GamepadEvent) -> Unit)?
}
