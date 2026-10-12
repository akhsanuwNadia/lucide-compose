package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HousePlug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(10.0,8.96399974822998)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(14.0,8.96399974822998)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                curveTo(15.552285194396973,12.0,16.0,12.447714805603027,16.0,13.0)
                lineTo(16.0,15.0)
                curveTo(16.0,16.104570388793945,15.104569435119629,17.0,14.0,17.0)
                lineTo(10.0,17.0)
                curveTo(8.895430564880371,17.0,8.0,16.104570388793945,8.0,15.0)
                lineTo(8.0,13.0)
                curveTo(8.0,12.447714805603027,8.447714805603027,12.0,9.0,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,10.0)
                curveTo(2.999858856201172,9.411126136779785,3.259241819381714,8.852117538452148,3.7090001106262207,8.472000122070312)
                lineTo(10.708999633789062,2.4720001220703125)
                curveTo(11.454387664794922,1.8420276641845703,12.545611381530762,1.8420276641845703,13.290999412536621,2.4720001220703125)
                lineTo(20.291000366210938,8.472000122070312)
                curveTo(20.740758895874023,8.852118492126465,21.000141143798828,9.411126136779785,21.0,10.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(14.0,21.0)
                curveTo(12.895430564880371,21.0,12.0,20.104570388793945,12.0,19.0)
                lineTo(12.0,17.0)
            }
}

public val LucideIcons.All.HousePlugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HousePlug: ImageVector
    @Composable get() = HousePlugDefinition.asImageVector()
