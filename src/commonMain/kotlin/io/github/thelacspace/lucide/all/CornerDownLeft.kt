package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,4.0)
                lineTo(20.0,11.0)
                curveTo(20.0,13.209138870239258,18.209138870239258,15.0,16.0,15.0)
                lineTo(4.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(4.0,15.0)
                lineTo(9.0,20.0)
            }
}

public val LucideIcons.All.CornerDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownLeft: ImageVector
    @Composable get() = CornerDownLeftDefinition.asImageVector()
