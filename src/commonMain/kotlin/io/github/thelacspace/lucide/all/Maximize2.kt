package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Maximize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,15.0)
            }
}

public val LucideIcons.All.Maximize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Maximize2: ImageVector
    @Composable get() = Maximize2Definition.asImageVector()
