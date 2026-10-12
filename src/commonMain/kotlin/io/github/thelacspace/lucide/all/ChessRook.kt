package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessRook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                curveTo(5.0,18.895429611206055,5.895430564880371,18.0,7.0,18.0)
                lineTo(17.0,18.0)
                curveTo(18.104570388793945,18.0,19.0,18.895429611206055,19.0,20.0)
                lineTo(19.0,21.0)
                curveTo(19.0,21.552284240722656,18.552284240722656,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.4477152824401855,22.0,5.0,21.552284240722656,5.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,18.0)
                lineTo(16.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(6.0,7.0)
                curveTo(6.0,8.104569435119629,6.895430564880371,9.0,8.0,9.0)
                lineTo(16.0,9.0)
                curveTo(17.104570388793945,9.0,18.0,8.104569435119629,18.0,7.0)
                lineTo(18.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(8.0,9.0)
            }
}

public val LucideIcons.All.ChessRookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessRook: ImageVector
    @Composable get() = ChessRookDefinition.asImageVector()
