package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CassetteTape") { strokeWidth ->
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
                moveTo(6.0,10.0)
                curveTo(5.996795177459717,10.71666145324707,6.37729024887085,11.380260467529297,6.997409343719482,11.739520072937012)
                curveTo(7.617527961730957,12.09877872467041,8.382472038269043,12.09877872467041,9.002591133117676,11.739520072937012)
                curveTo(9.622709274291992,11.380260467529297,10.003205299377441,10.71666145324707,10.0,10.0)
                curveTo(10.003205299377441,9.28333854675293,9.622709274291992,8.619739532470703,9.002591133117676,8.260479927062988)
                curveTo(8.382472038269043,7.901220798492432,7.617527961730957,7.901220798492432,6.997409343719482,8.260479927062988)
                curveTo(6.37729024887085,8.619739532470703,5.996795177459717,9.28333854675293,6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                curveTo(13.996794700622559,10.71666145324707,14.377290725708008,11.380260467529297,14.997408866882324,11.739520072937012)
                curveTo(15.617527961730957,12.09877872467041,16.38247299194336,12.09877872467041,17.00259017944336,11.739520072937012)
                curveTo(17.622709274291992,11.380260467529297,18.003204345703125,10.71666145324707,18.0,10.0)
                curveTo(18.003204345703125,9.28333854675293,17.622709274291992,8.619739532470703,17.00259017944336,8.260479927062988)
                curveTo(16.38247299194336,7.901220798492432,15.617527961730957,7.901220798492432,14.997408866882324,8.260479927062988)
                curveTo(14.377290725708008,8.619739532470703,13.996794700622559,9.28333854675293,14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(6.699999809265137,17.100000381469727)
                curveTo(6.843375205993652,16.445598602294922,7.430255889892578,15.984477996826172,8.100000381469727,16.0)
                lineTo(15.90000057220459,16.0)
                curveTo(16.54059410095215,15.973437309265137,17.117366790771484,16.385417938232422,17.30000114440918,17.0)
                lineTo(18.000001907348633,20.0)
            }
}

public val LucideIcons.All.CassetteTapeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CassetteTape: ImageVector
    @Composable get() = CassetteTapeDefinition.asImageVector()
