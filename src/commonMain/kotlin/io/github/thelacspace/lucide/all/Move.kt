package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Move") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,19.0)
                lineTo(12.0,22.0)
                lineTo(9.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,9.0)
                lineTo(22.0,12.0)
                lineTo(19.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,9.0)
                lineTo(2.0,12.0)
                lineTo(5.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                lineTo(12.0,2.0)
                lineTo(15.0,5.0)
            }
}

public val LucideIcons.All.MoveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Move: ImageVector
    @Composable get() = MoveDefinition.asImageVector()
