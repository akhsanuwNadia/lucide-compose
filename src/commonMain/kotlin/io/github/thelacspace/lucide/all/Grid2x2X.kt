package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Grid2x2X") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,20.0)
                curveTo(12.0,20.552284240722656,11.552285194396973,21.0,11.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,11.0)
                curveTo(21.0,11.552285194396973,20.552284240722656,12.0,20.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,16.5)
                lineTo(21.5,21.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,21.5)
                lineTo(21.5,16.5)
            }
}

public val LucideIcons.All.Grid2x2XDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Grid2x2X: ImageVector
    @Composable get() = Grid2x2XDefinition.asImageVector()
