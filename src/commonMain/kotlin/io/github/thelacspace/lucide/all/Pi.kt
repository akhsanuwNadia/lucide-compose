package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,4.0)
                lineTo(9.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                curveTo(4.0,5.300000190734863,5.300000190734863,4.0,7.0,4.0)
                lineTo(20.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,20.0)
                curveTo(16.299999237060547,20.0,15.0,18.700000762939453,15.0,17.0)
                lineTo(15.0,4.0)
            }
}

public val LucideIcons.All.PiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pi: ImageVector
    @Composable get() = PiDefinition.asImageVector()
