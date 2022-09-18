@file:JsNonModule
@file:JsModule("decky-frontend-lib")

package decky.utils

external var callOriginal: Any

external interface PatchOptions {
    var singleShot: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Patch {
    var original: Function<*>
    var property: String
    var `object`: Any
    var patchedFunction: Any
    var hasUnpatched: Boolean
    var handler: GenericPatchHandler
    var unpatch: () -> Unit
}

external fun beforePatch(obj: Any, property: String, handler: (args: Array<Any>) -> Any, options: PatchOptions = definedExternally): Patch

external fun afterPatch(obj: Any, property: String, handler: (args: Array<Any>, ret: Any) -> Any, options: PatchOptions = definedExternally): Patch

external fun replacePatch(obj: Any, property: String, handler: (args: Array<Any>) -> Any, options: PatchOptions = definedExternally): Patch
