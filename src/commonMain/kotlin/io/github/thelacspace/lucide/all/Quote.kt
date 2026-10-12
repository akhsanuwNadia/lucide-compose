package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Quote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                curveTo(14.895430564880371,3.0,14.0,3.895430564880371,14.0,5.0)
                lineTo(14.0,11.0)
                curveTo(14.0,12.104569435119629,14.895430564880371,13.0,16.0,13.0)
                curveTo(16.552284240722656,13.0,17.0,13.447714805603027,17.0,14.0)
                lineTo(17.0,15.0)
                curveTo(17.0,16.104570388793945,16.104570388793945,17.0,15.0,17.0)
                curveTo(14.447714805603027,17.0,14.0,17.447715759277344,14.0,18.0)
                lineTo(14.0,20.0)
                curveTo(14.0,20.552284240722656,14.447714805603027,21.0,15.0,21.0)
                curveTo(18.313709259033203,21.0,21.0,18.313709259033203,21.0,15.0)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,11.0)
                curveTo(3.0,12.104569435119629,3.895430564880371,13.0,5.0,13.0)
                curveTo(5.5522847175598145,13.0,6.0,13.447714805603027,6.0,14.0)
                lineTo(6.0,15.0)
                curveTo(6.0,16.104570388793945,5.104569435119629,17.0,4.0,17.0)
                curveTo(3.4477152824401855,17.0,3.0,17.447715759277344,3.0,18.0)
                lineTo(3.0,20.0)
                curveTo(3.0,20.552284240722656,3.4477152824401855,21.0,4.0,21.0)
                curveTo(7.313708305358887,21.0,10.0,18.313709259033203,10.0,15.0)
                lineTo(10.0,5.0)
                curveTo(10.0,3.895430564880371,9.104569435119629,3.0,8.0,3.0)
                close()
            }
}

public val LucideIcons.All.QuoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Quote: ImageVector
    @Composable get() = QuoteDefinition.asImageVector()
