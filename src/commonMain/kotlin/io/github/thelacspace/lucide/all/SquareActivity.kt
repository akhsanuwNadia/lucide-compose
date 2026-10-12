package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareActivity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,12.0)
                lineTo(15.0,12.0)
                lineTo(13.0,17.0)
                lineTo(11.0,7.0)
                lineTo(9.0,12.0)
                lineTo(7.0,12.0)
            }
}

public val LucideIcons.All.SquareActivityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareActivity: ImageVector
    @Composable get() = SquareActivityDefinition.asImageVector()
