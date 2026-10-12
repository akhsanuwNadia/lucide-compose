package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.43000030517578,12.9350004196167)
                curveTo(19.78700065612793,11.968000411987305,20.0,10.980000495910645,20.0,10.0)
                curveTo(19.980302810668945,5.595687389373779,16.404356002807617,2.0356972217559814,12.0,2.0356972217559814)
                curveTo(7.595643043518066,2.0356972217559814,4.0196967124938965,5.595687389373779,4.0,10.0)
                curveTo(4.0,14.993000030517578,9.538999557495117,20.19300079345703,11.39900016784668,21.798999786376953)
                curveTo(11.754961967468262,22.066667556762695,12.245038032531738,22.066667556762695,12.60099983215332,21.798999786376953)
                curveTo(12.876092910766602,21.560943603515625,13.14713191986084,21.318241119384766,13.413999557495117,21.070999145507812)
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
                lineTo(18.0,20.0)
                lineTo(22.0,16.0)
            }
}

public val LucideIcons.All.MapPinCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinCheck: ImageVector
    @Composable get() = MapPinCheckDefinition.asImageVector()
