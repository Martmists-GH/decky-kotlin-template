@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.TouchEvent
import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import org.w3c.dom.pointerevents.PointerEvent
import react.FC
import react.Props

external interface ButtonProps : Props {
    var style: Any
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var noFocusRing: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onClick: ((e: MouseEvent) -> Unit)?
    var onPointerDown: ((e: PointerEvent) -> Unit)?
    var onPointerUp: ((e: PointerEvent) -> Unit)?
    var onPointerCancel: ((e: PointerEvent) -> Unit)?
    var onMouseDown: ((e: PointerEvent) -> Unit)?
    var onMouseUp: ((e: MouseEvent) -> Unit)?
    var onTouchStart: ((e: TouchEvent) -> Unit)?
    var onTouchEnd: ((e: TouchEvent) -> Unit)?
    var onTouchCancel: ((e: TouchEvent) -> Unit)?
    var onSubmit: ((e: Event) -> Unit)?  // TODO: SubmitEvent
}

external var DialogButton: FC<ButtonProps>

external var Button: FC<ButtonProps>
