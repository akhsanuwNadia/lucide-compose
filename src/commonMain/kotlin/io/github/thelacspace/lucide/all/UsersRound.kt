package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsersRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                curveTo(17.980302810668945,16.595687866210938,14.404356956481934,13.035696983337402,10.0,13.035696983337402)
                curveTo(5.595643043518066,13.035696983337402,2.0196967124938965,16.595687866210938,2.0,21.0)
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
            lucidePath(strokeWidth) {
                moveTo(22.0,20.0)
                curveTo(22.0,16.630001068115234,20.0,13.5,18.0,12.0)
                curveTo(19.335128784179688,10.99831485748291,20.082380294799805,9.396466255187988,19.99201774597168,7.729799747467041)
                curveTo(19.901657104492188,6.063133239746094,18.985599517822266,4.551464557647705,17.549999237060547,3.6999998092651367)
            }
}

public val LucideIcons.All.UsersRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsersRound: ImageVector
    @Composable get() = UsersRoundDefinition.asImageVector()
