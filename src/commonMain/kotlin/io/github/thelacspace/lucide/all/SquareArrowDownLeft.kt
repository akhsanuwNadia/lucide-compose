package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(9.0,15.0)
                lineTo(15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(9.0,9.0)
            }
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
}

public val LucideIcons.All.SquareArrowDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowDownLeft: ImageVector
    @Composable get() = SquareArrowDownLeftDefinition.asImageVector()
