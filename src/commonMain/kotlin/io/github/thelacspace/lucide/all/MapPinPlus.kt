package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.913999557495117,11.104999542236328)
                curveTo(19.97063446044922,10.739378929138184,19.9993839263916,10.369980812072754,20.0,10.0)
                curveTo(19.980302810668945,5.595687389373779,16.404356002807617,2.0356972217559814,12.0,2.0356972217559814)
                curveTo(7.595643043518066,2.0356972217559814,4.0196967124938965,5.595687389373779,4.0,10.0)
                curveTo(4.0,14.993000030517578,9.538999557495117,20.19300079345703,11.39900016784668,21.798999786376953)
                curveTo(11.754961967468262,22.066667556762695,12.245038032531738,22.066667556762695,12.60099983215332,21.798999786376953)
                curveTo(12.879898071289062,21.55776596069336,13.154605865478516,21.311729431152344,13.425000190734863,21.060998916625977)
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
                moveTo(16.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,15.0)
                lineTo(19.0,21.0)
            }
}

public val LucideIcons.All.MapPinPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinPlus: ImageVector
    @Composable get() = MapPinPlusDefinition.asImageVector()
