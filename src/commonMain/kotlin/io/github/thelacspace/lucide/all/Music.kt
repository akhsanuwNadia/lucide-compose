package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(9.0f,5.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,18.0f)
                curveTo(2.9951925f,19.074993f,3.5659356f,20.07039f,4.496114f,20.60928f)
                curveTo(5.426292f,21.148169f,6.573708f,21.148169f,7.503886f,20.60928f)
                curveTo(8.434065f,20.07039f,9.004807f,19.074993f,9.0f,18.0f)
                curveTo(9.004807f,16.925007f,8.434065f,15.929609f,7.503886f,15.39072f)
                curveTo(6.573708f,14.851831f,5.426292f,14.851831f,4.496114f,15.39072f)
                curveTo(3.5659356f,15.929609f,2.9951925f,16.925007f,3.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                curveTo(14.995193f,17.074993f,15.565935f,18.07039f,16.496113f,18.60928f)
                curveTo(17.426292f,19.148169f,18.573708f,19.148169f,19.503887f,18.60928f)
                curveTo(20.434065f,18.07039f,21.004808f,17.074993f,21.0f,16.0f)
                curveTo(21.004808f,14.925007f,20.434065f,13.929609f,19.503887f,13.39072f)
                curveTo(18.573708f,12.851831f,17.426292f,12.851831f,16.496113f,13.39072f)
                curveTo(15.565935f,13.929609f,14.995193f,14.925007f,15.0f,16.0f)
            }
}

public val LucideIcons.All.MusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music: ImageVector
    @Composable get() = MusicDefinition.asImageVector()
