package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(6.0,15.0)
                curveTo(3.790860891342163,15.0,2.0,16.790861129760742,2.0,19.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305000305175781,16.530000686645508)
                lineTo(15.22800064086914,16.148000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(15.227999687194824,13.85200023651123)
                lineTo(14.304999351501465,13.468999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,12.227999687194824)
                lineTo(16.4689998626709,11.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,17.77199935913086)
                lineTo(16.4689998626709,18.695999145507812)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148000717163086,12.227999687194824)
                lineTo(19.5310001373291,11.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,18.695999145507812)
                lineTo(19.148000717163086,17.77199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,13.85200023651123)
                lineTo(21.695999145507812,13.468999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,16.148000717163086)
                lineTo(21.695999145507812,16.5310001373291)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                curveTo(14.995192527770996,16.074993133544922,15.565935134887695,17.070390701293945,16.496112823486328,17.60927963256836)
                curveTo(17.426292419433594,18.148168563842773,18.573707580566406,18.148168563842773,19.503887176513672,17.60927963256836)
                curveTo(20.434064865112305,17.070390701293945,21.00480842590332,16.074993133544922,21.0,15.0)
                curveTo(21.00480842590332,13.925006866455078,20.434064865112305,12.929609298706055,19.503887176513672,12.39072036743164)
                curveTo(18.573707580566406,11.851831436157227,17.426292419433594,11.851831436157227,16.496112823486328,12.39072036743164)
                curveTo(15.565935134887695,12.929609298706055,14.995192527770996,13.925006866455078,15.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                curveTo(4.993589878082275,8.433323860168457,5.754580497741699,9.760520935058594,6.994818210601807,10.479039192199707)
                curveTo(8.235055923461914,11.197558403015137,9.764944076538086,11.197558403015137,11.005181312561035,10.479039192199707)
                curveTo(12.2454195022583,9.760520935058594,13.006409645080566,8.433323860168457,13.0,7.0)
                curveTo(13.006409645080566,5.566676139831543,12.2454195022583,4.239479064941406,11.005181312561035,3.5209603309631348)
                curveTo(9.764944076538086,2.8024418354034424,8.235055923461914,2.8024418354034424,6.994818210601807,3.5209603309631348)
                curveTo(5.754580497741699,4.239479064941406,4.993589878082275,5.566676139831543,5.0,7.0)
            }
}

public val LucideIcons.All.UserCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserCog: ImageVector
    @Composable get() = UserCogDefinition.asImageVector()
