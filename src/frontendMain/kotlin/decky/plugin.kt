@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky

import csstype.ClassName
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
    var onDismount: (() -> Unit)?
}

external interface _ServerResponse {
    var success: Boolean
}

external interface ServerResponseSuccess<TRes> : _ServerResponse {
    var result: TRes
}

external interface ServerResponseError : _ServerResponse {
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
    var logo: Any?
    var icon: Any?
    var className: ClassName?
    var contentClassName: String?
    var duration: Number?
    var critical: Boolean?
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
    fun <TArgs> callPluginMethod(methodName: String, args: TArgs): Promise<_ServerResponse>
    fun <TArgs> callServerMethod(methodName: String, args: TArgs): Promise<_ServerResponse>
    fun fetchNoCors(url: Request, request: RequestInit = definedExternally): Promise<_ServerResponse>
    fun fetchNoCors(url: String, request: RequestInit = definedExternally): Promise<_ServerResponse>
    fun executeInTab(tab: String, runAsync: Boolean, code: String): Promise<Any>
    fun injectCssIntoTab(tab: String, style: String): Promise<_ServerResponse>
    fun removeCssFromTab(tab: String, cssId: String): Promise<Any>
}
