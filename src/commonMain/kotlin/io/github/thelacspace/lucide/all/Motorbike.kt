package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Motorbike") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,14.0)
                lineTo(17.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(9.0,11.0)
                curveTo(9.0,9.895430564880371,9.895430564880371,9.0,11.0,9.0)
                lineTo(13.0,9.0)
                curveTo(14.030603408813477,9.000492095947266,14.89209270477295,9.7840576171875,14.989999771118164,10.809999465942383)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,17.0)
                lineTo(11.0,17.0)
                curveTo(11.552285194396973,17.0,12.0,16.552284240722656,12.0,16.0)
                curveTo(12.0,12.686291694641113,14.686291694641113,10.0,18.0,10.0)
                curveTo(18.552284240722656,10.0,19.0,9.552285194396973,19.0,9.0)
                lineTo(19.0,8.25)
                curveTo(18.789216995239258,6.944859504699707,18.07011604309082,5.776319980621338,17.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                curveTo(15.995192527770996,18.074993133544922,16.565935134887695,19.070390701293945,17.496112823486328,19.60927963256836)
                curveTo(18.426292419433594,20.148168563842773,19.573707580566406,20.148168563842773,20.503887176513672,19.60927963256836)
                curveTo(21.434064865112305,19.070390701293945,22.00480842590332,18.074993133544922,22.0,17.0)
                curveTo(22.00480842590332,15.925006866455078,21.434064865112305,14.929609298706055,20.503887176513672,14.39072036743164)
                curveTo(19.573707580566406,13.851831436157227,18.426292419433594,13.851831436157227,17.496112823486328,14.39072036743164)
                curveTo(16.565935134887695,14.929609298706055,15.995192527770996,15.925006866455078,16.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                curveTo(1.995192527770996,18.074993133544922,2.5659356117248535,19.070390701293945,3.4961137771606445,19.60927963256836)
                curveTo(4.4262919425964355,20.148168563842773,5.5737080574035645,20.148168563842773,6.5038862228393555,19.60927963256836)
                curveTo(7.4340643882751465,19.070390701293945,8.004807472229004,18.074993133544922,8.0,17.0)
                curveTo(8.004807472229004,15.925006866455078,7.4340643882751465,14.929609298706055,6.5038862228393555,14.39072036743164)
                curveTo(5.5737080574035645,13.851831436157227,4.4262919425964355,13.851831436157227,3.4961137771606445,14.39072036743164)
                curveTo(2.5659356117248535,14.929609298706055,1.995192527770996,15.925006866455078,2.0,17.0)
            }
}

public val LucideIcons.All.MotorbikeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Motorbike: ImageVector
    @Composable get() = MotorbikeDefinition.asImageVector()
