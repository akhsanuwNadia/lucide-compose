package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLeo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                curveTo(10.0,12.0,7.0,11.5,7.0,8.0)
                curveTo(7.01231050491333,5.247304439544678,9.24727725982666,3.022310733795166,12.0,3.022310733795166)
                curveTo(14.75272274017334,3.022310733795166,16.987689971923828,5.247304439544678,17.0,8.0)
                curveTo(17.0,11.465999603271484,14.0,14.196000099182129,14.0,18.0)
                curveTo(14.007386207580566,19.6516170501709,15.348365783691406,20.986614227294922,17.0,20.986614227294922)
                curveTo(18.651634216308594,20.986614227294922,19.992612838745117,19.6516170501709,20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                curveTo(3.995192527770996,17.074993133544922,4.5659356117248535,18.070390701293945,5.4961137771606445,18.60927963256836)
                curveTo(6.4262919425964355,19.148168563842773,7.5737080574035645,19.148168563842773,8.503886222839355,18.60927963256836)
                curveTo(9.434064865112305,18.070390701293945,10.004807472229004,17.074993133544922,10.0,16.0)
                curveTo(10.004807472229004,14.925006866455078,9.434064865112305,13.929609298706055,8.503886222839355,13.39072036743164)
                curveTo(7.5737080574035645,12.851831436157227,6.4262919425964355,12.851831436157227,5.4961137771606445,13.39072036743164)
                curveTo(4.5659356117248535,13.929609298706055,3.995192527770996,14.925006866455078,4.0,16.0)
            }
}

public val LucideIcons.All.ZodiacLeoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLeo: ImageVector
    @Composable get() = ZodiacLeoDefinition.asImageVector()
