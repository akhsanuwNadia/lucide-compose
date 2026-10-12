package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(14.5f,20.5f)
                lineTo(12.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                lineTo(10.0f,4.0f)
                lineTo(15.115f,14.23f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
}

public val LucideIcons.All.SpellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck: ImageVector
    @Composable get() = SpellCheckDefinition.asImageVector()
