package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scissors") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                curveTo(2.9951925f,7.0749927f,3.5659356f,8.070391f,4.496114f,8.60928f)
                curveTo(5.426292f,9.148169f,6.573708f,9.148169f,7.503886f,8.60928f)
                curveTo(8.434065f,8.070391f,9.004807f,7.0749927f,9.0f,6.0f)
                curveTo(9.004807f,4.9250073f,8.434065f,3.9296093f,7.503886f,3.3907204f)
                curveTo(6.573708f,2.8518312f,5.426292f,2.8518312f,4.496114f,3.3907204f)
                curveTo(3.5659356f,3.9296093f,2.9951925f,4.9250073f,3.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.12f,8.12f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                lineTo(8.12f,15.88f)
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
                moveTo(14.8f,14.8f)
                lineTo(20.0f,20.0f)
            }
}

public val LucideIcons.All.ScissorsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scissors: ImageVector
    @Composable get() = ScissorsDefinition.asImageVector()
