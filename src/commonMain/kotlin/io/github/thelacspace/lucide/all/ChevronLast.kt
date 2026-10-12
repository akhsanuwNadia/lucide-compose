package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronLast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(13.0f,12.0f)
                lineTo(7.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                lineTo(17.0f,18.0f)
            }
}

public val LucideIcons.All.ChevronLastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronLast: ImageVector
    @Composable get() = ChevronLastDefinition.asImageVector()
