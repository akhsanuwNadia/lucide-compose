package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiCog") { strokeWidth ->
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
                moveTo(19.148000717163086,15.227999687194824)
                lineTo(19.5310001373291,14.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(19.530000686645508,21.695999145507812)
                lineTo(19.148000717163086,20.77199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(7.6940131187438965,3.7271194458007812,16.305986404418945,3.7271194458007812,22.0,8.819999694824219)
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
                moveTo(5.0,12.859000205993652)
                curveTo(7.683529376983643,10.227202415466309,11.61618709564209,9.32245922088623,15.180000305175781,10.517000198364258)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                curveTo(9.062172889709473,15.877196311950684,9.746770858764648,15.466026306152344,10.498000144958496,15.22900104522705)
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

public val LucideIcons.All.WifiCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiCog: ImageVector
    @Composable get() = WifiCogDefinition.asImageVector()
