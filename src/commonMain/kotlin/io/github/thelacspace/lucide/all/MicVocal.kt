package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicVocal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,7.60099983215332)
                lineTo(5.00600004196167,15.790999412536621)
                curveTo(4.714576721191406,16.18909454345703,4.75703763961792,16.7402400970459,5.105999946594238,17.088998794555664)
                lineTo(5.922999858856201,17.906999588012695)
                curveTo(6.27739143371582,18.26100730895996,6.839029312133789,18.298192977905273,7.236999988555908,17.993999481201172)
                lineTo(15.09000015258789,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,21.173999786376953)
                curveTo(15.5,20.5,14.371999740600586,20.0,13.0,20.0)
                curveTo(10.941999435424805,20.0,9.072000503540039,22.355998992919922,7.0,22.0)
                curveTo(4.927999973297119,21.643999099731445,4.224999904632568,18.631000518798828,5.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,7.0)
                curveTo(10.991987228393555,8.791654586791992,11.943225860595703,10.450651168823242,13.493522644042969,11.348799705505371)
                curveTo(15.043819427490234,12.2469482421875,16.956180572509766,12.2469482421875,18.50647735595703,11.348799705505371)
                curveTo(20.056774139404297,10.450651168823242,21.008012771606445,8.791654586791992,21.0,7.0)
                curveTo(21.008012771606445,5.208345413208008,20.056774139404297,3.549348831176758,18.50647735595703,2.651200532913208)
                curveTo(16.956180572509766,1.7530521154403687,15.043819427490234,1.7530521154403687,13.493522644042969,2.651200532913208)
                curveTo(11.943225860595703,3.549348831176758,10.991987228393555,5.208345413208008,11.0,7.0)
            }
}

public val LucideIcons.All.MicVocalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicVocal: ImageVector
    @Composable get() = MicVocalDefinition.asImageVector()
