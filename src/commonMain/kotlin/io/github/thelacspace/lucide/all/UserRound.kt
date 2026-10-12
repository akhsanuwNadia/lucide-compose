package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,8.0)
                curveTo(6.991987228393555,9.791654586791992,7.943225860595703,11.450651168823242,9.493522644042969,12.348799705505371)
                curveTo(11.043819427490234,13.2469482421875,12.956180572509766,13.2469482421875,14.506477355957031,12.348799705505371)
                curveTo(16.056774139404297,11.450651168823242,17.008012771606445,9.791654586791992,17.0,8.0)
                curveTo(17.008012771606445,6.208345413208008,16.056774139404297,4.549348831176758,14.506477355957031,3.651200532913208)
                curveTo(12.956180572509766,2.753052234649658,11.043819427490234,2.753052234649658,9.493522644042969,3.651200532913208)
                curveTo(7.943225860595703,4.549348831176758,6.991987228393555,6.208345413208008,7.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,21.0)
                curveTo(19.980302810668945,16.595687866210938,16.404356002807617,13.035696983337402,12.0,13.035696983337402)
                curveTo(7.595643043518066,13.035696983337402,4.0196967124938965,16.595687866210938,4.0,21.0)
            }
}

public val LucideIcons.All.UserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRound: ImageVector
    @Composable get() = UserRoundDefinition.asImageVector()
