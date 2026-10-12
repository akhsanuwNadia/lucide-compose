package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextAlignJustifyEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
}

public val LucideIcons.All.TextAlignJustifyEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextAlignJustifyEnd: ImageVector
    @Composable get() = TextAlignJustifyEndDefinition.asImageVector()
