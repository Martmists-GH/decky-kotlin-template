package decky

import react.router.RouteProps

typealias Omit<T, K> = Any
typealias RoutePatch = (route: RouteProps) -> RouteProps
typealias DefinePluginFn = (serverAPI: ServerAPI) -> Plugin
typealias Module = Any
typealias FilterFn = (module: Any) -> Boolean
typealias FindFn = (module: Any) -> Any
