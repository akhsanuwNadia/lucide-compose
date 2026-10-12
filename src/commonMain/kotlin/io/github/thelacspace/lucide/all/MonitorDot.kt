package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.307000160217285)
                lineTo(22.0,15.0)
                curveTo(22.0,16.104570388793945,21.104570388793945,17.0,20.0,17.0)
                lineTo(4.0,17.0)
                curveTo(2.895430564880371,17.0,2.0,16.104570388793945,2.0,15.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(12.692999839782715,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                curveTo(15.995192527770996,7.074992656707764,16.565935134887695,8.070390701293945,17.496112823486328,8.60927963256836)
                curveTo(18.426292419433594,9.148168563842773,19.573707580566406,9.148168563842773,20.503887176513672,8.60927963256836)
                curveTo(21.434064865112305,8.070390701293945,22.00480842590332,7.074992656707764,22.0,6.0)
                curveTo(22.00480842590332,4.925007343292236,21.434064865112305,3.9296092987060547,20.503887176513672,3.3907203674316406)
                curveTo(19.573707580566406,2.8518311977386475,18.426292419433594,2.8518311977386475,17.496112823486328,3.3907203674316406)
                curveTo(16.565935134887695,3.9296092987060547,15.995192527770996,4.925007343292236,16.0,6.0)
            }
}

public val LucideIcons.All.MonitorDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorDot: ImageVector
    @Composable get() = MonitorDotDefinition.asImageVector()
