package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextAlignJustifyStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(13.0,19.0)
            }
}

public val LucideIcons.All.TextAlignJustifyStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextAlignJustifyStart: ImageVector
    @Composable get() = TextAlignJustifyStartDefinition.asImageVector()
