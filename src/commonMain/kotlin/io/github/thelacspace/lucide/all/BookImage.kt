package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookImage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,13.699999809265137)
                lineTo(17.899999618530273,11.600000381469727)
                curveTo(17.122312545776367,10.837714195251465,15.877686500549316,10.837714195251465,15.09999942779541,11.600000381469727)
                lineTo(9.699999809265137,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,19.5)
                lineTo(4.0,4.5)
                curveTo(4.0,3.119288206100464,5.119287967681885,2.0,6.5,2.0)
                lineTo(19.0,2.0)
                curveTo(19.552284240722656,2.0,20.0,2.4477152824401855,20.0,3.0)
                lineTo(20.0,21.0)
                curveTo(20.0,21.552284240722656,19.552284240722656,22.0,19.0,22.0)
                lineTo(6.5,22.0)
                curveTo(5.123652458190918,21.993844985961914,4.011155605316162,20.876361846923828,4.011155605316162,19.5)
                curveTo(4.011155605316162,18.123638153076172,5.123652458190918,17.006155014038086,6.5,17.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                curveTo(7.996795177459717,8.71666145324707,8.377290725708008,9.380260467529297,8.997408866882324,9.739520072937012)
                curveTo(9.617527961730957,10.09877872467041,10.382472038269043,10.09877872467041,11.002591133117676,9.739520072937012)
                curveTo(11.622709274291992,9.380260467529297,12.003205299377441,8.71666145324707,12.0,8.0)
                curveTo(12.003205299377441,7.2833380699157715,11.622709274291992,6.619739532470703,11.002591133117676,6.2604804039001465)
                curveTo(10.382472038269043,5.901220798492432,9.617527961730957,5.901220798492432,8.997408866882324,6.2604804039001465)
                curveTo(8.377290725708008,6.619739532470703,7.996795177459717,7.2833380699157715,8.0,8.0)
            }
}

public val LucideIcons.All.BookImageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookImage: ImageVector
    @Composable get() = BookImageDefinition.asImageVector()
