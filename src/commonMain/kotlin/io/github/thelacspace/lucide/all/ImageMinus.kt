package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,5.0)
                lineTo(22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                curveTo(6.996795177459717,9.71666145324707,7.37729024887085,10.380260467529297,7.997409343719482,10.739520072937012)
                curveTo(8.617527961730957,11.09877872467041,9.382472038269043,11.09877872467041,10.002591133117676,10.739520072937012)
                curveTo(10.622709274291992,10.380260467529297,11.003205299377441,9.71666145324707,11.0,9.0)
                curveTo(11.003205299377441,8.28333854675293,10.622709274291992,7.619739532470703,10.002591133117676,7.2604804039001465)
                curveTo(9.382472038269043,6.901220798492432,8.617527961730957,6.901220798492432,7.997409343719482,7.2604804039001465)
                curveTo(7.37729024887085,7.619739532470703,6.996795177459717,8.28333854675293,7.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(17.913999557495117,11.913999557495117)
                curveTo(17.132999420166016,11.133235931396484,15.866999626159668,11.133235931396484,15.085999488830566,11.913999557495117)
                lineTo(6.0,21.0)
            }
}

public val LucideIcons.All.ImageMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageMinus: ImageVector
    @Composable get() = ImageMinusDefinition.asImageVector()
