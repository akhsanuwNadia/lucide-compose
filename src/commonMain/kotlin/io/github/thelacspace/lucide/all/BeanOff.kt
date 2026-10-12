package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeanOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                curveTo(8.359999656677246,9.640000343322754,7.479000091552734,9.954000473022461,6.5980000495910645,10.164999961853027)
                curveTo(3.639238119125366,10.873586654663086,1.6791616678237915,13.684536933898926,2.037071704864502,16.705839157104492)
                curveTo(2.394981861114502,19.727142333984375,4.957572937011719,22.00232696533203,8.0,22.0)
                curveTo(11.714008331298828,22.004676818847656,15.276782035827637,20.529184341430664,17.899999618530273,17.899999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(10.75,5.0929999351501465)
                curveTo(12.074759483337402,2.6986398696899414,14.851705551147461,1.5039422512054443,17.501094818115234,2.188544511795044)
                curveTo(20.15048599243164,2.8731467723846436,22.00103187561035,5.263588905334473,22.0,8.0)
                curveTo(22.0,10.41100025177002,21.389999389648438,12.680000305175781,20.316999435424805,14.65999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(5.341000080108643,10.619999885559082)
                curveTo(5.875041961669922,11.826181411743164,6.969426155090332,12.69151496887207,8.266250610351562,12.933008193969727)
                curveTo(9.56307601928711,13.174500465393066,10.895584106445312,12.761099815368652,11.82800006866455,11.82800006866455)
                moveTo(10.619999885559082,5.341000080108643)
                curveTo(11.528884887695312,5.744970798492432,12.255475044250488,6.471917152404785,12.659000396728516,7.38100004196167)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.BeanOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeanOff: ImageVector
    @Composable get() = BeanOffDefinition.asImageVector()
