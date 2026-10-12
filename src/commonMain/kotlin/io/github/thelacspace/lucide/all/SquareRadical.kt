package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareRadical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(9.0,12.0)
                lineTo(11.0,17.0)
                lineTo(13.0,7.0)
                lineTo(17.0,7.0)
            }
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
}

public val LucideIcons.All.SquareRadicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareRadical: ImageVector
    @Composable get() = SquareRadicalDefinition.asImageVector()
