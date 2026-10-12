package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,22.0)
                curveTo(14.447714805603027,22.0,14.0,21.552284240722656,14.0,21.0)
                lineTo(14.0,17.0)
                curveTo(13.99994945526123,16.665721893310547,14.166930198669434,16.35352325439453,14.444999694824219,16.167999267578125)
                lineTo(17.44499969482422,14.167999267578125)
                curveTo(17.781036376953125,13.943799018859863,18.218963623046875,13.943799018859863,18.55500030517578,14.167999267578125)
                lineTo(21.55500030517578,16.167999267578125)
                curveTo(21.833070755004883,16.35352325439453,22.000049591064453,16.665721893310547,22.0,17.0)
                lineTo(22.0,21.0)
                curveTo(22.0,21.552284240722656,21.552284240722656,22.0,21.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,10.0)
                curveTo(17.980302810668945,5.595687389373779,14.404356956481934,2.0356972217559814,10.0,2.0356972217559814)
                curveTo(5.595643043518066,2.0356972217559814,2.0196967124938965,5.595687389373779,2.0,10.0)
                curveTo(2.0,14.993000030517578,7.539000034332275,20.19300079345703,9.39900016784668,21.798999786376953)
                curveTo(9.572369575500488,21.929027557373047,9.78328800201416,21.999216079711914,10.0,21.999000549316406)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(18.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                curveTo(6.995192527770996,11.074993133544922,7.5659356117248535,12.070390701293945,8.496113777160645,12.60927963256836)
                curveTo(9.426291465759277,13.148168563842773,10.573708534240723,13.148168563842773,11.503886222839355,12.60927963256836)
                curveTo(12.434064865112305,12.070390701293945,13.004807472229004,11.074993133544922,13.0,10.0)
                curveTo(13.004807472229004,8.925006866455078,12.434064865112305,7.929609298706055,11.503886222839355,7.390720367431641)
                curveTo(10.573708534240723,6.851831436157227,9.426291465759277,6.851831436157227,8.496113777160645,7.390720367431641)
                curveTo(7.5659356117248535,7.929609298706055,6.995192527770996,8.925006866455078,7.0,10.0)
            }
}

public val LucideIcons.All.MapPinHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinHouse: ImageVector
    @Composable get() = MapPinHouseDefinition.asImageVector()
