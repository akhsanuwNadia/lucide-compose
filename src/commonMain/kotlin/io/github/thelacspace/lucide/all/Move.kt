package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Move") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                lineTo(12.0f,22.0f)
                lineTo(9.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(22.0f,12.0f)
                lineTo(19.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(2.0f,12.0f)
                lineTo(5.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(12.0f,2.0f)
                lineTo(15.0f,5.0f)
            }
}

public val LucideIcons.All.MoveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Move: ImageVector
    @Composable get() = MoveDefinition.asImageVector()
