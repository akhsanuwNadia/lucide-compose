package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacCapricorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,21.0f)
                curveTo(12.656855f,21.0f,14.0f,19.656855f,14.0f,18.0f)
                lineTo(14.0f,6.5f)
                curveTo(13.991383f,4.573113f,12.426906f,3.0156176f,10.5f,3.0156176f)
                curveTo(8.573094f,3.0156176f,7.0086174f,4.573113f,7.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(7.0f,6.0f)
                curveTo(7.0f,4.343146f,5.656854f,3.0f,4.0f,3.0f)
                lineTo(4.0f,3.0f)
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

public val LucideIcons.All.ZodiacCapricornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacCapricorn: ImageVector
    @Composable get() = ZodiacCapricornDefinition.asImageVector()
