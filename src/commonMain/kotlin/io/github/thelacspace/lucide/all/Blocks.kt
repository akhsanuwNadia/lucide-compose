package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blocks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(10.0,7.0)
                curveTo(10.0,6.4477152824401855,9.552285194396973,6.0,9.0,6.0)
                lineTo(4.0,6.0)
                curveTo(2.895430564880371,6.0,2.0,6.895430564880371,2.0,8.0)
                lineTo(2.0,20.0)
                curveTo(2.0,21.104570388793945,2.895430564880371,22.0,4.0,22.0)
                lineTo(16.0,22.0)
                curveTo(17.104570388793945,22.0,18.0,21.104570388793945,18.0,20.0)
                lineTo(18.0,15.0)
                curveTo(18.0,14.447714805603027,17.552284240722656,14.0,17.0,14.0)
                lineTo(2.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(21.0,2.0)
                lineTo(22.0,2.0)
                lineTo(22.0,10.0)
                lineTo(21.0,10.0)
                lineTo(15.0,10.0)
                lineTo(14.0,10.0)
                lineTo(14.0,2.0)
                lineTo(15.0,2.0)
                close()
            }
}

public val LucideIcons.All.BlocksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blocks: ImageVector
    @Composable get() = BlocksDefinition.asImageVector()
