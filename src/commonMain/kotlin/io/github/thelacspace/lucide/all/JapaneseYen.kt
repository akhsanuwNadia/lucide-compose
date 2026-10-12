package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("JapaneseYen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,9.5)
                lineTo(12.0,21.0)
                moveTo(12.0,9.5)
                lineTo(6.0,3.0)
                moveTo(12.0,9.5)
                lineTo(18.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                lineTo(18.0,11.0)
            }
}

public val LucideIcons.All.JapaneseYenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.JapaneseYen: ImageVector
    @Composable get() = JapaneseYenDefinition.asImageVector()
