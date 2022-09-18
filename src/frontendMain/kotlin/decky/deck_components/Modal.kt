@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.events.EventTarget
import react.FC
import react.Props
import react.ReactNode

external var showModal: (children: ReactNode, parent: EventTarget) -> Unit

external interface ModalRootProps : Props {
    var onCancel: (() -> Unit)?
    var closeModal: (() -> Unit)?
    var onOK: (() -> Unit)?
    var onEscKeypress: (() -> Unit)?
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var modalClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var bAllowFullSize: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bDestructiveWarning: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bDisableBackgroundDismiss: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bHideCloseIcon: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var bOKDisabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ConfirmModalProps : ModalRootProps {
    var onMiddleButton: (() -> Unit)?
}

external var ConfirmModal: FC<ConfirmModalProps>

external var ModalRoot: FC<ModalRootProps>
