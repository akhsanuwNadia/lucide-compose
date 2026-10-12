package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WashingMachine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                lineTo(17.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(19.0,2.0)
                lineTo(21.0,2.0)
                lineTo(21.0,22.0)
                lineTo(19.0,22.0)
                lineTo(5.0,22.0)
                lineTo(3.0,22.0)
                lineTo(3.0,2.0)
                lineTo(5.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,13.0)
                curveTo(6.991987228393555,14.791654586791992,7.943225860595703,16.450651168823242,9.493522644042969,17.348798751831055)
                curveTo(11.043819427490234,18.2469482421875,12.956180572509766,18.2469482421875,14.506477355957031,17.348798751831055)
                curveTo(16.056774139404297,16.450651168823242,17.008012771606445,14.791654586791992,17.0,13.0)
                curveTo(17.008012771606445,11.208345413208008,16.056774139404297,9.549348831176758,14.506477355957031,8.651200294494629)
                curveTo(12.956180572509766,7.753052234649658,11.043819427490234,7.753052234649658,9.493522644042969,8.651200294494629)
                curveTo(7.943225860595703,9.549348831176758,6.991987228393555,11.208345413208008,7.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                curveTo(13.376347541809082,17.993844985961914,14.488844871520996,16.876361846923828,14.488844871520996,15.5)
                curveTo(14.488844871520996,14.123638153076172,13.376347541809082,13.006155014038086,12.0,13.0)
                curveTo(10.623652458190918,12.993844985961914,9.511155128479004,11.876361846923828,9.511155128479004,10.5)
                curveTo(9.511155128479004,9.123638153076172,10.623652458190918,8.006155014038086,12.0,8.0)
            }
}

public val LucideIcons.All.WashingMachineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WashingMachine: ImageVector
    @Composable get() = WashingMachineDefinition.asImageVector()
