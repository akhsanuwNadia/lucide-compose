package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(2.0,2.0)
                lineTo(8.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                curveTo(17.52284812927246,2.0,22.0,6.477152347564697,22.0,12.0)
                curveTo(22.0,17.52284812927246,17.52284812927246,22.0,12.0,22.0)
                curveTo(6.477152347564697,22.0,2.0,17.52284812927246,2.0,12.0)
            }
}

public val LucideIcons.All.CircleArrowOutUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutUpLeft: ImageVector
    @Composable get() = CircleArrowOutUpLeftDefinition.asImageVector()
