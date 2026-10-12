package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Settings2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                lineTo(5.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,7.0f)
                lineTo(10.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.0f)
                curveTo(13.995193f,18.074993f,14.565935f,19.07039f,15.496114f,19.60928f)
                curveTo(16.426292f,20.148169f,17.573708f,20.148169f,18.503887f,19.60928f)
                curveTo(19.434065f,19.07039f,20.004808f,18.074993f,20.0f,17.0f)
                curveTo(20.004808f,15.925007f,19.434065f,14.929609f,18.503887f,14.39072f)
                curveTo(17.573708f,13.851831f,16.426292f,13.851831f,15.496114f,14.39072f)
                curveTo(14.565935f,14.929609f,13.995193f,15.925007f,14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                curveTo(3.9951925f,8.074993f,4.5659356f,9.070391f,5.496114f,9.60928f)
                curveTo(6.426292f,10.148169f,7.573708f,10.148169f,8.503886f,9.60928f)
                curveTo(9.434065f,9.070391f,10.004807f,8.074993f,10.0f,7.0f)
                curveTo(10.004807f,5.9250073f,9.434065f,4.9296093f,8.503886f,4.3907204f)
                curveTo(7.573708f,3.8518312f,6.426292f,3.8518312f,5.496114f,4.3907204f)
                curveTo(4.5659356f,4.9296093f,3.9951925f,5.9250073f,4.0f,7.0f)
            }
}

public val LucideIcons.All.Settings2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Settings2: ImageVector
    @Composable get() = Settings2Definition.asImageVector()
