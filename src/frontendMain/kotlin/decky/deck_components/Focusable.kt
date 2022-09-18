@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.CustomEvent
import org.w3c.dom.HTMLDivElement
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes

external interface FocusableProps : HTMLAttributes<HTMLDivElement>, FooterLegendProps {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String?)
    override var children: ReactNode?
    var focusClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var focusWithinClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var onActivate: ((e: CustomEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var onCancel: ((e: CustomEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external var Focusable: FC<FocusableProps /* FocusableProps & RefAttributes<HTMLDivElement> */>
