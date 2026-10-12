package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Laptop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                curveTo(19.10457f,5.0f,20.0f,5.8954306f,20.0f,7.0f)
                lineTo(20.0f,15.526f)
                curveTo(19.999865f,15.837428f,20.07246f,16.144585f,20.212f,16.423f)
                lineTo(21.28f,18.550001f)
                curveTo(21.43678f,18.86111f,21.420347f,19.23139f,21.236626f,19.52739f)
                curveTo(21.052902f,19.823387f,20.728373f,20.002436f,20.380001f,20.000002f)
                lineTo(3.62f,20.000002f)
                curveTo(3.2716277f,20.002436f,2.9470983f,19.823387f,2.7633755f,19.52739f)
                curveTo(2.5796525f,19.23139f,2.5632198f,18.86111f,2.7199998f,18.550001f)
                lineTo(3.7879996f,16.423f)
                curveTo(3.9275403f,16.144585f,4.000135f,15.837428f,4.0f,15.526f)
                lineTo(4.0f,7.0f)
                curveTo(4.0f,5.8954306f,4.8954306f,5.0f,6.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.054f,15.987f)
                lineTo(3.946f,15.987f)
            }
}

public val LucideIcons.All.LaptopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Laptop: ImageVector
    @Composable get() = LaptopDefinition.asImageVector()
