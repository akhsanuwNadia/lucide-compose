package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLeo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                curveTo(10.0f,12.0f,7.0f,11.5f,7.0f,8.0f)
                curveTo(7.0123105f,5.2473044f,9.247277f,3.0223107f,12.0f,3.0223107f)
                curveTo(14.752723f,3.0223107f,16.98769f,5.2473044f,17.0f,8.0f)
                curveTo(17.0f,11.466f,14.0f,14.196f,14.0f,18.0f)
                curveTo(14.007386f,19.651617f,15.348366f,20.986614f,17.0f,20.986614f)
                curveTo(18.651634f,20.986614f,19.992613f,19.651617f,20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                curveTo(3.9951925f,17.074993f,4.5659356f,18.07039f,5.496114f,18.60928f)
                curveTo(6.426292f,19.148169f,7.573708f,19.148169f,8.503886f,18.60928f)
                curveTo(9.434065f,18.07039f,10.004807f,17.074993f,10.0f,16.0f)
                curveTo(10.004807f,14.925007f,9.434065f,13.929609f,8.503886f,13.39072f)
                curveTo(7.573708f,12.851831f,6.426292f,12.851831f,5.496114f,13.39072f)
                curveTo(4.5659356f,13.929609f,3.9951925f,14.925007f,4.0f,16.0f)
            }
}

public val LucideIcons.All.ZodiacLeoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLeo: ImageVector
    @Composable get() = ZodiacLeoDefinition.asImageVector()
