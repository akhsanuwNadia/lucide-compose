package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(2.0,6.477152347564697,6.477152347564697,2.0,12.0,2.0)
                curveTo(17.52284812927246,2.0,22.0,6.477152347564697,22.0,12.0)
                curveTo(22.0,17.52284812927246,17.52284812927246,22.0,12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(2.0,22.0)
                lineTo(2.0,16.0)
            }
}

public val LucideIcons.All.CircleArrowOutDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutDownLeft: ImageVector
    @Composable get() = CircleArrowOutDownLeftDefinition.asImageVector()
