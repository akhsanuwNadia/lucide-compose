package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                curveTo(22.0,18.104570388793945,21.104570388793945,19.0,20.0,19.0)
                lineTo(6.828000068664551,19.0)
                curveTo(6.297610282897949,19.000112533569336,5.788985252380371,19.210901260375977,5.414000034332275,19.586000442504883)
                lineTo(3.2120001316070557,21.788000106811523)
                curveTo(3.0128726959228516,22.001991271972656,2.7017409801483154,22.069719314575195,2.4316818714141846,21.957862854003906)
                curveTo(2.1616225242614746,21.846006393432617,1.989500641822815,21.5781192779541,2.0,21.285999298095703)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(11.0,13.0)
                lineTo(15.0,9.0)
            }
}

public val LucideIcons.All.MessageSquareCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareCheck: ImageVector
    @Composable get() = MessageSquareCheckDefinition.asImageVector()
