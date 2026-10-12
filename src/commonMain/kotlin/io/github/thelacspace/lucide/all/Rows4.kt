package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rows4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,7.5f)
                lineTo(3.0f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.5f)
                lineTo(3.0f,16.5f)
            }
}

public val LucideIcons.All.Rows4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rows4: ImageVector
    @Composable get() = Rows4Definition.asImageVector()
