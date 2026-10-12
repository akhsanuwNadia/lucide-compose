package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                curveTo(12.0,3.3431458473205566,13.343145370483398,2.0,15.0,2.0)
                curveTo(16.6568546295166,2.0,18.0,3.3431458473205566,18.0,5.0)
                curveTo(18.0,6.656854152679443,16.6568546295166,8.0,15.0,8.0)
                moveTo(12.0,5.0)
                curveTo(12.0,3.3431458473205566,10.656854629516602,2.0,9.0,2.0)
                curveTo(7.343145847320557,2.0,6.0,3.3431458473205566,6.0,5.0)
                curveTo(6.0,6.656854152679443,7.343145847320557,8.0,9.0,8.0)
                moveTo(12.0,5.0)
                lineTo(12.0,6.0)
                moveTo(9.0,8.0)
                curveTo(7.343145847320557,8.0,6.0,9.343145370483398,6.0,11.0)
                curveTo(6.0,12.656854629516602,7.343145847320557,14.0,9.0,14.0)
                curveTo(10.656854629516602,14.0,12.0,12.656854629516602,12.0,11.0)
                moveTo(9.0,8.0)
                lineTo(10.0,8.0)
                moveTo(15.0,8.0)
                curveTo(16.6568546295166,8.0,18.0,9.343145370483398,18.0,11.0)
                curveTo(18.0,12.656854629516602,16.6568546295166,14.0,15.0,14.0)
                curveTo(13.343145370483398,14.0,12.0,12.656854629516602,12.0,11.0)
                moveTo(15.0,8.0)
                lineTo(14.0,8.0)
                moveTo(12.0,11.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                curveTo(9.996794700622559,8.71666145324707,10.377290725708008,9.380260467529297,10.997408866882324,9.739520072937012)
                curveTo(11.617527961730957,10.09877872467041,12.382472038269043,10.09877872467041,13.002591133117676,9.739520072937012)
                curveTo(13.622709274291992,9.380260467529297,14.003205299377441,8.71666145324707,14.0,8.0)
                curveTo(14.003205299377441,7.2833380699157715,13.622709274291992,6.619739532470703,13.002591133117676,6.2604804039001465)
                curveTo(12.382472038269043,5.901220798492432,11.617527961730957,5.901220798492432,10.997408866882324,6.2604804039001465)
                curveTo(10.377290725708008,6.619739532470703,9.996794700622559,7.2833380699157715,10.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                curveTo(16.200000762939453,22.0,19.0,20.33300018310547,19.0,17.0)
                curveTo(14.800000190734863,17.0,12.0,18.66699981689453,12.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                curveTo(7.800000190734863,22.0,5.0,20.33300018310547,5.0,17.0)
                curveTo(9.199999809265137,17.0,12.0,18.66699981689453,12.0,22.0)
                close()
            }
}

public val LucideIcons.All.Flower2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower2: ImageVector
    @Composable get() = Flower2Definition.asImageVector()
