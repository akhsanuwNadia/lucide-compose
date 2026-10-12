package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareKanban") { strokeWidth ->
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
                moveTo(8.0,7.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(16.0,16.0)
            }
}

public val LucideIcons.All.SquareKanbanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareKanban: ImageVector
    @Composable get() = SquareKanbanDefinition.asImageVector()
