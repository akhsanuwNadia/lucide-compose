package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(15.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(21.600000381469727,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,18.0)
                lineTo(21.0,18.0)
                curveTo(21.0,18.0,21.5,16.299999237060547,21.799999237060547,15.199999809265137)
                curveTo(21.899999618530273,14.800000190734863,22.0,14.399999618530273,22.0,14.0)
                curveTo(22.0,13.600000381469727,21.899999618530273,13.199999809265137,21.799999237060547,12.800000190734863)
                lineTo(20.399999618530273,7.800000190734863)
                curveTo(20.100000381469727,6.800000190734863,19.100000381469727,6.0,18.0,6.0)
                lineTo(4.0,6.0)
                curveTo(2.895430564880371,6.0,2.0,6.895430564880371,2.0,8.0)
                lineTo(2.0,18.0)
                lineTo(5.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                curveTo(4.996795177459717,18.71666145324707,5.37729024887085,19.380260467529297,5.997409343719482,19.739519119262695)
                curveTo(6.617527961730957,20.098779678344727,7.382472038269043,20.098779678344727,8.002591133117676,19.739519119262695)
                curveTo(8.622709274291992,19.380260467529297,9.003205299377441,18.71666145324707,9.0,18.0)
                curveTo(9.003205299377441,17.28333854675293,8.622709274291992,16.619739532470703,8.002591133117676,16.260480880737305)
                curveTo(7.382472038269043,15.90122127532959,6.617527961730957,15.90122127532959,5.997409343719482,16.260480880737305)
                curveTo(5.37729024887085,16.619739532470703,4.996795177459717,17.28333854675293,5.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(14.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                curveTo(13.996794700622559,18.71666145324707,14.377290725708008,19.380260467529297,14.997408866882324,19.739519119262695)
                curveTo(15.617527961730957,20.098779678344727,16.38247299194336,20.098779678344727,17.00259017944336,19.739519119262695)
                curveTo(17.622709274291992,19.380260467529297,18.003204345703125,18.71666145324707,18.0,18.0)
                curveTo(18.003204345703125,17.28333854675293,17.622709274291992,16.619739532470703,17.00259017944336,16.260480880737305)
                curveTo(16.38247299194336,15.90122127532959,15.617527961730957,15.90122127532959,14.997408866882324,16.260480880737305)
                curveTo(14.377290725708008,16.619739532470703,13.996794700622559,17.28333854675293,14.0,18.0)
            }
}

public val LucideIcons.All.BusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bus: ImageVector
    @Composable get() = BusDefinition.asImageVector()
