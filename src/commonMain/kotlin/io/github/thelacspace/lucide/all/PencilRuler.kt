package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilRuler") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,7.0f)
                lineTo(8.7f,2.7f)
                curveTo(7.759788f,1.7643263f,6.2402115f,1.7643263f,5.2999997f,2.7f)
                lineTo(2.7f,5.3f)
                curveTo(1.764326f,6.240212f,1.764326f,7.759789f,2.7f,8.700001f)
                lineTo(7.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                lineTo(20.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,11.0f)
                lineTo(21.3f,15.3f)
                curveTo(22.24f,16.24f,22.24f,17.76f,21.3f,18.7f)
                lineTo(18.699999f,21.300001f)
                curveTo(17.759998f,22.240002f,16.239998f,22.240002f,15.299999f,21.300001f)
                lineTo(11.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.174f,6.812f)
                curveTo(22.266592f,5.709867f,22.26284f,3.9319034f,21.165604f,2.8343928f)
                curveTo(20.068369f,1.7368822f,18.290407f,1.7326835f,17.188f,2.8249998f)
                lineTo(3.842f,16.174f)
                curveTo(3.6098194f,16.4055f,3.4381137f,16.69053f,3.342f,17.004f)
                lineTo(2.021f,21.355999f)
                curveTo(1.9683454f,21.532194f,2.0166585f,21.723072f,2.1467962f,21.853f)
                curveTo(2.276934f,21.98293f,2.4678895f,22.030937f,2.644f,21.977999f)
                lineTo(6.997f,20.657999f)
                curveTo(7.310169f,20.56275f,7.5951734f,20.392092f,7.827f,20.161f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(19.0f,9.0f)
            }
}

public val LucideIcons.All.PencilRulerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilRuler: ImageVector
    @Composable get() = PencilRulerDefinition.asImageVector()
