package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCcwKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0,16.970561981201172,7.029437065124512,21.0,12.0,21.0)
                curveTo(16.970561981201172,21.0,21.0,16.970561981201172,21.0,12.0)
                curveTo(21.0,7.029437065124512,16.970561981201172,3.0,12.0,3.0)
                curveTo(9.483747482299805,3.0084269046783447,7.068391799926758,3.9903368949890137,5.260000228881836,5.739999771118164)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,8.0)
                lineTo(8.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                curveTo(9.996794700622559,15.71666145324707,10.377290725708008,16.380260467529297,10.997408866882324,16.739519119262695)
                curveTo(11.617527961730957,17.098779678344727,12.382472038269043,17.098779678344727,13.002591133117676,16.739519119262695)
                curveTo(13.622709274291992,16.380260467529297,14.003205299377441,15.71666145324707,14.0,15.0)
                curveTo(14.003205299377441,14.28333854675293,13.622709274291992,13.619739532470703,13.002591133117676,13.260479927062988)
                curveTo(12.382472038269043,12.90122127532959,11.617527961730957,12.90122127532959,10.997408866882324,13.260479927062988)
                curveTo(10.377290725708008,13.619739532470703,9.996794700622559,14.28333854675293,10.0,15.0)
            }
}

public val LucideIcons.All.RotateCcwKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCcwKey: ImageVector
    @Composable get() = RotateCcwKeyDefinition.asImageVector()
