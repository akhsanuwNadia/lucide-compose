package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(7.0,7.0)
                lineTo(17.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,17.0)
                lineTo(7.0,7.0)
            }
}

public val LucideIcons.All.ArrowUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpLeft: ImageVector
    @Composable get() = ArrowUpLeftDefinition.asImageVector()
