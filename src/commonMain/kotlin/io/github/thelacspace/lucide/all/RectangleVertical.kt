package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(16.0,2.0)
                lineTo(18.0,2.0)
                lineTo(18.0,22.0)
                lineTo(16.0,22.0)
                lineTo(8.0,22.0)
                lineTo(6.0,22.0)
                lineTo(6.0,2.0)
                lineTo(8.0,2.0)
                close()
            }
}

public val LucideIcons.All.RectangleVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleVertical: ImageVector
    @Composable get() = RectangleVerticalDefinition.asImageVector()
