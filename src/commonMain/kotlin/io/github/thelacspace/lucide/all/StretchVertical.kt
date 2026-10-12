package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StretchVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(8.0,2.0)
                lineTo(10.0,2.0)
                lineTo(10.0,22.0)
                lineTo(8.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(16.0,22.0)
                lineTo(14.0,22.0)
                lineTo(14.0,2.0)
                lineTo(16.0,2.0)
                close()
            }
}

public val LucideIcons.All.StretchVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StretchVertical: ImageVector
    @Composable get() = StretchVerticalDefinition.asImageVector()
