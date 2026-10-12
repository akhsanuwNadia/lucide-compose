package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PillBottle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                lineTo(14.0,11.0)
                curveTo(13.447714805603027,11.0,13.0,11.447714805603027,13.0,12.0)
                lineTo(13.0,17.0)
                curveTo(13.0,17.552284240722656,13.447714805603027,18.0,14.0,18.0)
                lineTo(18.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                lineTo(6.0,20.0)
                curveTo(6.0,21.104570388793945,6.895430564880371,22.0,8.0,22.0)
                lineTo(16.0,22.0)
                curveTo(17.104570388793945,22.0,18.0,21.104570388793945,18.0,20.0)
                lineTo(18.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(19.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,7.0)
                lineTo(19.0,7.0)
                lineTo(5.0,7.0)
                lineTo(4.0,7.0)
                lineTo(4.0,2.0)
                lineTo(5.0,2.0)
                close()
            }
}

public val LucideIcons.All.PillBottleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PillBottle: ImageVector
    @Composable get() = PillBottleDefinition.asImageVector()
