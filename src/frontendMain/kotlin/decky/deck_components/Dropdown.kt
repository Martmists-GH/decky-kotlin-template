@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props
import react.ReactNode

external interface _DropdownOption

external interface SingleDropdownOption : _DropdownOption {
    var data: Any
    var label: ReactNode
    var options: Any?
}

external interface MultiDropdownOption : _DropdownOption {
    var label: ReactNode
    var options: Array<_DropdownOption>
    var data: Any?
}

external interface DropdownProps : Props {
    var rgOptions: Array<_DropdownOption>
    var selectedOption: Any
    var disabled: Boolean?
    var onMenuWillOpen: ((showMenu: () -> Unit) -> Unit)?
    var onMenuOpened: (() -> Unit)?
    var onChange: ((data: SingleDropdownOption) -> Unit)?
    var contextMenuPositionOptions: Any?
    var menuLabel: String?
    var strDefaultLabel: String?
    var renderButtonValue: ((element: ReactNode) -> ReactNode)?
    var focusable: Boolean?
}

external var Dropdown: FC<DropdownProps>

external interface DropdownItemProps : DropdownProps, ItemProps

external var DropdownItem: FC<DropdownItemProps>
