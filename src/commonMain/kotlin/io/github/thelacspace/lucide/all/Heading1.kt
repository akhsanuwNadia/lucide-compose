package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                lineTo(20.0,10.0)
                lineTo(20.0,18.0)
            }
}

public val LucideIcons.All.Heading1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading1: ImageVector
    @Composable get() = Heading1Definition.asImageVector()
