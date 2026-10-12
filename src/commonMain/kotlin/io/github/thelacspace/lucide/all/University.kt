package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("University") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(14.0,18.0)
                curveTo(13.995076179504395,16.898921966552734,13.101089477539062,16.00892448425293,12.0,16.00892448425293)
                curveTo(10.898910522460938,16.00892448425293,10.004923820495605,16.898921966552734,10.0,18.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                lineTo(18.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                curveTo(22.0,6.4477152824401855,21.552284240722656,6.0,21.0,6.0)
                lineTo(19.0,6.0)
                curveTo(18.591266632080078,5.999939918518066,18.192365646362305,5.874650478363037,17.85700035095215,5.640999794006348)
                lineTo(13.142999649047852,2.359999895095825)
                curveTo(12.456295013427734,1.8813047409057617,11.544122695922852,1.8809057474136353,10.856999397277832,2.3589999675750732)
                lineTo(6.14300012588501,5.639999866485596)
                curveTo(5.807751178741455,5.874005317687988,5.408840179443359,5.9996466636657715,5.0,6.0)
                lineTo(3.0,6.0)
                curveTo(2.4477152824401855,6.0,2.0,6.4477152824401855,2.0,7.0)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(6.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(6.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                curveTo(9.996794700622559,10.71666145324707,10.377290725708008,11.380260467529297,10.997408866882324,11.739520072937012)
                curveTo(11.617527961730957,12.09877872467041,12.382472038269043,12.09877872467041,13.002591133117676,11.739520072937012)
                curveTo(13.622709274291992,11.380260467529297,14.003205299377441,10.71666145324707,14.0,10.0)
                curveTo(14.003205299377441,9.28333854675293,13.622709274291992,8.619739532470703,13.002591133117676,8.260479927062988)
                curveTo(12.382472038269043,7.901220798492432,11.617527961730957,7.901220798492432,10.997408866882324,8.260479927062988)
                curveTo(10.377290725708008,8.619739532470703,9.996794700622559,9.28333854675293,10.0,10.0)
            }
}

public val LucideIcons.All.UniversityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.University: ImageVector
    @Composable get() = UniversityDefinition.asImageVector()
