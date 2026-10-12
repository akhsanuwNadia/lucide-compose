package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWall") { strokeWidth ->
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
                moveTo(12.0,9.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,15.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(16.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                lineTo(21.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(8.0,9.0)
            }
}

public val LucideIcons.All.BrickWallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWall: ImageVector
    @Composable get() = BrickWallDefinition.asImageVector()
