package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronLast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(13.0,12.0)
                lineTo(7.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                lineTo(17.0,18.0)
            }
}

public val LucideIcons.All.ChevronLastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronLast: ImageVector
    @Composable get() = ChevronLastDefinition.asImageVector()
