package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cross") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                curveTo(2.895430564880371,9.0,2.0,9.895430564880371,2.0,11.0)
                lineTo(2.0,13.0)
                curveTo(2.0,14.104569435119629,2.895430564880371,15.0,4.0,15.0)
                lineTo(8.0,15.0)
                curveTo(8.552285194396973,15.0,9.0,15.447714805603027,9.0,16.0)
                lineTo(9.0,20.0)
                curveTo(9.0,21.104570388793945,9.895430564880371,22.0,11.0,22.0)
                lineTo(13.0,22.0)
                curveTo(14.104569435119629,22.0,15.0,21.104570388793945,15.0,20.0)
                lineTo(15.0,16.0)
                curveTo(15.0,15.447714805603027,15.447714805603027,15.0,16.0,15.0)
                lineTo(20.0,15.0)
                curveTo(21.104570388793945,15.0,22.0,14.104569435119629,22.0,13.0)
                lineTo(22.0,11.0)
                curveTo(22.0,9.895430564880371,21.104570388793945,9.0,20.0,9.0)
                lineTo(16.0,9.0)
                curveTo(15.447714805603027,9.0,15.0,8.552285194396973,15.0,8.0)
                lineTo(15.0,4.0)
                curveTo(15.0,2.895430564880371,14.104569435119629,2.0,13.0,2.0)
                lineTo(11.0,2.0)
                curveTo(9.895430564880371,2.0,9.0,2.895430564880371,9.0,4.0)
                lineTo(9.0,8.0)
                curveTo(9.0,8.552285194396973,8.552285194396973,9.0,8.0,9.0)
                close()
            }
}

public val LucideIcons.All.CrossDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cross: ImageVector
    @Composable get() = CrossDefinition.asImageVector()
