package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(12.0,16.0)
                lineTo(16.0,12.0)
            }
}

public val LucideIcons.All.SquareArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowDown: ImageVector
    @Composable get() = SquareArrowDownDefinition.asImageVector()
