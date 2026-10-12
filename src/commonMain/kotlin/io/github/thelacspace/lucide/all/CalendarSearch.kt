package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,10.6899995803833)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(12.25,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,21.0)
                lineTo(20.125,19.125)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,17.0)
                curveTo(14.995192527770996,18.074993133544922,15.565935134887695,19.070390701293945,16.496112823486328,19.60927963256836)
                curveTo(17.426292419433594,20.148168563842773,18.573707580566406,20.148168563842773,19.503887176513672,19.60927963256836)
                curveTo(20.434064865112305,19.070390701293945,21.00480842590332,18.074993133544922,21.0,17.0)
                curveTo(21.00480842590332,15.925006866455078,20.434064865112305,14.929609298706055,19.503887176513672,14.39072036743164)
                curveTo(18.573707580566406,13.851831436157227,17.426292419433594,13.851831436157227,16.496112823486328,14.39072036743164)
                curveTo(15.565935134887695,14.929609298706055,14.995192527770996,15.925006866455078,15.0,17.0)
            }
}

public val LucideIcons.All.CalendarSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarSearch: ImageVector
    @Composable get() = CalendarSearchDefinition.asImageVector()
