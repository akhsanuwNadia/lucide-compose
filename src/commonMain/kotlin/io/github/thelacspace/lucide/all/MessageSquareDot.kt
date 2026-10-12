package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.699999809265137,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,21.285999298095703)
                curveTo(2.0000367164611816,21.573139190673828,2.1730220317840576,21.831989288330078,2.4383068084716797,21.94186782836914)
                curveTo(2.7035913467407227,22.051746368408203,3.0089428424835205,21.99102020263672,3.2119998931884766,21.788000106811523)
                lineTo(5.413999557495117,19.586000442504883)
                curveTo(5.788985252380371,19.210901260375977,6.297610282897949,19.000112533569336,6.828000068664551,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,18.104570388793945,22.0,17.0)
                lineTo(22.0,12.300000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                curveTo(15.995192527770996,7.074992656707764,16.565935134887695,8.070390701293945,17.496112823486328,8.60927963256836)
                curveTo(18.426292419433594,9.148168563842773,19.573707580566406,9.148168563842773,20.503887176513672,8.60927963256836)
                curveTo(21.434064865112305,8.070390701293945,22.00480842590332,7.074992656707764,22.0,6.0)
                curveTo(22.00480842590332,4.925007343292236,21.434064865112305,3.9296092987060547,20.503887176513672,3.3907203674316406)
                curveTo(19.573707580566406,2.8518311977386475,18.426292419433594,2.8518311977386475,17.496112823486328,3.3907203674316406)
                curveTo(16.565935134887695,3.9296092987060547,15.995192527770996,4.925007343292236,16.0,6.0)
            }
}

public val LucideIcons.All.MessageSquareDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareDot: ImageVector
    @Composable get() = MessageSquareDotDefinition.asImageVector()
