package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WholeWord") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.9951925f,13.074993f,4.5659356f,14.070391f,5.496114f,14.60928f)
                curveTo(6.426292f,15.148169f,7.573708f,15.148169f,8.503886f,14.60928f)
                curveTo(9.434065f,14.070391f,10.004807f,13.074993f,10.0f,12.0f)
                curveTo(10.004807f,10.925007f,9.434065f,9.929609f,8.503886f,9.39072f)
                curveTo(7.573708f,8.851831f,6.426292f,8.851831f,5.496114f,9.39072f)
                curveTo(4.5659356f,9.929609f,3.9951925f,10.925007f,4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(10.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.995193f,13.074993f,14.565935f,14.070391f,15.496114f,14.60928f)
                curveTo(16.426292f,15.148169f,17.573708f,15.148169f,18.503887f,14.60928f)
                curveTo(19.434065f,14.070391f,20.004808f,13.074993f,20.0f,12.0f)
                curveTo(20.004808f,10.925007f,19.434065f,9.929609f,18.503887f,9.39072f)
                curveTo(17.573708f,8.851831f,16.426292f,8.851831f,15.496114f,9.39072f)
                curveTo(14.565935f,9.929609f,13.995193f,10.925007f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,18.5f,21.5f,19.0f,21.0f,19.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.5f,19.0f,2.0f,18.5f,2.0f,18.0f)
                lineTo(2.0f,17.0f)
            }
}

public val LucideIcons.All.WholeWordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WholeWord: ImageVector
    @Composable get() = WholeWordDefinition.asImageVector()
