package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tablets") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,7.0)
                curveTo(1.9919874668121338,8.791654586791992,2.943225860595703,10.450651168823242,4.493522644042969,11.348799705505371)
                curveTo(6.043819904327393,12.2469482421875,7.956180095672607,12.2469482421875,9.506477355957031,11.348799705505371)
                curveTo(11.056774139404297,10.450651168823242,12.008012771606445,8.791654586791992,12.0,7.0)
                curveTo(12.008012771606445,5.208345413208008,11.056774139404297,3.549348831176758,9.506477355957031,2.651200532913208)
                curveTo(7.956180095672607,1.7530521154403687,6.043819904327393,1.7530521154403687,4.493522644042969,2.651200532913208)
                curveTo(2.943225860595703,3.549348831176758,1.9919874668121338,5.208345413208008,2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                curveTo(11.991987228393555,18.791654586791992,12.943225860595703,20.450651168823242,14.493522644042969,21.348798751831055)
                curveTo(16.043819427490234,22.2469482421875,17.956180572509766,22.2469482421875,19.50647735595703,21.348798751831055)
                curveTo(21.056774139404297,20.450651168823242,22.008012771606445,18.791654586791992,22.0,17.0)
                curveTo(22.008012771606445,15.208345413208008,21.056774139404297,13.549348831176758,19.50647735595703,12.651200294494629)
                curveTo(17.956180572509766,11.7530517578125,16.043819427490234,11.7530517578125,14.493522644042969,12.651200294494629)
                curveTo(12.943225860595703,13.549348831176758,11.991987228393555,15.208345413208008,12.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4600000381469727,10.539999961853027)
                lineTo(10.539999961853027,3.4600000381469727)
            }
}

public val LucideIcons.All.TabletsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tablets: ImageVector
    @Composable get() = TabletsDefinition.asImageVector()
