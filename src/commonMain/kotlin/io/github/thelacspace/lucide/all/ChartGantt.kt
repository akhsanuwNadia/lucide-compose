package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartGantt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,6.0)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(15.0,11.0)
            }
}

public val LucideIcons.All.ChartGanttDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartGantt: ImageVector
    @Composable get() = ChartGanttDefinition.asImageVector()
