@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import csstype.ClassName
import org.w3c.dom.events.EventTarget
import react.FC
import react.Props
import react.ReactNode

external var showModal: (children: ReactNode, parent: EventTarget?) -> Unit

external interface ModalRootProps : Props {
    var onCancel: (() -> Unit)?
    var closeModal: (() -> Unit)?
    var onOK: (() -> Unit)?
    var onEscKeypress: (() -> Unit)?
    var className: ClassName?
    var modalClassName: String?
    var bAllowFullSize: Boolean?
    var bDestructiveWarning: Boolean?
    var bDisableBackgroundDismiss: Boolean?
    var bHideCloseIcon: Boolean?
    var bOKDisabled: Boolean?
}

external interface ConfirmModalProps : ModalRootProps {
    var onMiddleButton: (() -> Unit)?
}

external var ConfirmModal: FC<ConfirmModalProps>

external var ModalRoot: FC<ModalRootProps>
