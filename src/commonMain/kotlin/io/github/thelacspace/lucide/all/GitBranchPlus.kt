package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranchPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,9.0)
                curveTo(19.074993133544922,9.004807472229004,20.070390701293945,8.434064865112305,20.60927963256836,7.5038862228393555)
                curveTo(21.148168563842773,6.5737080574035645,21.148168563842773,5.4262919425964355,20.60927963256836,4.4961137771606445)
                curveTo(20.070390701293945,3.5659356117248535,19.074993133544922,2.995192527770996,18.0,3.0)
                curveTo(16.3483829498291,3.0073862075805664,15.013386726379395,4.3483662605285645,15.013386726379395,6.0)
                curveTo(15.013386726379395,7.6516337394714355,16.3483829498291,8.992613792419434,18.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                curveTo(7.074992656707764,21.00480842590332,8.070390701293945,20.434064865112305,8.60927963256836,19.503887176513672)
                curveTo(9.148168563842773,18.573707580566406,9.148168563842773,17.426292419433594,8.60927963256836,16.496112823486328)
                curveTo(8.070390701293945,15.565935134887695,7.074992656707764,14.995192527770996,6.0,15.0)
                curveTo(4.348382949829102,15.007386207580566,3.0133864879608154,16.348365783691406,3.0133864879608154,18.0)
                curveTo(3.0133864879608154,19.651634216308594,4.348382949829102,20.992612838745117,6.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                curveTo(10.029437065124512,6.0,6.0,10.029437065124512,6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,15.0)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,18.0)
                lineTo(15.0,18.0)
            }
}

public val LucideIcons.All.GitBranchPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranchPlus: ImageVector
    @Composable get() = GitBranchPlusDefinition.asImageVector()
