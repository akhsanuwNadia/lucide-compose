package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BaggageClaim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(6.0,18.0)
                curveTo(4.895430564880371,18.0,4.0,17.104570388793945,4.0,16.0)
                lineTo(4.0,7.0)
                curveTo(4.0,5.895430564880371,3.104569435119629,5.0,2.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.0,4.0)
                curveTo(17.0,2.895430564880371,16.104570388793945,2.0,15.0,2.0)
                lineTo(14.0,2.0)
                curveTo(12.895430564880371,2.0,12.0,2.895430564880371,12.0,4.0)
                lineTo(12.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(20.0,6.0)
                lineTo(21.0,6.0)
                lineTo(21.0,14.0)
                lineTo(20.0,14.0)
                lineTo(9.0,14.0)
                lineTo(8.0,14.0)
                lineTo(8.0,6.0)
                lineTo(9.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,20.0)
                curveTo(15.996794700622559,20.71666145324707,16.377290725708008,21.380260467529297,16.99740982055664,21.739519119262695)
                curveTo(17.61752700805664,22.098779678344727,18.38247299194336,22.098779678344727,19.00259017944336,21.739519119262695)
                curveTo(19.622709274291992,21.380260467529297,20.003204345703125,20.71666145324707,20.0,20.0)
                curveTo(20.003204345703125,19.28333854675293,19.622709274291992,18.619739532470703,19.00259017944336,18.260480880737305)
                curveTo(18.38247299194336,17.901220321655273,17.61752700805664,17.901220321655273,16.99740982055664,18.260480880737305)
                curveTo(16.377290725708008,18.619739532470703,15.996794700622559,19.28333854675293,16.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                curveTo(6.996795177459717,20.71666145324707,7.37729024887085,21.380260467529297,7.997409343719482,21.739519119262695)
                curveTo(8.617527961730957,22.098779678344727,9.382472038269043,22.098779678344727,10.002591133117676,21.739519119262695)
                curveTo(10.622709274291992,21.380260467529297,11.003205299377441,20.71666145324707,11.0,20.0)
                curveTo(11.003205299377441,19.28333854675293,10.622709274291992,18.619739532470703,10.002591133117676,18.260480880737305)
                curveTo(9.382472038269043,17.901220321655273,8.617527961730957,17.901220321655273,7.997409343719482,18.260480880737305)
                curveTo(7.37729024887085,18.619739532470703,6.996795177459717,19.28333854675293,7.0,20.0)
            }
}

public val LucideIcons.All.BaggageClaimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BaggageClaim: ImageVector
    @Composable get() = BaggageClaimDefinition.asImageVector()
