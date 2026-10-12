package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellElectric") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.51799964904785,17.347000122070312)
                curveTo(17.25458526611328,18.41446304321289,15.653993606567383,19.000070571899414,14.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.799999237060547,4.0)
                curveTo(19.589397430419922,5.548457622528076,20.00063133239746,7.261935234069824,20.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(9.010000228881836,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                curveTo(17.996795654296875,16.71666145324707,18.377290725708008,17.380260467529297,18.99740982055664,17.739519119262695)
                curveTo(19.61752700805664,18.098779678344727,20.38247299194336,18.098779678344727,21.00259017944336,17.739519119262695)
                curveTo(21.622709274291992,17.380260467529297,22.003204345703125,16.71666145324707,22.0,16.0)
                curveTo(22.003204345703125,15.28333854675293,21.622709274291992,14.619739532470703,21.00259017944336,14.260479927062988)
                curveTo(20.38247299194336,13.90122127532959,19.61752700805664,13.90122127532959,18.99740982055664,14.260479927062988)
                curveTo(18.377290725708008,14.619739532470703,17.996795654296875,15.28333854675293,18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                curveTo(1.9887824058532715,11.508316993713379,3.3205161094665527,13.830911636352539,5.490931987762451,15.088318824768066)
                curveTo(7.661347389221191,16.345726013183594,10.338652610778809,16.345726013183594,12.509068489074707,15.088318824768066)
                curveTo(14.679483413696289,13.830911636352539,16.01121711730957,11.508316993713379,16.0,9.0)
                curveTo(16.01121711730957,6.491683483123779,14.679483413696289,4.169088363647461,12.509068489074707,2.9116806983947754)
                curveTo(10.338652610778809,1.6542730331420898,7.661347389221191,1.6542730331420898,5.490931987762451,2.9116806983947754)
                curveTo(3.3205161094665527,4.169088363647461,1.9887824058532715,6.491683483123779,2.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(12.0,16.0)
                lineTo(14.0,16.0)
                lineTo(14.0,22.0)
                lineTo(12.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,16.0)
                lineTo(6.0,16.0)
                close()
            }
}

public val LucideIcons.All.BellElectricDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellElectric: ImageVector
    @Composable get() = BellElectricDefinition.asImageVector()
