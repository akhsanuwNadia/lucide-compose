package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.227999687194824,16.851999282836914)
                lineTo(14.304999351501465,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(15.227999687194824,19.148000717163086)
                lineTo(14.304999351501465,19.5310001373291)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.469999313354492,14.305000305175781)
                lineTo(16.851999282836914,15.22800064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,20.77199935913086)
                lineTo(16.4689998626709,21.695999145507812)
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
                moveTo(20.773000717163086,16.851999282836914)
                lineTo(21.69700050354004,16.4689998626709)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773000717163086,19.148000717163086)
                lineTo(21.69700050354004,19.5310001373291)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,10.5)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(10.5,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
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

public val LucideIcons.All.CalendarCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarCog: ImageVector
    @Composable get() = CalendarCogDefinition.asImageVector()
