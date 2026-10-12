package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gpu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                lineTo(20.0,17.0)
                curveTo(21.104570388793945,17.0,22.0,16.104570388793945,22.0,15.0)
                lineTo(22.0,7.0)
                curveTo(22.0,5.895430564880371,21.104570388793945,5.0,20.0,5.0)
                lineTo(2.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(2.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(7.0,20.0)
                curveTo(7.0,20.552284240722656,7.4477152824401855,21.0,8.0,21.0)
                lineTo(13.0,21.0)
                curveTo(13.552285194396973,21.0,14.0,20.552284240722656,14.0,20.0)
                lineTo(14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,11.0)
                curveTo(13.996794700622559,11.71666145324707,14.377290725708008,12.380260467529297,14.997408866882324,12.739520072937012)
                curveTo(15.617527961730957,13.09877872467041,16.38247299194336,13.09877872467041,17.00259017944336,12.739520072937012)
                curveTo(17.622709274291992,12.380260467529297,18.003204345703125,11.71666145324707,18.0,11.0)
                curveTo(18.003204345703125,10.28333854675293,17.622709274291992,9.619739532470703,17.00259017944336,9.260479927062988)
                curveTo(16.38247299194336,8.90122127532959,15.617527961730957,8.90122127532959,14.997408866882324,9.260479927062988)
                curveTo(14.377290725708008,9.619739532470703,13.996794700622559,10.28333854675293,14.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                curveTo(5.996795177459717,11.71666145324707,6.37729024887085,12.380260467529297,6.997409343719482,12.739520072937012)
                curveTo(7.617527961730957,13.09877872467041,8.382472038269043,13.09877872467041,9.002591133117676,12.739520072937012)
                curveTo(9.622709274291992,12.380260467529297,10.003205299377441,11.71666145324707,10.0,11.0)
                curveTo(10.003205299377441,10.28333854675293,9.622709274291992,9.619739532470703,9.002591133117676,9.260479927062988)
                curveTo(8.382472038269043,8.90122127532959,7.617527961730957,8.90122127532959,6.997409343719482,9.260479927062988)
                curveTo(6.37729024887085,9.619739532470703,5.996795177459717,10.28333854675293,6.0,11.0)
            }
}

public val LucideIcons.All.GpuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gpu: ImageVector
    @Composable get() = GpuDefinition.asImageVector()
