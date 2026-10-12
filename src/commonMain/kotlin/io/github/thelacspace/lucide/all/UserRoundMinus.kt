package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(1.9998276233673096,17.85512924194336,3.842226505279541,15.00189208984375,6.70859956741333,13.708012580871582)
                curveTo(9.574973106384277,12.41413402557373,12.933518409729004,12.91966724395752,15.291999816894531,15.0)
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
                moveTo(22.0,19.0)
                lineTo(16.0,19.0)
            }
}

public val LucideIcons.All.UserRoundMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundMinus: ImageVector
    @Composable get() = UserRoundMinusDefinition.asImageVector()
