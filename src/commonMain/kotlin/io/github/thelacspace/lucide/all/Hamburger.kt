package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hamburger") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(4.0,16.0)
                curveTo(3.2833380699157715,16.003204345703125,2.619739532470703,15.622709274291992,2.2604801654815674,15.002591133117676)
                curveTo(1.9012209177017212,14.382472038269043,1.9012209177017212,13.617527961730957,2.2604801654815674,12.997408866882324)
                curveTo(2.619739532470703,12.377290725708008,3.2833380699157715,11.996794700622559,4.0,12.0)
                lineTo(20.0,12.0)
                curveTo(20.71666145324707,11.996794700622559,21.380260467529297,12.377290725708008,21.739519119262695,12.997408866882324)
                curveTo(22.098779678344727,13.617527961730957,22.098779678344727,14.382472038269043,21.739519119262695,15.002591133117676)
                curveTo(21.380260467529297,15.622709274291992,20.71666145324707,16.003204345703125,20.0,16.0)
                lineTo(15.75,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.0)
                curveTo(3.895430564880371,12.0,3.0,11.104569435119629,3.0,10.0)
                curveTo(3.0221588611602783,6.146226406097412,7.045098781585693,3.0312349796295166,12.0,3.0312349796295166)
                curveTo(16.95490074157715,3.0312349796295166,20.977840423583984,6.146226406097412,21.0,10.0)
                curveTo(21.0,11.104569435119629,20.104570388793945,12.0,19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,16.0)
                curveTo(3.895430564880371,16.0,3.0,16.895429611206055,3.0,18.0)
                curveTo(3.0,19.6568546295166,4.343145847320557,21.0,6.0,21.0)
                lineTo(18.0,21.0)
                curveTo(19.6568546295166,21.0,21.0,19.6568546295166,21.0,18.0)
                curveTo(21.0,16.895429611206055,20.104570388793945,16.0,19.0,16.0)
                quadTo(19.0,16.0,19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.670000076293945,12.0)
                lineTo(12.800000190734863,16.600000381469727)
                curveTo(13.224346160888672,16.91826057434082,13.75774097442627,17.054914474487305,14.282842636108398,16.979900360107422)
                curveTo(14.807945251464844,16.904884338378906,15.281740188598633,16.624347686767578,15.600000381469727,16.200000762939453)
                lineTo(18.75,12.000000953674316)
            }
}

public val LucideIcons.All.HamburgerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hamburger: ImageVector
    @Composable get() = HamburgerDefinition.asImageVector()
