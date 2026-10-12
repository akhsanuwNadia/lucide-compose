package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicTacToe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(3.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,5.5f)
                curveTo(15.995994f,6.3958273f,16.471613f,7.2253256f,17.246761f,7.6744f)
                curveTo(18.02191f,8.123474f,18.97809f,8.123474f,19.753239f,7.6744f)
                curveTo(20.528387f,7.2253256f,21.004005f,6.3958273f,21.0f,5.5f)
                curveTo(21.004005f,4.6041727f,20.528387f,3.7746744f,19.753239f,3.3256004f)
                curveTo(18.97809f,2.876526f,18.02191f,2.876526f,17.246761f,3.3256004f)
                curveTo(16.471613f,3.7746744f,15.995994f,4.6041727f,16.0f,5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,18.5f)
                curveTo(2.9959936f,19.395828f,3.471613f,20.225325f,4.2467613f,20.6744f)
                curveTo(5.0219097f,21.123474f,5.9780903f,21.123474f,6.7532387f,20.6744f)
                curveTo(7.528387f,20.225325f,8.004006f,19.395828f,8.0f,18.5f)
                curveTo(8.004006f,17.604172f,7.528387f,16.774675f,6.7532387f,16.3256f)
                curveTo(5.9780903f,15.876526f,5.0219097f,15.876526f,4.2467613f,16.3256f)
                curveTo(3.471613f,16.774675f,2.9959936f,17.604172f,3.0f,18.5f)
            }
}

public val LucideIcons.All.TicTacToeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicTacToe: ImageVector
    @Composable get() = TicTacToeDefinition.asImageVector()
