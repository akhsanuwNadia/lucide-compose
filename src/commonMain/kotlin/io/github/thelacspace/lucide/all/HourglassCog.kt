package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HourglassCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.305000305175781,19.530000686645508)
                lineTo(15.22800064086914,19.148000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(15.227999687194824,16.851999282836914)
                lineTo(14.304999351501465,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,15.227999687194824)
                lineTo(16.4689998626709,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,20.77199935913086)
                lineTo(16.4689998626709,21.695999145507812)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(17.0,6.171999931335449)
                curveTo(16.999887466430664,6.702389717102051,16.789098739624023,7.211014747619629,16.413999557495117,7.585999965667725)
                lineTo(7.585999488830566,16.413999557495117)
                curveTo(7.210901260375977,16.788984298706055,7.000113487243652,17.297609329223633,7.0,17.827999114990234)
                lineTo(7.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148000717163086,15.227999687194824)
                lineTo(19.5310001373291,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,21.695999145507812)
                lineTo(19.148000717163086,20.77199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,16.851999282836914)
                lineTo(21.695999145507812,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,19.148000717163086)
                lineTo(21.695999145507812,19.5310001373291)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,22.0)
                lineTo(11.159000396728516,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(19.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(7.0,6.171999931335449)
                curveTo(7.000113487243652,6.702389717102051,7.210901260375977,7.211014270782471,7.585999965667725,7.585999965667725)
                lineTo(12.77400016784668,12.77400016784668)
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
}

public val LucideIcons.All.HourglassCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HourglassCog: ImageVector
    @Composable get() = HourglassCogDefinition.asImageVector()
