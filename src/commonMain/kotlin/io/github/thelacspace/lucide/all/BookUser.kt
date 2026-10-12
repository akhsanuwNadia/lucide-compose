package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookUser") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                curveTo(15.004807472229004,11.925006866455078,14.434064865112305,10.929609298706055,13.503886222839355,10.39072036743164)
                curveTo(12.573708534240723,9.851831436157227,11.426291465759277,9.851831436157227,10.496113777160645,10.39072036743164)
                curveTo(9.565935134887695,10.929609298706055,8.995192527770996,11.925006866455078,9.0,13.0)
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
                moveTo(10.0,8.0)
                curveTo(9.996794700622559,8.71666145324707,10.377290725708008,9.380260467529297,10.997408866882324,9.739520072937012)
                curveTo(11.617527961730957,10.09877872467041,12.382472038269043,10.09877872467041,13.002591133117676,9.739520072937012)
                curveTo(13.622709274291992,9.380260467529297,14.003205299377441,8.71666145324707,14.0,8.0)
                curveTo(14.003205299377441,7.2833380699157715,13.622709274291992,6.619739532470703,13.002591133117676,6.2604804039001465)
                curveTo(12.382472038269043,5.901220798492432,11.617527961730957,5.901220798492432,10.997408866882324,6.2604804039001465)
                curveTo(10.377290725708008,6.619739532470703,9.996794700622559,7.2833380699157715,10.0,8.0)
            }
}

public val LucideIcons.All.BookUserDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookUser: ImageVector
    @Composable get() = BookUserDefinition.asImageVector()
