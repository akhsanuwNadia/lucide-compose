package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CandyCane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.8f,5.0f)
                lineTo(12.911f,9.223f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.75f,7.0f)
                lineTo(15.0f,2.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.874f,14.647f)
                lineTo(6.994f,18.887001f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.7f,21.0f)
                curveTo(5.145152f,21.960981f,3.917915f,22.292736f,2.954462f,21.742191f)
                curveTo(1.9910089f,21.191647f,1.6537694f,19.965906f,2.1999998f,19.0f)
                lineTo(10.8f,5.0f)
                curveTo(12.46442f,2.1445827f,16.123781f,1.1715691f,18.986614f,2.8232028f)
                curveTo(21.849445f,4.474837f,22.838816f,8.12981f,21.2f,11.0f)
                curveTo(20.845268f,11.623884f,20.18345f,12.009872f,19.46577f,12.011444f)
                curveTo(18.748093f,12.013017f,18.084589f,11.629932f,17.727127f,11.007608f)
                curveTo(17.369665f,10.385284f,17.37305f,9.61914f,17.736f,9.0f)
                curveTo(18.098976f,8.380858f,18.102379f,7.614696f,17.744915f,6.992356f)
                curveTo(17.387451f,6.3700156f,16.723934f,5.986922f,16.006239f,5.9885015f)
                curveTo(15.288546f,5.9900813f,14.62672f,6.376092f,14.272f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.906f,9.712f)
                lineTo(9.911f,14.122999f)
            }
}

public val LucideIcons.All.CandyCaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CandyCane: ImageVector
    @Composable get() = CandyCaneDefinition.asImageVector()
