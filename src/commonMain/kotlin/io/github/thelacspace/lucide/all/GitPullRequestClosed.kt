package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5,3.5)
                lineTo(20.5,8.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,8.5)
                lineTo(20.5,3.5)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.619999885559082)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                curveTo(14.995192527770996,19.074993133544922,15.565935134887695,20.070390701293945,16.496112823486328,20.60927963256836)
                curveTo(17.426292419433594,21.148168563842773,18.573707580566406,21.148168563842773,19.503887176513672,20.60927963256836)
                curveTo(20.434064865112305,20.070390701293945,21.00480842590332,19.074993133544922,21.0,18.0)
                curveTo(21.00480842590332,16.925006866455078,20.434064865112305,15.929609298706055,19.503887176513672,15.39072036743164)
                curveTo(18.573707580566406,14.851831436157227,17.426292419433594,14.851831436157227,16.496112823486328,15.39072036743164)
                curveTo(15.565935134887695,15.929609298706055,14.995192527770996,16.925006866455078,15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                curveTo(2.995192527770996,7.074992656707764,3.5659356117248535,8.070390701293945,4.4961137771606445,8.60927963256836)
                curveTo(5.4262919425964355,9.148168563842773,6.5737080574035645,9.148168563842773,7.5038862228393555,8.60927963256836)
                curveTo(8.434064865112305,8.070390701293945,9.004807472229004,7.074992656707764,9.0,6.0)
                curveTo(9.004807472229004,4.925007343292236,8.434064865112305,3.9296092987060547,7.5038862228393555,3.3907203674316406)
                curveTo(6.5737080574035645,2.8518311977386475,5.4262919425964355,2.8518311977386475,4.4961137771606445,3.3907203674316406)
                curveTo(3.5659356117248535,3.9296092987060547,2.995192527770996,4.925007343292236,3.0,6.0)
            }
}

public val LucideIcons.All.GitPullRequestClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestClosed: ImageVector
    @Composable get() = GitPullRequestClosedDefinition.asImageVector()
