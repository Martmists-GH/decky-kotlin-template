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
    var focusClassName: String?
    var focusWithinClassName: String?
    var onActivate: ((e: CustomEvent) -> Unit)?
    var onCancel: ((e: CustomEvent) -> Unit)?
}

external var Focusable: FC<FocusableProps /* FocusableProps & RefAttributes<HTMLDivElement> */>
