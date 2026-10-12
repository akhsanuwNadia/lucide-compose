package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesColumnDecreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(5.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,21.0)
                lineTo(12.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,15.0)
            }
}

public val LucideIcons.All.ChartNoAxesColumnDecreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesColumnDecreasing: ImageVector
    @Composable get() = ChartNoAxesColumnDecreasingDefinition.asImageVector()
