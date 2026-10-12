package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotLeftHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(2.9951925f,13.074993f,3.5659356f,14.070391f,4.496114f,14.60928f)
                curveTo(5.426292f,15.148169f,6.573708f,15.148169f,7.503886f,14.60928f)
                curveTo(8.434065f,14.070391f,9.004807f,13.074993f,9.0f,12.0f)
                curveTo(9.004807f,10.925007f,8.434065f,9.929609f,7.503886f,9.39072f)
                curveTo(6.573708f,8.851831f,5.426292f,8.851831f,4.496114f,9.39072f)
                curveTo(3.5659356f,9.929609f,2.9951925f,10.925007f,3.0f,12.0f)
            }
}

public val LucideIcons.All.LineDotLeftHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotLeftHorizontal: ImageVector
    @Composable get() = LineDotLeftHorizontalDefinition.asImageVector()
