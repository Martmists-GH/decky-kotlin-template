@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.HTMLDivElement
import react.FC
import react.dom.html.HTMLAttributes

external interface FieldProps : HTMLAttributes<HTMLDivElement>, FooterLegendProps {
    var label: dynamic /* String? | ReactNode? */
        get() = definedExternally
        set(value) = definedExternally
    var bottomSeparator: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var description: dynamic /* String? | ReactNode? */
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    var childrenLayout: String?
        get() = definedExternally
        set(value) = definedExternally
    var childrenContainerWidth: String?
        get() = definedExternally
        set(value) = definedExternally
    var padding: String?
        get() = definedExternally
        set(value) = definedExternally
    var highlightOnFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var indentLevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlignment: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var Field: FC<FieldProps /* FieldProps & RefAttributes<HTMLDivElement> */>
