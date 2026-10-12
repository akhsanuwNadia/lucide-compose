package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BoomBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(4.0,5.0)
                curveTo(4.0,3.895430564880371,4.895430564880371,3.0,6.0,3.0)
                lineTo(18.0,3.0)
                curveTo(19.104570388793945,3.0,20.0,3.895430564880371,20.0,5.0)
                lineTo(20.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(8.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(16.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(20.0,9.0)
                lineTo(22.0,9.0)
                lineTo(22.0,21.0)
                lineTo(20.0,21.0)
                lineTo(4.0,21.0)
                lineTo(2.0,21.0)
                lineTo(2.0,9.0)
                lineTo(4.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                curveTo(5.996795177459717,15.71666145324707,6.37729024887085,16.380260467529297,6.997409343719482,16.739519119262695)
                curveTo(7.617527961730957,17.098779678344727,8.382472038269043,17.098779678344727,9.002591133117676,16.739519119262695)
                curveTo(9.622709274291992,16.380260467529297,10.003205299377441,15.71666145324707,10.0,15.0)
                curveTo(10.003205299377441,14.28333854675293,9.622709274291992,13.619739532470703,9.002591133117676,13.260479927062988)
                curveTo(8.382472038269043,12.90122127532959,7.617527961730957,12.90122127532959,6.997409343719482,13.260479927062988)
                curveTo(6.37729024887085,13.619739532470703,5.996795177459717,14.28333854675293,6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                curveTo(13.996794700622559,15.71666145324707,14.377290725708008,16.380260467529297,14.997408866882324,16.739519119262695)
                curveTo(15.617527961730957,17.098779678344727,16.38247299194336,17.098779678344727,17.00259017944336,16.739519119262695)
                curveTo(17.622709274291992,16.380260467529297,18.003204345703125,15.71666145324707,18.0,15.0)
                curveTo(18.003204345703125,14.28333854675293,17.622709274291992,13.619739532470703,17.00259017944336,13.260479927062988)
                curveTo(16.38247299194336,12.90122127532959,15.617527961730957,12.90122127532959,14.997408866882324,13.260479927062988)
                curveTo(14.377290725708008,13.619739532470703,13.996794700622559,14.28333854675293,14.0,15.0)
            }
}

public val LucideIcons.All.BoomBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BoomBox: ImageVector
    @Composable get() = BoomBoxDefinition.asImageVector()
