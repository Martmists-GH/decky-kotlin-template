package dom

import org.w3c.dom.CustomEvent

external class CustomEvent<T> : CustomEvent {
    override val detail: T
}
