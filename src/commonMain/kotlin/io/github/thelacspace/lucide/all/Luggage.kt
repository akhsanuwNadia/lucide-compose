package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Luggage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                curveTo(4.895430564880371,20.0,4.0,19.104570388793945,4.0,18.0)
                lineTo(4.0,8.0)
                curveTo(4.0,6.895430564880371,4.895430564880371,6.0,6.0,6.0)
                lineTo(18.0,6.0)
                curveTo(19.104570388793945,6.0,20.0,6.895430564880371,20.0,8.0)
                lineTo(20.0,18.0)
                curveTo(20.0,19.104570388793945,19.104570388793945,20.0,18.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(8.0,4.0)
                curveTo(8.0,2.895430564880371,8.895430564880371,2.0,10.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
                lineTo(16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
                lineTo(14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                curveTo(13.996794700622559,20.71666145324707,14.377290725708008,21.380260467529297,14.997408866882324,21.739519119262695)
                curveTo(15.617527961730957,22.098779678344727,16.38247299194336,22.098779678344727,17.00259017944336,21.739519119262695)
                curveTo(17.622709274291992,21.380260467529297,18.003204345703125,20.71666145324707,18.0,20.0)
                curveTo(18.003204345703125,19.28333854675293,17.622709274291992,18.619739532470703,17.00259017944336,18.260480880737305)
                curveTo(16.38247299194336,17.901220321655273,15.617527961730957,17.901220321655273,14.997408866882324,18.260480880737305)
                curveTo(14.377290725708008,18.619739532470703,13.996794700622559,19.28333854675293,14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                curveTo(5.996795177459717,20.71666145324707,6.37729024887085,21.380260467529297,6.997409343719482,21.739519119262695)
                curveTo(7.617527961730957,22.098779678344727,8.382472038269043,22.098779678344727,9.002591133117676,21.739519119262695)
                curveTo(9.622709274291992,21.380260467529297,10.003205299377441,20.71666145324707,10.0,20.0)
                curveTo(10.003205299377441,19.28333854675293,9.622709274291992,18.619739532470703,9.002591133117676,18.260480880737305)
                curveTo(8.382472038269043,17.901220321655273,7.617527961730957,17.901220321655273,6.997409343719482,18.260480880737305)
                curveTo(6.37729024887085,18.619739532470703,5.996795177459717,19.28333854675293,6.0,20.0)
            }
}

public val LucideIcons.All.LuggageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Luggage: ImageVector
    @Composable get() = LuggageDefinition.asImageVector()
