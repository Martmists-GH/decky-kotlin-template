@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky

external var webpackCache: Any

external var allModules: Array<Module>

external var findModule: (filter: FilterFn) -> Any

external var findModuleChild: (filter: FindFn) -> Any

external var findAllModules: (filter: FilterFn) -> Array<Any>

external var CommonUIModule: Any

external var IconsModule: Any

external var ReactRouter: Any
