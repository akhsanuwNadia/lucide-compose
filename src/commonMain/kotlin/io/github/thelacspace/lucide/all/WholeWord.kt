package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WholeWord") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                curveTo(3.995192527770996,13.074993133544922,4.5659356117248535,14.070390701293945,5.4961137771606445,14.60927963256836)
                curveTo(6.4262919425964355,15.148168563842773,7.5737080574035645,15.148168563842773,8.503886222839355,14.60927963256836)
                curveTo(9.434064865112305,14.070390701293945,10.004807472229004,13.074993133544922,10.0,12.0)
                curveTo(10.004807472229004,10.925006866455078,9.434064865112305,9.929609298706055,8.503886222839355,9.39072036743164)
                curveTo(7.5737080574035645,8.851831436157227,6.4262919425964355,8.851831436157227,5.4961137771606445,9.39072036743164)
                curveTo(4.5659356117248535,9.929609298706055,3.995192527770996,10.925006866455078,4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                curveTo(13.995192527770996,13.074993133544922,14.565935134887695,14.070390701293945,15.496113777160645,14.60927963256836)
                curveTo(16.426292419433594,15.148168563842773,17.573707580566406,15.148168563842773,18.503887176513672,14.60927963256836)
                curveTo(19.434064865112305,14.070390701293945,20.00480842590332,13.074993133544922,20.0,12.0)
                curveTo(20.00480842590332,10.925006866455078,19.434064865112305,9.929609298706055,18.503887176513672,9.39072036743164)
                curveTo(17.573707580566406,8.851831436157227,16.426292419433594,8.851831436157227,15.496113777160645,9.39072036743164)
                curveTo(14.565935134887695,9.929609298706055,13.995192527770996,10.925006866455078,14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(22.0,18.0)
                curveTo(22.0,18.5,21.5,19.0,21.0,19.0)
                lineTo(3.0,19.0)
                curveTo(2.5,19.0,2.0,18.5,2.0,18.0)
                lineTo(2.0,17.0)
            }
}

public val LucideIcons.All.WholeWordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WholeWord: ImageVector
    @Composable get() = WholeWordDefinition.asImageVector()
