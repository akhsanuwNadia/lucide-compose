package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessRook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                curveTo(5.0f,18.89543f,5.8954306f,18.0f,7.0f,18.0f)
                lineTo(17.0f,18.0f)
                curveTo(18.10457f,18.0f,19.0f,18.89543f,19.0f,20.0f)
                lineTo(19.0f,21.0f)
                curveTo(19.0f,21.552284f,18.552284f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(5.4477153f,22.0f,5.0f,21.552284f,5.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,18.0f)
                lineTo(16.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(6.0f,7.0f)
                curveTo(6.0f,8.104569f,6.8954306f,9.0f,8.0f,9.0f)
                lineTo(16.0f,9.0f)
                curveTo(17.10457f,9.0f,18.0f,8.104569f,18.0f,7.0f)
                lineTo(18.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(18.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(8.0f,9.0f)
            }
}

public val LucideIcons.All.ChessRookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessRook: ImageVector
    @Composable get() = ChessRookDefinition.asImageVector()
