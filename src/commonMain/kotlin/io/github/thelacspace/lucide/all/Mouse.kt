package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,2.0)
                lineTo(19.0,2.0)
                lineTo(19.0,22.0)
                lineTo(12.0,22.0)
                lineTo(12.0,22.0)
                lineTo(5.0,22.0)
                lineTo(5.0,2.0)
                lineTo(12.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,10.0)
            }
}

public val LucideIcons.All.MouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mouse: ImageVector
    @Composable get() = MouseDefinition.asImageVector()
