package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RouteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                curveTo(2.995192527770996,20.074993133544922,3.5659356117248535,21.070390701293945,4.4961137771606445,21.60927963256836)
                curveTo(5.4262919425964355,22.148168563842773,6.5737080574035645,22.148168563842773,7.5038862228393555,21.60927963256836)
                curveTo(8.434064865112305,21.070390701293945,9.004807472229004,20.074993133544922,9.0,19.0)
                curveTo(9.004807472229004,17.925006866455078,8.434064865112305,16.929609298706055,7.5038862228393555,16.39072036743164)
                curveTo(6.5737080574035645,15.851831436157227,5.4262919425964355,15.851831436157227,4.4961137771606445,16.39072036743164)
                curveTo(3.5659356117248535,16.929609298706055,2.995192527770996,17.925006866455078,3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(17.5,19.0)
                curveTo(17.899999618530273,19.0,18.399999618530273,18.899999618530273,18.799999237060547,18.799999237060547)
            }
            lucidePath(strokeWidth) {
                moveTo(5.199999809265137,5.199999809265137)
                curveTo(3.652398109436035,5.834620475769043,2.7652485370635986,7.4839019775390625,3.081544876098633,9.138375282287598)
                curveTo(3.397841453552246,10.792848587036133,4.829394817352295,11.991217613220215,6.5,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.300000190734863)
                curveTo(20.90089225769043,13.520127296447754,19.479873657226562,12.09910774230957,17.700000762939453,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(10.699999809265137,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                curveTo(14.995192527770996,6.074992656707764,15.565935134887695,7.070390701293945,16.496112823486328,7.609279632568359)
                curveTo(17.426292419433594,8.148168563842773,18.573707580566406,8.148168563842773,19.503887176513672,7.609279632568359)
                curveTo(20.434064865112305,7.070390701293945,21.00480842590332,6.074992656707764,21.0,5.0)
                curveTo(21.00480842590332,3.9250071048736572,20.434064865112305,2.9296092987060547,19.503887176513672,2.3907203674316406)
                curveTo(18.573707580566406,1.851831316947937,17.426292419433594,1.851831316947937,16.496112823486328,2.3907203674316406)
                curveTo(15.565935134887695,2.9296092987060547,14.995192527770996,3.9250071048736572,15.0,5.0)
            }
}

public val LucideIcons.All.RouteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RouteOff: ImageVector
    @Composable get() = RouteOffDefinition.asImageVector()
