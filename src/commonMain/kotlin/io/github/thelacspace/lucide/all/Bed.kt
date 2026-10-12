package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,4.0)
                lineTo(2.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(20.0,8.0)
                curveTo(21.104570388793945,8.0,22.0,8.895430564880371,22.0,10.0)
                lineTo(22.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(6.0,17.0)
            }
}

public val LucideIcons.All.BedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bed: ImageVector
    @Composable get() = BedDefinition.asImageVector()
