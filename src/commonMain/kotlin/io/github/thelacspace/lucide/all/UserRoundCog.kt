package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.305000305175781,19.530000686645508)
                lineTo(15.22800064086914,19.148000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(15.227999687194824,16.851999282836914)
                lineTo(14.304999351501465,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,15.227999687194824)
                lineTo(16.4689998626709,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,20.77199935913086)
                lineTo(16.4689998626709,21.695999145507812)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148000717163086,15.227999687194824)
                lineTo(19.5310001373291,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,21.695999145507812)
                lineTo(19.148000717163086,20.77199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(2.0002355575561523,18.446352005004883,3.219574213027954,16.046249389648438,5.281823635101318,14.540179252624512)
                curveTo(7.3440728187561035,13.034109115600586,10.00141429901123,12.603052139282227,12.434000015258789,13.380000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,16.851999282836914)
                lineTo(21.695999145507812,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,19.148000717163086)
                lineTo(21.695999145507812,19.5310001373291)
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
                moveTo(15.0,18.0)
                curveTo(14.995192527770996,19.074993133544922,15.565935134887695,20.070390701293945,16.496112823486328,20.60927963256836)
                curveTo(17.426292419433594,21.148168563842773,18.573707580566406,21.148168563842773,19.503887176513672,20.60927963256836)
                curveTo(20.434064865112305,20.070390701293945,21.00480842590332,19.074993133544922,21.0,18.0)
                curveTo(21.00480842590332,16.925006866455078,20.434064865112305,15.929609298706055,19.503887176513672,15.39072036743164)
                curveTo(18.573707580566406,14.851831436157227,17.426292419433594,14.851831436157227,16.496112823486328,15.39072036743164)
                curveTo(15.565935134887695,15.929609298706055,14.995192527770996,16.925006866455078,15.0,18.0)
            }
}

public val LucideIcons.All.UserRoundCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundCog: ImageVector
    @Composable get() = UserRoundCogDefinition.asImageVector()
