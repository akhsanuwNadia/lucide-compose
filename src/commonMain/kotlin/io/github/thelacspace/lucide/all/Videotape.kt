package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Videotape") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                curveTo(5.996795177459717,14.71666145324707,6.37729024887085,15.380260467529297,6.997409343719482,15.739520072937012)
                curveTo(7.617527961730957,16.098779678344727,8.382472038269043,16.098779678344727,9.002591133117676,15.739520072937012)
                curveTo(9.622709274291992,15.380260467529297,10.003205299377441,14.71666145324707,10.0,14.0)
                curveTo(10.003205299377441,13.28333854675293,9.622709274291992,12.619739532470703,9.002591133117676,12.260479927062988)
                curveTo(8.382472038269043,11.90122127532959,7.617527961730957,11.90122127532959,6.997409343719482,12.260479927062988)
                curveTo(6.37729024887085,12.619739532470703,5.996795177459717,13.28333854675293,6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                curveTo(13.996794700622559,14.71666145324707,14.377290725708008,15.380260467529297,14.997408866882324,15.739520072937012)
                curveTo(15.617527961730957,16.098779678344727,16.38247299194336,16.098779678344727,17.00259017944336,15.739520072937012)
                curveTo(17.622709274291992,15.380260467529297,18.003204345703125,14.71666145324707,18.0,14.0)
                curveTo(18.003204345703125,13.28333854675293,17.622709274291992,12.619739532470703,17.00259017944336,12.260479927062988)
                curveTo(16.38247299194336,11.90122127532959,15.617527961730957,11.90122127532959,14.997408866882324,12.260479927062988)
                curveTo(14.377290725708008,12.619739532470703,13.996794700622559,13.28333854675293,14.0,14.0)
            }
}

public val LucideIcons.All.VideotapeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Videotape: ImageVector
    @Composable get() = VideotapeDefinition.asImageVector()
