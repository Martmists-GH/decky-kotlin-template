@file:JsNonModule
@file:JsModule("decky-frontend-lib")
package decky.custom_components

import org.w3c.dom.HTMLImageElement
import react.FC
import react.dom.html.ImgHTMLAttributes

external interface SuspensefulImageProps : ImgHTMLAttributes<HTMLImageElement> {
    var suspenseWidth: dynamic /* String? | Number? */
    var suspenseHeight: dynamic /* String? | Number? */
}

external var SuspensefulImage: FC<SuspensefulImageProps>
