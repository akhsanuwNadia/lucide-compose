package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.75200080871582,11.901000022888184)
                curveTo(19.912721633911133,11.279980659484863,19.996021270751953,10.641467094421387,20.0,10.0)
                curveTo(19.980302810668945,5.595687389373779,16.404356002807617,2.0356972217559814,12.0,2.0356972217559814)
                curveTo(7.595643043518066,2.0356972217559814,4.0196967124938965,5.595687389373779,4.0,10.0)
                curveTo(4.0,14.993000030517578,9.538999557495117,20.19300079345703,11.39900016784668,21.798999786376953)
                curveTo(11.754961967468262,22.066667556762695,12.245038032531738,22.066667556762695,12.60099983215332,21.798999786376953)
                curveTo(12.63107967376709,21.773426055908203,12.661080360412598,21.747760772705078,12.690999984741211,21.722000122070312)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                curveTo(8.995192527770996,11.074993133544922,9.565935134887695,12.070390701293945,10.496113777160645,12.60927963256836)
                curveTo(11.426291465759277,13.148168563842773,12.573708534240723,13.148168563842773,13.503886222839355,12.60927963256836)
                curveTo(14.434064865112305,12.070390701293945,15.004807472229004,11.074993133544922,15.0,10.0)
                curveTo(15.004807472229004,8.925006866455078,14.434064865112305,7.929609298706055,13.503886222839355,7.390720367431641)
                curveTo(12.573708534240723,6.851831436157227,11.426291465759277,6.851831436157227,10.496113777160645,7.390720367431641)
                curveTo(9.565935134887695,7.929609298706055,8.995192527770996,8.925006866455078,9.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,15.5)
                lineTo(16.5,20.5)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,20.5)
                lineTo(16.5,15.5)
            }
}

public val LucideIcons.All.MapPinXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinX: ImageVector
    @Composable get() = MapPinXDefinition.asImageVector()
