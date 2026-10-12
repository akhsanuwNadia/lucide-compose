package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(20f, 15f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(12f, 18f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 16f)
                lineToRelative(6f, -12f)
                lineToRelative(5.115f, 10.23f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.SpellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck: ImageVector
    @Composable get() = SpellCheckDefinition.asImageVector()
