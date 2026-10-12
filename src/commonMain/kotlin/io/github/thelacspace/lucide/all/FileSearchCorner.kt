package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSearchCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.1f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.295f,6.2939997f)
                curveTo(19.74804f,6.745938f,20.001835f,7.3600864f,20.0f,8.0f)
                lineTo(20.0f,11.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,22.0f)
                lineTo(18.119999f,19.119999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,17.0f)
                curveTo(12.995193f,18.074993f,13.565935f,19.07039f,14.496114f,19.60928f)
                curveTo(15.426291f,20.148169f,16.573708f,20.148169f,17.503887f,19.60928f)
                curveTo(18.434065f,19.07039f,19.004808f,18.074993f,19.0f,17.0f)
                curveTo(19.004808f,15.925007f,18.434065f,14.929609f,17.503887f,14.39072f)
                curveTo(16.573708f,13.851831f,15.426291f,13.851831f,14.496114f,14.39072f)
                curveTo(13.565935f,14.929609f,12.995193f,15.925007f,13.0f,17.0f)
            }
}

public val LucideIcons.All.FileSearchCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSearchCorner: ImageVector
    @Composable get() = FileSearchCornerDefinition.asImageVector()
