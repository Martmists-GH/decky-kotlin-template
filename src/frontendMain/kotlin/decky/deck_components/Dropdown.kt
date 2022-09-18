@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import react.FC
import react.Props
import react.ReactNode

external interface SingleDropdownOption {
    var data: Any
    var label: Any
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MultiDropdownOption {
    var label: Any
    var options: Array<dynamic /* SingleDropdownOption | MultiDropdownOption */>
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DropdownProps : Props {
    var rgOptions: Array<dynamic /* SingleDropdownOption | MultiDropdownOption */>
    var selectedOption: Any
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onMenuWillOpen: ((showMenu: () -> Unit) -> Unit)?
    var onMenuOpened: (() -> Unit)?
    var onChange: ((data: SingleDropdownOption) -> Unit)?
    var contextMenuPositionOptions: Any?
        get() = definedExternally
        set(value) = definedExternally
    var menuLabel: String?
        get() = definedExternally
        set(value) = definedExternally
    var strDefaultLabel: String?
        get() = definedExternally
        set(value) = definedExternally
    var renderButtonValue: ((element: ReactNode) -> ReactNode)?
    var focusable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external var Dropdown: FC<DropdownProps>

external interface DropdownItemProps : DropdownProps, ItemProps

external var DropdownItem: FC<DropdownItemProps>
