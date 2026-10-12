package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircuitBoard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,9.0)
                lineTo(15.0,9.0)
                curveTo(16.104570388793945,9.0,17.0,8.104569435119629,17.0,7.0)
                lineTo(17.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                curveTo(6.996795177459717,9.71666145324707,7.37729024887085,10.380260467529297,7.997409343719482,10.739520072937012)
                curveTo(8.617527961730957,11.09877872467041,9.382472038269043,11.09877872467041,10.002591133117676,10.739520072937012)
                curveTo(10.622709274291992,10.380260467529297,11.003205299377441,9.71666145324707,11.0,9.0)
                curveTo(11.003205299377441,8.28333854675293,10.622709274291992,7.619739532470703,10.002591133117676,7.2604804039001465)
                curveTo(9.382472038269043,6.901220798492432,8.617527961730957,6.901220798492432,7.997409343719482,7.2604804039001465)
                curveTo(7.37729024887085,7.619739532470703,6.996795177459717,8.28333854675293,7.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(7.0,17.0)
                curveTo(7.0,15.895430564880371,7.895430564880371,15.0,9.0,15.0)
                lineTo(13.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,15.0)
                curveTo(12.996794700622559,15.71666145324707,13.377290725708008,16.380260467529297,13.997408866882324,16.739519119262695)
                curveTo(14.617527961730957,17.098779678344727,15.382472038269043,17.098779678344727,16.00259017944336,16.739519119262695)
                curveTo(16.622709274291992,16.380260467529297,17.003204345703125,15.71666145324707,17.0,15.0)
                curveTo(17.003204345703125,14.28333854675293,16.622709274291992,13.619739532470703,16.00259017944336,13.260479927062988)
                curveTo(15.382472038269043,12.90122127532959,14.617527961730957,12.90122127532959,13.997408866882324,13.260479927062988)
                curveTo(13.377290725708008,13.619739532470703,12.996794700622559,14.28333854675293,13.0,15.0)
            }
}

public val LucideIcons.All.CircuitBoardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircuitBoard: ImageVector
    @Composable get() = CircuitBoardDefinition.asImageVector()
