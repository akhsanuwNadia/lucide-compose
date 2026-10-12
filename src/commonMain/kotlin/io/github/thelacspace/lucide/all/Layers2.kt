package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Layers2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,13.74f)
                curveTo(12.381198f,14.097265f,11.618802f,14.097265f,11.0f,13.74f)
                lineTo(2.5f,8.87f)
                curveTo(2.1866896f,8.692439f,1.9930519f,8.3601265f,1.9930519f,8.0f)
                curveTo(1.9930519f,7.639873f,2.1866896f,7.3075614f,2.5f,7.13f)
                lineTo(11.0f,2.26f)
                curveTo(11.618802f,1.9027344f,12.381198f,1.9027344f,13.0f,2.26f)
                lineTo(21.5f,7.13f)
                curveTo(21.81331f,7.3075614f,22.006948f,7.639873f,22.006948f,8.0f)
                curveTo(22.006948f,8.3601265f,21.81331f,8.692439f,21.5f,8.87f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.285f)
                lineTo(21.5f,15.13f)
                curveTo(21.81331f,15.307561f,22.006948f,15.6398735f,22.006948f,16.0f)
                curveTo(22.006948f,16.360128f,21.81331f,16.69244f,21.5f,16.87f)
                lineTo(13.0f,21.74f)
                curveTo(12.381198f,22.097265f,11.618802f,22.097265f,11.0f,21.74f)
                lineTo(2.5f,16.869999f)
                curveTo(2.1866896f,16.692438f,1.9930519f,16.360126f,1.9930519f,15.999999f)
                curveTo(1.9930519f,15.639873f,2.1866896f,15.30756f,2.5f,15.129999f)
                lineTo(4.0f,14.284999f)
            }
}

public val LucideIcons.All.Layers2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Layers2: ImageVector
    @Composable get() = Layers2Definition.asImageVector()
