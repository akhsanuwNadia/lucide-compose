package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesGantt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,5.0)
                lineTo(18.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(20.0,19.0)
            }
}

public val LucideIcons.All.ChartNoAxesGanttDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesGantt: ImageVector
    @Composable get() = ChartNoAxesGanttDefinition.asImageVector()
