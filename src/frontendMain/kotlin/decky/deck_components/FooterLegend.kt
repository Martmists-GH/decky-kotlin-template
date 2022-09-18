@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.Props

external interface FooterLegendProps : Props {
    var actionDescriptionMap: Any?
        get() = definedExternally
        set(value) = definedExternally
    var onOKActionDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var onCancelActionDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var onSecondaryActionDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var onOptionsActionDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var onMenuActionDescription: String?
        get() = definedExternally
        set(value) = definedExternally
    var onButtonDown: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onButtonUp: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOKButton: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onCancelButton: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onSecondaryButton: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onOptionsButton: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onGamepadDirection: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onGamepadFocus: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onGamepadBlur: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onMenuButton: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}
