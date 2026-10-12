package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading2") { strokeWidth ->
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
                moveTo(21.0,18.0)
                lineTo(17.0,18.0)
                curveTo(17.0,14.0,21.0,15.0,21.0,12.0)
                curveTo(21.0,10.5,19.0,9.5,17.0,11.0)
            }
}

public val LucideIcons.All.Heading2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading2: ImageVector
    @Composable get() = Heading2Definition.asImageVector()
