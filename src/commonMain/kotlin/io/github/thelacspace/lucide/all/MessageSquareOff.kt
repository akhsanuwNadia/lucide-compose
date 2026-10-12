package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,19.0)
                lineTo(6.828000068664551,19.0)
                curveTo(6.297610282897949,19.000112533569336,5.788985252380371,19.210901260375977,5.414000034332275,19.586000442504883)
                lineTo(3.2120001316070557,21.788000106811523)
                curveTo(3.0128726959228516,22.001991271972656,2.7017409801483154,22.069719314575195,2.4316818714141846,21.957862854003906)
                curveTo(2.1616225242614746,21.846006393432617,1.989500641822815,21.5781192779541,2.0,21.285999298095703)
                lineTo(2.0,5.0)
                curveTo(1.9999858140945435,4.211087226867676,2.4637370109558105,3.4958763122558594,3.184000015258789,3.1740000247955322)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656000137329102,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                lineTo(22.0,16.3439998626709)
            }
}

public val LucideIcons.All.MessageSquareOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareOff: ImageVector
    @Composable get() = MessageSquareOffDefinition.asImageVector()
