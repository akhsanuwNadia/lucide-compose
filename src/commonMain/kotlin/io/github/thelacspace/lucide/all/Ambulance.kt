package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ambulance") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(14.0,6.0)
                curveTo(14.0,4.895430564880371,13.104569435119629,4.0,12.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,17.0)
                curveTo(2.0,17.552284240722656,2.4477152824401855,18.0,3.0,18.0)
                lineTo(5.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,18.0)
                lineTo(21.0,18.0)
                curveTo(21.552284240722656,18.0,22.0,17.552284240722656,22.0,17.0)
                lineTo(22.0,13.720000267028809)
                curveTo(21.99967384338379,13.28976058959961,21.724193572998047,12.90795612335205,21.31599998474121,12.772000312805176)
                lineTo(19.39299964904785,12.131000518798828)
                curveTo(19.141372680664062,12.046960830688477,18.933452606201172,11.866377830505371,18.815000534057617,11.629000663757324)
                lineTo(17.2760009765625,8.553000450134277)
                curveTo(17.10673713684082,8.21427059173584,16.760665893554688,8.000202178955078,16.381999969482422,8.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                curveTo(14.996794700622559,18.71666145324707,15.377290725708008,19.380260467529297,15.997408866882324,19.739519119262695)
                curveTo(16.61752700805664,20.098779678344727,17.38247299194336,20.098779678344727,18.00259017944336,19.739519119262695)
                curveTo(18.622709274291992,19.380260467529297,19.003204345703125,18.71666145324707,19.0,18.0)
                curveTo(19.003204345703125,17.28333854675293,18.622709274291992,16.619739532470703,18.00259017944336,16.260480880737305)
                curveTo(17.38247299194336,15.90122127532959,16.61752700805664,15.90122127532959,15.997408866882324,16.260480880737305)
                curveTo(15.377290725708008,16.619739532470703,14.996794700622559,17.28333854675293,15.0,18.0)
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
}

public val LucideIcons.All.AmbulanceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ambulance: ImageVector
    @Composable get() = AmbulanceDefinition.asImageVector()
