package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseWifi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.5,13.866000175476074)
                curveTo(10.963669776916504,12.698918342590332,13.041009902954102,12.703073501586914,14.5,13.87600040435791)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.010000228881836,17.0)
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
            lucidePath(strokeWidth) {
                moveTo(7.0,10.753999710083008)
                curveTo(9.922662734985352,8.413996696472168,14.077337265014648,8.413996696472168,17.0,10.753999710083008)
            }
}

public val LucideIcons.All.HouseWifiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseWifi: ImageVector
    @Composable get() = HouseWifiDefinition.asImageVector()
