package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Italic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,4.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(5.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(9.0,20.0)
            }
}

public val LucideIcons.All.ItalicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Italic: ImageVector
    @Composable get() = ItalicDefinition.asImageVector()
