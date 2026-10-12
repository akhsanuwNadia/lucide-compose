package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Birdhouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,18.0)
                lineTo(18.95599937438965,6.531999588012695)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,8.0)
                lineTo(10.819999694824219,2.385000228881836)
                curveTo(11.522839546203613,1.8714090585708618,12.47715950012207,1.8714090585708618,13.179999351501465,2.385000228881836)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(5.044000148773193,6.5320000648498535)
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

public val LucideIcons.All.BirdhouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Birdhouse: ImageVector
    @Composable get() = BirdhouseDefinition.asImageVector()
