package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquarePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                curveTo(22.0,18.104570388793945,21.104570388793945,19.0,20.0,19.0)
                lineTo(6.828000068664551,19.0)
                curveTo(6.297610282897949,19.000112533569336,5.788985252380371,19.210901260375977,5.414000034332275,19.586000442504883)
                lineTo(3.2120001316070557,21.788000106811523)
                curveTo(3.0089430809020996,21.99102020263672,2.7035915851593018,22.051746368408203,2.4383068084716797,21.94186782836914)
                curveTo(2.1730220317840576,21.831989288330078,2.0000367164611816,21.573139190673828,2.0,21.285999298095703)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(15.0,11.0)
            }
}

public val LucideIcons.All.MessageSquarePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquarePlus: ImageVector
    @Composable get() = MessageSquarePlusDefinition.asImageVector()
