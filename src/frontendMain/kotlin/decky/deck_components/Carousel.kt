@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.deck_components

import org.w3c.dom.HTMLDivElement
import react.FC
import react.ReactNode
import react.dom.html.HTMLAttributes

external interface CarouselProps : HTMLAttributes<HTMLDivElement> {
    var autoFocus: Boolean?
    var enableBumperPaging: Boolean?
    var fnDoesItemTakeFocus: ((unknown: Any) -> Boolean)?
    var fnGetColumnWidth: ((unknown: Any) -> Number)?
    var fnGetId: ((id: Number) -> Number)?
    var fnItemRenderer: ((id: Number, unknown: Any) -> ReactNode)?
    var fnUpdateArrows: ((unknown: Any) -> Any)?
    var initialColumn: Number?
    var nHeight: Number?
    var nIndexLeftmost: Number?
    var nItemHeight: Number?
    var nItemMarginX: Number?
    var nNumItems: Number?
    var name: String?
    var scrollToAlignment: String? /* "center" */
}

external var Carousel: FC<CarouselProps /* CarouselProps & RefAttributes<HTMLDivElement> */>
