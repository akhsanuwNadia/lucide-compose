package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartSpline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.0)
                curveTo(7.5,14.0,8.5,9.0,11.0,9.0)
                curveTo(13.0,9.0,13.0,12.0,15.0,12.0)
                curveTo(17.5,12.0,19.5,7.0,20.0,5.0)
            }
}

public val LucideIcons.All.ChartSplineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartSpline: ImageVector
    @Composable get() = ChartSplineDefinition.asImageVector()
