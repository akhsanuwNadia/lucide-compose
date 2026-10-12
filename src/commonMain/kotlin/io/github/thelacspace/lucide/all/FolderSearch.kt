package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.699999809265137,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(20.0,6.000000476837158)
                curveTo(21.104568481445312,6.000000476837158,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,12.100000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(19.100000381469727,19.100000381469727)
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
}

public val LucideIcons.All.FolderSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderSearch: ImageVector
    @Composable get() = FolderSearchDefinition.asImageVector()
