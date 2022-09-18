@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky

import org.w3c.fetch.Request
import org.w3c.fetch.RequestInit
import react.ComponentType
import react.ReactElement
import react.router.RouteProps
import kotlin.js.Promise
import kotlin.js.RegExp

external interface Plugin {
    var title: ReactElement<*>
    var icon: ReactElement<*>
    var content: ReactElement<*>?
        get() = definedExternally
        set(value) = definedExternally
    var onDismount: (() -> Unit)?
}

external interface ServerResponseSuccess<TRes> {
    var success: Boolean
    var result: TRes
}

external interface ServerResponseError {
    var success: Boolean
    var result: String
}

external interface RouterHook {
    fun addRoute(path: String, component: ComponentType<*>, props: Omit<RouteProps, String /* "path" | "children" */> = definedExternally)
    fun addPatch(path: String, patch: RoutePatch): RoutePatch
    fun removePatch(path: String, patch: RoutePatch)
    fun removeRoute(path: String)
}

external interface ToastData {
    var title: Any
    var body: Any
    var onClick: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var logo: Any?
        get() = definedExternally
        set(value) = definedExternally
    var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var contentClassName: String?
        get() = definedExternally
        set(value) = definedExternally
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var critical: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Toaster {
    fun toast(toast: ToastData)
}

external interface FilePickerRes {
    var path: String
    var realpath: String
}

external interface ServerAPI {
    var routerHook: RouterHook
    var toaster: Toaster
    fun openFilePicker(startPath: String, includeFiles: Boolean = definedExternally, regex: RegExp = definedExternally): Promise<FilePickerRes>
    fun <TArgs> callPluginMethod(methodName: String, args: TArgs): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun <TArgs> callServerMethod(methodName: String, args: TArgs): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun fetchNoCors(url: Request, request: RequestInit = definedExternally): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun fetchNoCors(url: Request): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun fetchNoCors(url: String, request: RequestInit = definedExternally): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun fetchNoCors(url: String): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun executeInTab(tab: String, runAsync: Boolean, code: String): Promise<Any>
    fun injectCssIntoTab(tab: String, style: String): Promise<dynamic /* ServerResponseSuccess<TRes> | ServerResponseError */>
    fun removeCssFromTab(tab: String, cssId: String): Promise<Any>
}
