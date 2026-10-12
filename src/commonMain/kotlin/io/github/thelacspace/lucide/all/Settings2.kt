package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Settings2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                lineTo(5.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,7.0)
                lineTo(10.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                curveTo(13.995192527770996,18.074993133544922,14.565935134887695,19.070390701293945,15.496113777160645,19.60927963256836)
                curveTo(16.426292419433594,20.148168563842773,17.573707580566406,20.148168563842773,18.503887176513672,19.60927963256836)
                curveTo(19.434064865112305,19.070390701293945,20.00480842590332,18.074993133544922,20.0,17.0)
                curveTo(20.00480842590332,15.925006866455078,19.434064865112305,14.929609298706055,18.503887176513672,14.39072036743164)
                curveTo(17.573707580566406,13.851831436157227,16.426292419433594,13.851831436157227,15.496113777160645,14.39072036743164)
                curveTo(14.565935134887695,14.929609298706055,13.995192527770996,15.925006866455078,14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                curveTo(3.995192527770996,8.074993133544922,4.5659356117248535,9.070390701293945,5.4961137771606445,9.60927963256836)
                curveTo(6.4262919425964355,10.148168563842773,7.5737080574035645,10.148168563842773,8.503886222839355,9.60927963256836)
                curveTo(9.434064865112305,9.070390701293945,10.004807472229004,8.074993133544922,10.0,7.0)
                curveTo(10.004807472229004,5.925007343292236,9.434064865112305,4.929609298706055,8.503886222839355,4.390720367431641)
                curveTo(7.5737080574035645,3.8518311977386475,6.4262919425964355,3.8518311977386475,5.4961137771606445,4.390720367431641)
                curveTo(4.5659356117248535,4.929609298706055,3.995192527770996,5.925007343292236,4.0,7.0)
            }
}

public val LucideIcons.All.Settings2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Settings2: ImageVector
    @Composable get() = Settings2Definition.asImageVector()
