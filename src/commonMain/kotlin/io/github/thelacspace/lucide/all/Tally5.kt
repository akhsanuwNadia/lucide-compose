package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tally5") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(4.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                lineTo(9.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,4.0f)
                lineTo(19.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(2.0f,18.0f)
            }
}

public val LucideIcons.All.Tally5Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tally5: ImageVector
    @Composable get() = Tally5Definition.asImageVector()
