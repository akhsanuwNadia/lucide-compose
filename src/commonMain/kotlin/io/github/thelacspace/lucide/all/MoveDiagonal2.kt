package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDiagonal2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,13.0f)
                lineTo(19.0f,19.0f)
                lineTo(13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(5.0f,5.0f)
                lineTo(11.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,5.0f)
                lineTo(19.0f,19.0f)
            }
}

public val LucideIcons.All.MoveDiagonal2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDiagonal2: ImageVector
    @Composable get() = MoveDiagonal2Definition.asImageVector()
