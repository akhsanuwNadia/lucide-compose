package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(9.0,12.0)
                lineTo(15.0,6.0)
            }
}

public val LucideIcons.All.ChevronLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronLeft: ImageVector
    @Composable get() = ChevronLeftDefinition.asImageVector()
