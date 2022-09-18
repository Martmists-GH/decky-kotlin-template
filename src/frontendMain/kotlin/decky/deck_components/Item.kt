@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.Props

external interface ItemProps : Props {
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "below" | "inline" */
        get() = definedExternally
        set(value) = definedExternally
    var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    var bottomSeparator: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var indentLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: String?
        get() = definedExternally
        set(value) = definedExternally
}
