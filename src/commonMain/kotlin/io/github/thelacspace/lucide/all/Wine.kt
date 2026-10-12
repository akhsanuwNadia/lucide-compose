package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                curveTo(14.76142406463623,15.0,17.0,12.76142406463623,17.0,10.0)
                curveTo(17.0,8.0,16.5,6.0,15.0,2.0)
                lineTo(9.0,2.0)
                curveTo(7.5,6.0,7.0,8.0,7.0,10.0)
                curveTo(7.0,12.76142406463623,9.23857593536377,15.0,12.0,15.0)
                close()
            }
}

public val LucideIcons.All.WineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wine: ImageVector
    @Composable get() = WineDefinition.asImageVector()
