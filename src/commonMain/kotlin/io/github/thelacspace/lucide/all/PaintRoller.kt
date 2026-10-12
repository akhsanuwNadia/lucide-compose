package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintRoller") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,2.0)
                lineTo(16.0,2.0)
                lineTo(18.0,2.0)
                lineTo(18.0,8.0)
                lineTo(16.0,8.0)
                lineTo(4.0,8.0)
                lineTo(2.0,8.0)
                lineTo(2.0,2.0)
                lineTo(4.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(10.0,14.0)
                curveTo(10.0,12.895430564880371,10.895430564880371,12.0,12.0,12.0)
                lineTo(20.0,12.0)
                curveTo(21.104570388793945,12.0,22.0,11.104569435119629,22.0,10.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(18.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                lineTo(11.0,16.0)
                lineTo(12.0,16.0)
                lineTo(12.0,22.0)
                lineTo(11.0,22.0)
                lineTo(9.0,22.0)
                lineTo(8.0,22.0)
                lineTo(8.0,16.0)
                lineTo(9.0,16.0)
                close()
            }
}

public val LucideIcons.All.PaintRollerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintRoller: ImageVector
    @Composable get() = PaintRollerDefinition.asImageVector()
