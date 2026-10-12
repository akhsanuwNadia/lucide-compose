package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Italic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,4.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                lineTo(5.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                lineTo(9.0f,20.0f)
            }
}

public val LucideIcons.All.ItalicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Italic: ImageVector
    @Composable get() = ItalicDefinition.asImageVector()
