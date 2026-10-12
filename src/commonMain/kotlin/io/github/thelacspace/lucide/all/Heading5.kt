package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading5") { strokeWidth ->
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
                moveTo(17.0f,13.0f)
                lineTo(17.0f,10.0f)
                lineTo(21.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.7f)
                curveTo(17.4f,17.900002f,17.8f,18.0f,18.3f,18.0f)
                curveTo(19.8f,18.0f,21.0f,16.9f,21.0f,15.5f)
                curveTo(21.0f,14.1f,19.8f,13.0f,18.3f,13.0f)
                lineTo(17.0f,13.0f)
            }
}

public val LucideIcons.All.Heading5Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading5: ImageVector
    @Composable get() = Heading5Definition.asImageVector()
