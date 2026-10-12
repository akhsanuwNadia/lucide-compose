package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingUpDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.82800006866455,14.82800006866455)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(21.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(12.0,12.0)
                lineTo(8.0,8.0)
                lineTo(2.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(21.0,3.0)
                lineTo(16.0,3.0)
            }
}

public val LucideIcons.All.TrendingUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingUpDown: ImageVector
    @Composable get() = TrendingUpDownDefinition.asImageVector()
