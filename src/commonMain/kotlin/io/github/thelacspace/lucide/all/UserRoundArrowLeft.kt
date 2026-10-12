package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(1.9999165534973145,18.00014305114746,3.678114414215088,15.252351760864258,6.346956729888916,13.882525444030762)
                curveTo(9.015799522399902,12.512700080871582,12.226698875427246,12.751083374023438,14.663999557495117,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(16.0,19.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                curveTo(4.991987228393555,9.791654586791992,5.943225860595703,11.450651168823242,7.493522644042969,12.348799705505371)
                curveTo(9.043819427490234,13.2469482421875,10.956180572509766,13.2469482421875,12.506477355957031,12.348799705505371)
                curveTo(14.056774139404297,11.450651168823242,15.008012771606445,9.791654586791992,15.0,8.0)
                curveTo(15.008012771606445,6.208345413208008,14.056774139404297,4.549348831176758,12.506477355957031,3.651200532913208)
                curveTo(10.956180572509766,2.753052234649658,9.043819427490234,2.753052234649658,7.493522644042969,3.651200532913208)
                curveTo(5.943225860595703,4.549348831176758,4.991987228393555,6.208345413208008,5.0,8.0)
            }
}

public val LucideIcons.All.UserRoundArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundArrowLeft: ImageVector
    @Composable get() = UserRoundArrowLeftDefinition.asImageVector()
