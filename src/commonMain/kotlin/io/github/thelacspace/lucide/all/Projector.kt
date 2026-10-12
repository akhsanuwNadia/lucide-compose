package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Projector") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(9.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,7.0f)
                lineTo(15.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                curveTo(5.9951925f,14.074993f,6.5659356f,15.070391f,7.496114f,15.60928f)
                curveTo(8.426291f,16.148169f,9.573709f,16.148169f,10.503886f,15.60928f)
                curveTo(11.434065f,15.070391f,12.004807f,14.074993f,12.0f,13.0f)
                curveTo(12.004807f,11.925007f,11.434065f,10.929609f,10.503886f,10.39072f)
                curveTo(9.573709f,9.851831f,8.426291f,9.851831f,7.496114f,10.39072f)
                curveTo(6.5659356f,10.929609f,5.9951925f,11.925007f,6.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.83f,12.0f)
                lineTo(20.0f,12.0f)
                curveTo(21.10457f,12.0f,22.0f,12.895431f,22.0f,14.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,14.0f)
                curveTo(2.0f,12.895431f,2.8954306f,12.0f,4.0f,12.0f)
                lineTo(6.17f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(18.0f,16.0f)
            }
}

public val LucideIcons.All.ProjectorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Projector: ImageVector
    @Composable get() = ProjectorDefinition.asImageVector()
