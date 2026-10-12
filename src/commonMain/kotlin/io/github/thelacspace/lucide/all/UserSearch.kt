package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                curveTo(5.993589878082275,8.433323860168457,6.754580497741699,9.760520935058594,7.994818210601807,10.479039192199707)
                curveTo(9.235055923461914,11.197558403015137,10.764944076538086,11.197558403015137,12.005181312561035,10.479039192199707)
                curveTo(13.2454195022583,9.760520935058594,14.006409645080566,8.433323860168457,14.0,7.0)
                curveTo(14.006409645080566,5.566676139831543,13.2454195022583,4.239479064941406,12.005181312561035,3.5209603309631348)
                curveTo(10.764944076538086,2.8024418354034424,9.235055923461914,2.8024418354034424,7.994818210601807,3.5209603309631348)
                curveTo(6.754580497741699,4.239479064941406,5.993589878082275,5.566676139831543,6.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.300000190734863,15.0)
                lineTo(7.0,15.0)
                curveTo(4.790861129760742,15.0,3.0,16.790861129760742,3.0,19.0)
                lineTo(3.0,21.0)
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
                moveTo(21.0,21.0)
                lineTo(19.100000381469727,19.100000381469727)
            }
}

public val LucideIcons.All.UserSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserSearch: ImageVector
    @Composable get() = UserSearchDefinition.asImageVector()
