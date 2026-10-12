package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(9.0,5.0)
                lineTo(21.0,3.0)
                lineTo(21.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.0)
                curveTo(2.995192527770996,19.074993133544922,3.5659356117248535,20.070390701293945,4.4961137771606445,20.60927963256836)
                curveTo(5.4262919425964355,21.148168563842773,6.5737080574035645,21.148168563842773,7.5038862228393555,20.60927963256836)
                curveTo(8.434064865112305,20.070390701293945,9.004807472229004,19.074993133544922,9.0,18.0)
                curveTo(9.004807472229004,16.925006866455078,8.434064865112305,15.929609298706055,7.5038862228393555,15.39072036743164)
                curveTo(6.5737080574035645,14.851831436157227,5.4262919425964355,14.851831436157227,4.4961137771606445,15.39072036743164)
                curveTo(3.5659356117248535,15.929609298706055,2.995192527770996,16.925006866455078,3.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                curveTo(14.995192527770996,17.074993133544922,15.565935134887695,18.070390701293945,16.496112823486328,18.60927963256836)
                curveTo(17.426292419433594,19.148168563842773,18.573707580566406,19.148168563842773,19.503887176513672,18.60927963256836)
                curveTo(20.434064865112305,18.070390701293945,21.00480842590332,17.074993133544922,21.0,16.0)
                curveTo(21.00480842590332,14.925006866455078,20.434064865112305,13.929609298706055,19.503887176513672,13.39072036743164)
                curveTo(18.573707580566406,12.851831436157227,17.426292419433594,12.851831436157227,16.496112823486328,13.39072036743164)
                curveTo(15.565935134887695,13.929609298706055,14.995192527770996,14.925006866455078,15.0,16.0)
            }
}

public val LucideIcons.All.MusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music: ImageVector
    @Composable get() = MusicDefinition.asImageVector()
