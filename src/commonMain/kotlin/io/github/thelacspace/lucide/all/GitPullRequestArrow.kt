package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,6.0)
                curveTo(1.995192527770996,7.074992656707764,2.5659356117248535,8.070390701293945,3.4961137771606445,8.60927963256836)
                curveTo(4.4262919425964355,9.148168563842773,5.5737080574035645,9.148168563842773,6.5038862228393555,8.60927963256836)
                curveTo(7.4340643882751465,8.070390701293945,8.004807472229004,7.074992656707764,8.0,6.0)
                curveTo(8.004807472229004,4.925007343292236,7.4340643882751465,3.9296092987060547,6.5038862228393555,3.3907203674316406)
                curveTo(5.5737080574035645,2.8518311977386475,4.4262919425964355,2.8518311977386475,3.4961137771606445,3.3907203674316406)
                curveTo(2.5659356117248535,3.9296092987060547,1.995192527770996,4.925007343292236,2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,9.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                curveTo(15.995192527770996,19.074993133544922,16.565935134887695,20.070390701293945,17.496112823486328,20.60927963256836)
                curveTo(18.426292419433594,21.148168563842773,19.573707580566406,21.148168563842773,20.503887176513672,20.60927963256836)
                curveTo(21.434064865112305,20.070390701293945,22.00480842590332,19.074993133544922,22.0,18.0)
                curveTo(22.00480842590332,16.925006866455078,21.434064865112305,15.929609298706055,20.503887176513672,15.39072036743164)
                curveTo(19.573707580566406,14.851831436157227,18.426292419433594,14.851831436157227,17.496112823486328,15.39072036743164)
                curveTo(16.565935134887695,15.929609298706055,15.995192527770996,16.925006866455078,16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(12.0,6.0)
                lineTo(15.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(17.0,6.0)
                curveTo(18.104570388793945,6.0,19.0,6.895430564880371,19.0,8.0)
                lineTo(19.0,15.0)
            }
}

public val LucideIcons.All.GitPullRequestArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestArrow: ImageVector
    @Composable get() = GitPullRequestArrowDefinition.asImageVector()
