package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("House") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,21.0)
                lineTo(15.0,13.0)
                curveTo(15.0,12.447714805603027,14.552285194396973,12.0,14.0,12.0)
                lineTo(10.0,12.0)
                curveTo(9.447714805603027,12.0,9.0,12.447714805603027,9.0,13.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                curveTo(2.999858856201172,9.411126136779785,3.259241819381714,8.852117538452148,3.7090001106262207,8.472000122070312)
                lineTo(10.708999633789062,2.4720001220703125)
                curveTo(11.454387664794922,1.8420276641845703,12.545611381530762,1.8420276641845703,13.290999412536621,2.4720001220703125)
                lineTo(20.291000366210938,8.472000122070312)
                curveTo(20.740758895874023,8.852118492126465,21.000141143798828,9.411126136779785,21.0,10.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                close()
            }
}

public val LucideIcons.All.HouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.House: ImageVector
    @Composable get() = HouseDefinition.asImageVector()
