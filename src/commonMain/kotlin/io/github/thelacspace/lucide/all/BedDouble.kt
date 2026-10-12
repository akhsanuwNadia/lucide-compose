package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedDouble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(2.0,12.0)
                curveTo(2.0,10.895430564880371,2.895430564880371,10.0,4.0,10.0)
                lineTo(20.0,10.0)
                curveTo(21.104570388793945,10.0,22.0,10.895430564880371,22.0,12.0)
                lineTo(22.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(4.0,6.0)
                curveTo(4.0,4.895430564880371,4.895430564880371,4.0,6.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                lineTo(22.0,18.0)
            }
}

public val LucideIcons.All.BedDoubleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedDouble: ImageVector
    @Composable get() = BedDoubleDefinition.asImageVector()
