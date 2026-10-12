package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SaveAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,5.0)
                curveTo(10.0,5.5522847175598145,10.447714805603027,6.0,11.0,6.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,18.0)
                lineTo(18.0,12.0)
                curveTo(18.0,11.447714805603027,17.552284240722656,11.0,17.0,11.0)
                lineTo(11.0,11.0)
                curveTo(10.447714805603027,11.0,10.0,11.447714805603027,10.0,12.0)
                lineTo(10.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                curveTo(6.895430564880371,18.0,6.0,17.104570388793945,6.0,16.0)
                lineTo(6.0,4.0)
                curveTo(6.0,2.895430564880371,6.895430564880371,2.0,8.0,2.0)
                lineTo(17.172000885009766,2.0)
                curveTo(17.702390670776367,2.0001134872436523,18.211015701293945,2.2109012603759766,18.586000442504883,2.5859999656677246)
                lineTo(21.41400146484375,5.414000034332275)
                curveTo(21.789098739624023,5.788985729217529,21.999887466430664,6.297610759735107,22.0,6.828000068664551)
                lineTo(22.0,16.0)
                curveTo(22.0000057220459,16.532169342041016,21.787919998168945,17.04239845275879,21.410682678222656,17.417760848999023)
                curveTo(21.033443450927734,17.793123245239258,20.52216339111328,18.002660751342773,19.989999771118164,18.0)
                close()
            }
}

public val LucideIcons.All.SaveAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SaveAll: ImageVector
    @Composable get() = SaveAllDefinition.asImageVector()
