package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Maximize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,15.0f)
            }
}

public val LucideIcons.All.Maximize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Maximize2: ImageVector
    @Composable get() = Maximize2Definition.asImageVector()
