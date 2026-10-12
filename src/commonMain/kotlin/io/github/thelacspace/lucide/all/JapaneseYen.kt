package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("JapaneseYen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,9.5f)
                lineTo(12.0f,21.0f)
                moveTo(12.0f,9.5f)
                lineTo(6.0f,3.0f)
                moveTo(12.0f,9.5f)
                lineTo(18.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                lineTo(18.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(18.0f,11.0f)
            }
}

public val LucideIcons.All.JapaneseYenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.JapaneseYen: ImageVector
    @Composable get() = JapaneseYenDefinition.asImageVector()
