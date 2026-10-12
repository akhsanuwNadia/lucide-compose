package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,18.0)
                lineTo(20.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.RectangleHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleHorizontal: ImageVector
    @Composable get() = RectangleHorizontalDefinition.asImageVector()
