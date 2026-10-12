package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.583999633789062,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,10.0)
                curveTo(3.000153064727783,9.411476135253906,3.2595086097717285,8.85289192199707,3.7090001106262207,8.472999572753906)
                lineTo(10.708999633789062,2.4729995727539062)
                curveTo(11.454387664794922,1.843027114868164,12.545611381530762,1.843027114868164,13.290999412536621,2.4729995727539062)
                lineTo(20.291000366210938,8.472999572753906)
                curveTo(20.740758895874023,8.853117942810059,21.000141143798828,9.412126541137695,21.0,10.00100040435791)
                lineTo(21.0,10.584000587463379)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(10.0,12.0)
                curveTo(9.447714805603027,12.0,9.0,12.447714805603027,9.0,13.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305000305175781,19.530000686645508)
                lineTo(15.22800064086914,19.148000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(15.229000091552734,16.851999282836914)
                lineTo(14.305000305175781,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,15.227999687194824)
                lineTo(16.4689998626709,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,20.773000717163086)
                lineTo(16.4689998626709,21.69700050354004)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148000717163086,15.227999687194824)
                lineTo(19.5310001373291,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,21.69700050354004)
                lineTo(19.148000717163086,20.773000717163086)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773000717163086,16.851999282836914)
                lineTo(21.69500160217285,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773000717163086,19.148000717163086)
                lineTo(21.69500160217285,19.5310001373291)
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

public val LucideIcons.All.HouseCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseCog: ImageVector
    @Composable get() = HouseCogDefinition.asImageVector()
