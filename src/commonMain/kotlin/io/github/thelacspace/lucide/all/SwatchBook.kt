package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwatchBook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                curveTo(10.990151405334473,19.20215606689453,9.202178001403809,20.98215103149414,7.0,20.98215103149414)
                curveTo(4.797821521759033,20.98215103149414,3.0098483562469482,19.20215606689453,3.0,17.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(9.0,3.0)
                curveTo(10.104569435119629,3.0,11.0,3.895430564880371,11.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.700000762939453,13.0)
                lineTo(19.0,13.0)
                curveTo(20.104570388793945,13.0,21.0,13.895430564880371,21.0,15.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(7.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(7.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,8.0)
                lineTo(13.300000190734863,5.699999809265137)
                curveTo(13.751015663146973,5.247409343719482,14.363885879516602,4.993346214294434,15.002832412719727,4.9940972328186035)
                curveTo(15.641778945922852,4.994848251342773,16.25404930114746,5.2503509521484375,16.70400047302246,5.703999996185303)
                lineTo(18.600000381469727,7.599999904632568)
                curveTo(19.06585121154785,8.048097610473633,19.331260681152344,8.665162086486816,19.33615493774414,9.311525344848633)
                curveTo(19.341047286987305,9.95788860321045,19.085012435913086,10.578900337219238,18.625999450683594,11.034000396728516)
                lineTo(9.899999618530273,19.799999237060547)
            }
}

public val LucideIcons.All.SwatchBookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwatchBook: ImageVector
    @Composable get() = SwatchBookDefinition.asImageVector()
