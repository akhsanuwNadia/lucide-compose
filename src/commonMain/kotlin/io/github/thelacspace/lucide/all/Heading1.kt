package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(4.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,12.0f)
                lineTo(20.0f,10.0f)
                lineTo(20.0f,18.0f)
            }
}

public val LucideIcons.All.Heading1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading1: ImageVector
    @Composable get() = Heading1Definition.asImageVector()
