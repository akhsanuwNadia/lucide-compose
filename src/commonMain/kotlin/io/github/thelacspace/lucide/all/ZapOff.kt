package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZapOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.768f,5.111f)
                lineTo(13.44f,2.44f)
                curveTo(13.935706f,1.94538f,14.707691f,1.8595604f,15.299925f,2.233237f)
                curveTo(15.8921585f,2.6069138f,16.147038f,3.3406456f,15.914f,4.001f)
                lineTo(14.280999f,8.625999f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.889f,13.232f)
                lineTo(19.561f,12.56f)
                curveTo(19.98957f,12.1308975f,20.117582f,11.485945f,19.885384f,10.925692f)
                curveTo(19.653185f,10.3654375f,19.106466f,10.000129f,18.5f,10.0f)
                lineTo(15.656f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.94f,7.94f)
                lineTo(4.44f,11.439f)
                curveTo(4.010845f,11.86788f,3.882315f,12.513055f,4.114348f,13.073655f)
                curveTo(4.3463807f,13.634255f,4.8932776f,13.99987f,5.5f,14.0f)
                lineTo(9.502f,14.0f)
                curveTo(9.66408f,14.000207f,9.816004f,14.078966f,9.909589f,14.211297f)
                curveTo(10.003175f,14.343629f,10.026811f,14.513114f,9.973f,14.666f)
                lineTo(8.086f,20.0f)
                curveTo(7.8528757f,20.660604f,8.108042f,21.3946f,8.700674f,21.768139f)
                curveTo(9.293307f,22.141676f,10.065574f,22.055273f,10.561001f,21.56f)
                lineTo(16.061f,16.06f)
            }
}

public val LucideIcons.All.ZapOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZapOff: ImageVector
    @Composable get() = ZapOffDefinition.asImageVector()
