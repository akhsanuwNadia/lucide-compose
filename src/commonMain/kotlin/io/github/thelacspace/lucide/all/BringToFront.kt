package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BringToFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(14.0,8.0)
                lineTo(16.0,8.0)
                lineTo(16.0,16.0)
                lineTo(14.0,16.0)
                lineTo(10.0,16.0)
                lineTo(8.0,16.0)
                lineTo(8.0,8.0)
                lineTo(10.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(8.0,2.0)
                curveTo(9.104569435119629,2.0,10.0,2.895430564880371,10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                curveTo(14.0,21.104570388793945,14.895430564880371,22.0,16.0,22.0)
                lineTo(20.0,22.0)
                curveTo(21.104570388793945,22.0,22.0,21.104570388793945,22.0,20.0)
                lineTo(22.0,16.0)
                curveTo(22.0,14.895430564880371,21.104570388793945,14.0,20.0,14.0)
            }
}

public val LucideIcons.All.BringToFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BringToFront: ImageVector
    @Composable get() = BringToFrontDefinition.asImageVector()
