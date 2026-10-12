package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Factory") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(16.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                lineTo(21.0,8.5)
                curveTo(21.000192642211914,8.317296028137207,20.90071678161621,8.149033546447754,20.740543365478516,8.061136245727539)
                curveTo(20.580371856689453,7.973239898681641,20.385011672973633,7.979705333709717,20.231000900268555,8.07800006866455)
                lineTo(15.769001007080078,10.92199993133545)
                curveTo(15.614991188049316,11.020296096801758,15.419629096984863,11.026762008666992,15.259456634521484,10.938864707946777)
                curveTo(15.099284172058105,10.850968360900879,14.999807357788086,10.68270492553711,15.0,10.5)
                lineTo(15.0,8.5)
                curveTo(15.000192642211914,8.31729507446289,14.900715827941895,8.149032592773438,14.740543365478516,8.061136245727539)
                curveTo(14.580371856689453,7.973238945007324,14.385009765625,7.979704856872559,14.230999946594238,8.07800006866455)
                lineTo(9.770000457763672,10.92199993133545)
                curveTo(9.615948677062988,11.020837783813477,9.42020320892334,11.027603149414062,9.259695053100586,10.939637184143066)
                curveTo(9.099187850952148,10.851670265197754,8.999571800231934,10.683032035827637,9.0,10.5)
                lineTo(9.0,5.0)
                curveTo(9.0,3.895430564880371,8.104569435119629,3.0,7.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(8.010000228881836,16.0)
            }
}

public val LucideIcons.All.FactoryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Factory: ImageVector
    @Composable get() = FactoryDefinition.asImageVector()
