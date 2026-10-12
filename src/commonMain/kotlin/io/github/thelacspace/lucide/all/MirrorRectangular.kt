package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRectangular") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,6.0)
                lineTo(8.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(8.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
}

public val LucideIcons.All.MirrorRectangularDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRectangular: ImageVector
    @Composable get() = MirrorRectangularDefinition.asImageVector()
