package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateFixed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.0)
                curveTo(4.9887824058532715,14.508316993713379,6.320516109466553,16.83091163635254,8.490931510925293,18.088319778442383)
                curveTo(10.661347389221191,19.345726013183594,13.338652610778809,19.345726013183594,15.509068489074707,18.088319778442383)
                curveTo(17.67948341369629,16.83091163635254,19.01121711730957,14.508316993713379,19.0,12.0)
                curveTo(19.01121711730957,9.491683006286621,17.67948341369629,7.169088363647461,15.509068489074707,5.911680698394775)
                curveTo(13.338652610778809,4.65427303314209,10.661347389221191,4.65427303314209,8.490931510925293,5.911680698394775)
                curveTo(6.320516109466553,7.169088363647461,4.9887824058532715,9.491683006286621,5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                curveTo(8.995192527770996,13.074993133544922,9.565935134887695,14.070390701293945,10.496113777160645,14.60927963256836)
                curveTo(11.426291465759277,15.148168563842773,12.573708534240723,15.148168563842773,13.503886222839355,14.60927963256836)
                curveTo(14.434064865112305,14.070390701293945,15.004807472229004,13.074993133544922,15.0,12.0)
                curveTo(15.004807472229004,10.925006866455078,14.434064865112305,9.929609298706055,13.503886222839355,9.39072036743164)
                curveTo(12.573708534240723,8.851831436157227,11.426291465759277,8.851831436157227,10.496113777160645,9.39072036743164)
                curveTo(9.565935134887695,9.929609298706055,8.995192527770996,10.925006866455078,9.0,12.0)
            }
}

public val LucideIcons.All.LocateFixedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateFixed: ImageVector
    @Composable get() = LocateFixedDefinition.asImageVector()
