@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.utils

import kotlin.js.Promise

external fun joinClassNames(vararg classes: String): String

external fun sleep(ms: Number): Promise<Any>
