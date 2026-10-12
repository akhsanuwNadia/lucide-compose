package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefBass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,11.0)
                lineTo(19.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,6.0)
                lineTo(19.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                curveTo(5.0,4.0,9.0,4.0,9.0,4.0)
                curveTo(15.0,4.0,15.0,10.0,15.0,10.0)
                curveTo(15.0,17.0,5.0,21.0,5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                curveTo(4.996795177459717,8.71666145324707,5.37729024887085,9.380260467529297,5.997409343719482,9.739520072937012)
                curveTo(6.617527961730957,10.09877872467041,7.382472038269043,10.09877872467041,8.002591133117676,9.739520072937012)
                curveTo(8.622709274291992,9.380260467529297,9.003205299377441,8.71666145324707,9.0,8.0)
                curveTo(9.003205299377441,7.2833380699157715,8.622709274291992,6.619739532470703,8.002591133117676,6.2604804039001465)
                curveTo(7.382472038269043,5.901220798492432,6.617527961730957,5.901220798492432,5.997409343719482,6.2604804039001465)
                curveTo(5.37729024887085,6.619739532470703,4.996795177459717,7.2833380699157715,5.0,8.0)
            }
}

public val LucideIcons.All.ClefBassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefBass: ImageVector
    @Composable get() = ClefBassDefinition.asImageVector()
