package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListMusic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(21.0f,5.0f)
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

public val LucideIcons.All.ListMusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListMusic: ImageVector
    @Composable get() = ListMusicDefinition.asImageVector()
