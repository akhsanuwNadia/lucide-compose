package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranchMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                curveTo(10.029437065124512,6.0,6.0,10.029437065124512,6.0,15.0)
                lineTo(6.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                curveTo(14.995192527770996,7.074992656707764,15.565935134887695,8.070390701293945,16.496112823486328,8.60927963256836)
                curveTo(17.426292419433594,9.148168563842773,18.573707580566406,9.148168563842773,19.503887176513672,8.60927963256836)
                curveTo(20.434064865112305,8.070390701293945,21.00480842590332,7.074992656707764,21.0,6.0)
                curveTo(21.00480842590332,4.925007343292236,20.434064865112305,3.9296092987060547,19.503887176513672,3.3907203674316406)
                curveTo(18.573707580566406,2.8518311977386475,17.426292419433594,2.8518311977386475,16.496112823486328,3.3907203674316406)
                curveTo(15.565935134887695,3.9296092987060547,14.995192527770996,4.925007343292236,15.0,6.0)
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
}

public val LucideIcons.All.GitBranchMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranchMinus: ImageVector
    @Composable get() = GitBranchMinusDefinition.asImageVector()
