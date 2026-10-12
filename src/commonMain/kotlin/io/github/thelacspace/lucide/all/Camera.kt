package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Camera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.996999740600586,4.0)
                curveTo(14.732041358947754,3.9999895095825195,15.407855033874512,4.403173923492432,15.756999969482422,5.050000190734863)
                lineTo(16.243000030517578,5.950000286102295)
                curveTo(16.592144012451172,6.596826076507568,17.267959594726562,7.0000104904174805,18.003000259399414,7.0)
                lineTo(20.0,7.0)
                curveTo(21.104570388793945,7.0,22.0,7.895430564880371,22.0,9.0)
                lineTo(22.0,18.0)
                curveTo(22.0,19.104570388793945,21.104570388793945,20.0,20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,9.0)
                curveTo(2.0,7.895430564880371,2.895430564880371,7.0,4.0,7.0)
                lineTo(5.996999740600586,7.0)
                curveTo(6.731255054473877,7.000040054321289,7.406494140625,6.5977373123168945,7.755999565124512,5.952000141143799)
                lineTo(8.244999885559082,5.048000335693359)
                curveTo(8.594505310058594,4.402263164520264,9.269744873046875,3.999959945678711,10.003999710083008,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                curveTo(8.995192527770996,14.074993133544922,9.565935134887695,15.070390701293945,10.496113777160645,15.60927963256836)
                curveTo(11.426291465759277,16.148168563842773,12.573708534240723,16.148168563842773,13.503886222839355,15.60927963256836)
                curveTo(14.434064865112305,15.070390701293945,15.004807472229004,14.074993133544922,15.0,13.0)
                curveTo(15.004807472229004,11.925006866455078,14.434064865112305,10.929609298706055,13.503886222839355,10.39072036743164)
                curveTo(12.573708534240723,9.851831436157227,11.426291465759277,9.851831436157227,10.496113777160645,10.39072036743164)
                curveTo(9.565935134887695,10.929609298706055,8.995192527770996,11.925006866455078,9.0,13.0)
            }
}

public val LucideIcons.All.CameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Camera: ImageVector
    @Composable get() = CameraDefinition.asImageVector()
