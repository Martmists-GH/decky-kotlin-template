@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.utils

import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import kotlin.js.Json

external fun fakeRenderComponent(param_fun: Function<*>): Any

external fun wrapReactType(node: Any, prop: Any = definedExternally): Any

external fun wrapReactClass(node: Any, prop: Any = definedExternally): Json

external fun getReactInstance(o: HTMLElement): Any

external fun getReactInstance(o: Element): Any

external fun getReactInstance(o: Node): Any

external interface findInTreeOpts {
    var walkable: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var ignore: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external var findInTree: (parent: Any, filter: findInTreeFilter, opts: findInTreeOpts) -> Any

external var findInReactTree: (node: Any, filter: findInTreeFilter) -> Any
