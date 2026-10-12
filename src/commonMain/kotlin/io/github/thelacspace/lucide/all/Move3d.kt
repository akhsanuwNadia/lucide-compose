package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Move3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(5.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,19.0f)
                lineTo(11.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(5.0f,3.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                lineTo(21.0f,19.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.Move3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Move3d: ImageVector
    @Composable get() = Move3dDefinition.asImageVector()
