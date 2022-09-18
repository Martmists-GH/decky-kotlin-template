@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.HTMLDivElement
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes

external interface CarouselProps : HTMLAttributes<HTMLDivElement> {
    var autoFocus: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableBumperPaging: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fnDoesItemTakeFocus: ((unknown: Any) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var fnGetColumnWidth: ((unknown: Any) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var fnGetId: ((id: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var fnItemRenderer: ((id: Number, unknown: Any) -> ReactNode)?
        get() = definedExternally
        set(value) = definedExternally
    var fnUpdateArrows: ((unknown: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var initialColumn: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nIndexLeftmost: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nItemHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nItemMarginX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nNumItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var scrollToAlignment: String? /* "center" */
        get() = definedExternally
        set(value) = definedExternally
}

external var Carousel: FC<CarouselProps /* CarouselProps & RefAttributes<HTMLDivElement> */>
