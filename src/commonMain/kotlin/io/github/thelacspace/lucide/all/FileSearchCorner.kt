package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSearchCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.100000381469727,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.640057563781738,1.9984302520751953,15.254226684570312,2.252593755722046,15.706000328063965,2.7059998512268066)
                lineTo(19.295000076293945,6.293999671936035)
                curveTo(19.74803924560547,6.745937824249268,20.001834869384766,7.360086441040039,20.0,8.0)
                lineTo(20.0,11.25)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,22.0)
                lineTo(18.119998931884766,19.119998931884766)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,17.0)
                curveTo(12.995192527770996,18.074993133544922,13.565935134887695,19.070390701293945,14.496113777160645,19.60927963256836)
                curveTo(15.426291465759277,20.148168563842773,16.573707580566406,20.148168563842773,17.503887176513672,19.60927963256836)
                curveTo(18.434064865112305,19.070390701293945,19.00480842590332,18.074993133544922,19.0,17.0)
                curveTo(19.00480842590332,15.925006866455078,18.434064865112305,14.929609298706055,17.503887176513672,14.39072036743164)
                curveTo(16.573707580566406,13.851831436157227,15.426291465759277,13.851831436157227,14.496113777160645,14.39072036743164)
                curveTo(13.565935134887695,14.929609298706055,12.995192527770996,15.925006866455078,13.0,17.0)
            }
}

public val LucideIcons.All.FileSearchCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSearchCorner: ImageVector
    @Composable get() = FileSearchCornerDefinition.asImageVector()
