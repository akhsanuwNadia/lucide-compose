package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                curveTo(13.995193f,16.074993f,14.565935f,17.07039f,15.496114f,17.60928f)
                curveTo(16.426292f,18.148169f,17.573708f,18.148169f,18.503887f,17.60928f)
                curveTo(19.434065f,17.07039f,20.004808f,16.074993f,20.0f,15.0f)
                curveTo(20.004808f,13.925007f,19.434065f,12.929609f,18.503887f,12.39072f)
                curveTo(17.573708f,11.851831f,16.426292f,11.851831f,15.496114f,12.39072f)
                curveTo(14.565935f,12.929609f,13.995193f,13.925007f,14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,19.0f)
                lineTo(19.1f,17.1f)
            }
}

public val LucideIcons.All.TextSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextSearch: ImageVector
    @Composable get() = TextSearchDefinition.asImageVector()
