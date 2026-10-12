package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305000305175781,7.53000020980835)
                lineTo(15.22800064086914,7.148000240325928)
            }
            lucidePath(strokeWidth) {
                moveTo(15.227999687194824,4.8520002365112305)
                lineTo(14.304999351501465,4.469000339508057)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,3.2279999256134033)
                lineTo(16.4689998626709,2.303999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(16.851999282836914,8.772000312805176)
                lineTo(16.4689998626709,9.695000648498535)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148000717163086,3.2279999256134033)
                lineTo(19.5310001373291,2.303999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,9.696000099182129)
                lineTo(19.148000717163086,8.772000312805176)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,4.8520002365112305)
                lineTo(21.695999145507812,4.469000339508057)
            }
            lucidePath(strokeWidth) {
                moveTo(20.77199935913086,7.1479997634887695)
                lineTo(21.695999145507812,7.530999660491943)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,13.0)
                lineTo(22.0,15.0)
                curveTo(22.0,16.104570388793945,21.104570388793945,17.0,20.0,17.0)
                lineTo(4.0,17.0)
                curveTo(2.895430564880371,17.0,2.0,16.104570388793945,2.0,15.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(11.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
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
}

public val LucideIcons.All.MonitorCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorCog: ImageVector
    @Composable get() = MonitorCogDefinition.asImageVector()
