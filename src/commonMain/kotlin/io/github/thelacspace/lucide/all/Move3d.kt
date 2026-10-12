package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Move3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(5.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,19.0)
                lineTo(11.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                lineTo(5.0,3.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                lineTo(21.0,19.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.Move3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Move3d: ImageVector
    @Composable get() = Move3dDefinition.asImageVector()
