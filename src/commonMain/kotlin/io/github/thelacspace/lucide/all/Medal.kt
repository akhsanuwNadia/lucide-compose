package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Medal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.210000038146973,15.0)
                lineTo(2.6600000858306885,7.139999866485596)
                curveTo(2.2589452266693115,6.446782112121582,2.3100955486297607,5.581160545349121,2.7899999618530273,4.939999580383301)
                lineTo(4.400000095367432,2.799999952316284)
                curveTo(4.777709007263184,2.2963883876800537,5.370485305786133,2.0,6.0,2.0)
                lineTo(18.0,2.0)
                curveTo(18.629514694213867,1.9999998807907104,19.222291946411133,2.2963881492614746,19.600000381469727,2.799999952316284)
                lineTo(21.200000762939453,4.940000057220459)
                curveTo(21.683080673217773,5.579105854034424,21.73817253112793,6.444815158843994,21.34000015258789,7.140000343322754)
                lineTo(16.790000915527344,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(5.119999885559082,2.200000047683716)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(18.880001068115234,2.1999998092651367)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                lineTo(16.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                curveTo(6.991987228393555,18.791654586791992,7.943225860595703,20.450651168823242,9.493522644042969,21.348798751831055)
                curveTo(11.043819427490234,22.2469482421875,12.956180572509766,22.2469482421875,14.506477355957031,21.348798751831055)
                curveTo(16.056774139404297,20.450651168823242,17.008012771606445,18.791654586791992,17.0,17.0)
                curveTo(17.008012771606445,15.208345413208008,16.056774139404297,13.549348831176758,14.506477355957031,12.651200294494629)
                curveTo(12.956180572509766,11.7530517578125,11.043819427490234,11.7530517578125,9.493522644042969,12.651200294494629)
                curveTo(7.943225860595703,13.549348831176758,6.991987228393555,15.208345413208008,7.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,16.0)
                lineTo(11.5,16.0)
            }
}

public val LucideIcons.All.MedalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Medal: ImageVector
    @Composable get() = MedalDefinition.asImageVector()
