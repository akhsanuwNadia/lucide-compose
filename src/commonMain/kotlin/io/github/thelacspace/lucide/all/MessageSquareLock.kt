package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageSquareLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,8.5)
                lineTo(22.0,5.0)
                curveTo(22.0,3.895430564880371,21.104570388793945,3.0,20.0,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,21.285999298095703)
                curveTo(2.0000367164611816,21.573139190673828,2.1730220317840576,21.831989288330078,2.4383068084716797,21.94186782836914)
                curveTo(2.7035913467407227,22.051746368408203,3.0089428424835205,21.99102020263672,3.2119998931884766,21.788000106811523)
                lineTo(5.413999557495117,19.586000442504883)
                curveTo(5.788985252380371,19.210901260375977,6.297610282897949,19.000112533569336,6.828000068664551,19.0)
                lineTo(10.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(20.0,13.0)
                curveTo(19.995075225830078,11.898921966552734,19.101089477539062,11.00892448425293,18.0,11.00892448425293)
                curveTo(16.898910522460938,11.00892448425293,16.004924774169922,11.898921966552734,16.0,13.0)
                lineTo(16.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(21.0,15.0)
                lineTo(22.0,15.0)
                lineTo(22.0,20.0)
                lineTo(21.0,20.0)
                lineTo(15.0,20.0)
                lineTo(14.0,20.0)
                lineTo(14.0,15.0)
                lineTo(15.0,15.0)
                close()
            }
}

public val LucideIcons.All.MessageSquareLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageSquareLock: ImageVector
    @Composable get() = MessageSquareLockDefinition.asImageVector()
