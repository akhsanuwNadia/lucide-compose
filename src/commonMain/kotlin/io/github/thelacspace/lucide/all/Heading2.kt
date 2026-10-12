package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading2") { strokeWidth ->
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
                moveTo(21.0f,18.0f)
                lineTo(17.0f,18.0f)
                curveTo(17.0f,14.0f,21.0f,15.0f,21.0f,12.0f)
                curveTo(21.0f,10.5f,19.0f,9.5f,17.0f,11.0f)
            }
}

public val LucideIcons.All.Heading2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading2: ImageVector
    @Composable get() = Heading2Definition.asImageVector()
