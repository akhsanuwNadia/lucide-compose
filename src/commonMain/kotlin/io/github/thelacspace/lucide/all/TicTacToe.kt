package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicTacToe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 16f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 21f)
                lineToRelative(-5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 3f)
                lineTo(3f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                lineTo(3f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 5.0f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, -5.0f, 0f)
            }
}

public val LucideIcons.All.TicTacToeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicTacToe: ImageVector
    @Composable get() = TicTacToeDefinition.asImageVector()
