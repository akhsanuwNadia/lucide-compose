package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.7f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,12.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(19.1f,19.1f)
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
}

public val LucideIcons.All.FolderSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSearch: ImageVector
    @Composable get() = FolderSearchDefinition.asImageVector()
