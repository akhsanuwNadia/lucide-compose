package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowOutUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(3.0,3.0)
                lineTo(9.0,3.0)
            }
}

public val LucideIcons.All.SquareArrowOutUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowOutUpLeft: ImageVector
    @Composable get() = SquareArrowOutUpLeftDefinition.asImageVector()
