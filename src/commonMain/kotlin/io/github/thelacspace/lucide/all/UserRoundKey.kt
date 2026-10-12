package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,11.0)
                lineTo(19.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,13.0)
                lineTo(21.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(1.9997833967208862,17.954343795776367,3.728956937789917,15.172764778137207,6.4602532386779785,13.82515811920166)
                curveTo(9.191550254821777,12.477551460266113,12.451107025146484,12.797718048095703,14.868000030517578,14.651000022888184)
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
                moveTo(17.0,19.0)
                curveTo(16.996795654296875,19.71666145324707,17.377290725708008,20.380260467529297,17.99740982055664,20.739519119262695)
                curveTo(18.61752700805664,21.098779678344727,19.38247299194336,21.098779678344727,20.00259017944336,20.739519119262695)
                curveTo(20.622709274291992,20.380260467529297,21.003204345703125,19.71666145324707,21.0,19.0)
                curveTo(21.003204345703125,18.28333854675293,20.622709274291992,17.619739532470703,20.00259017944336,17.260480880737305)
                curveTo(19.38247299194336,16.901220321655273,18.61752700805664,16.901220321655273,17.99740982055664,17.260480880737305)
                curveTo(17.377290725708008,17.619739532470703,16.996795654296875,18.28333854675293,17.0,19.0)
            }
}

public val LucideIcons.All.UserRoundKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundKey: ImageVector
    @Composable get() = UserRoundKeyDefinition.asImageVector()
