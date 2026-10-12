package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.673999786376953,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,13.324999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,7.0)
                lineTo(11.0,12.701000213623047)
                curveTo(11.618802070617676,13.058265686035156,12.381197929382324,13.058265686035156,13.0,12.701000213623047)
                lineTo(14.083999633789062,12.015000343322754)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                curveTo(15.995192527770996,8.074993133544922,16.565935134887695,9.070390701293945,17.496112823486328,9.60927963256836)
                curveTo(18.426292419433594,10.148168563842773,19.573707580566406,10.148168563842773,20.503887176513672,9.60927963256836)
                curveTo(21.434064865112305,9.070390701293945,22.00480842590332,8.074993133544922,22.0,7.0)
                curveTo(22.00480842590332,5.925007343292236,21.434064865112305,4.929609298706055,20.503887176513672,4.390720367431641)
                curveTo(19.573707580566406,3.8518311977386475,18.426292419433594,3.8518311977386475,17.496112823486328,4.390720367431641)
                curveTo(16.565935134887695,4.929609298706055,15.995192527770996,5.925007343292236,16.0,7.0)
            }
}

public val LucideIcons.All.MailDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailDot: ImageVector
    @Composable get() = MailDotDefinition.asImageVector()
