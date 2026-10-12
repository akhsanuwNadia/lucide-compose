package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlassWater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.116f,4.104f)
                curveTo(5.0865455f,3.8223202f,5.1779137f,3.541361f,5.3674173f,3.3308864f)
                curveTo(5.5569205f,3.1204119f,5.8267846f,3.0001636f,6.11f,3.0f)
                lineTo(17.89f,3.0f)
                curveTo(18.173409f,3.000134f,18.44345f,3.1205175f,18.632988f,3.3312213f)
                curveTo(18.822527f,3.541925f,18.913757f,3.8231575f,18.883999f,4.105f)
                lineTo(17.19f,20.21f)
                curveTo(17.082516f,21.22802f,16.223679f,22.00054f,15.2f,22.0f)
                lineTo(8.8f,22.0f)
                curveTo(7.7725f,22.005678f,6.907873f,21.231836f,6.8f,20.21f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(7.7777777f,10.666667f,10.222222f,10.666667f,12.0f,12.0f)
                curveTo(13.777778f,13.333333f,16.222221f,13.333333f,18.0f,12.0f)
            }
}

public val LucideIcons.All.GlassWaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlassWater: ImageVector
    @Composable get() = GlassWaterDefinition.asImageVector()
