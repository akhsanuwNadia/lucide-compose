package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Columns4") { strokeWidth ->
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
                moveTo(7.5,3.0)
                lineTo(7.5,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,3.0)
                lineTo(16.5,21.0)
            }
}

public val LucideIcons.All.Columns4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Columns4: ImageVector
    @Composable get() = Columns4Definition.asImageVector()
