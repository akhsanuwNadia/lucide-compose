package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StretchHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,10.0)
                lineTo(20.0,10.0)
                lineTo(4.0,10.0)
                lineTo(2.0,10.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(20.0,14.0)
                lineTo(22.0,14.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
}

public val LucideIcons.All.StretchHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StretchHorizontal: ImageVector
    @Composable get() = StretchHorizontalDefinition.asImageVector()
