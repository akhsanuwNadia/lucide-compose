package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.246999740600586,7.761000156402588)
                curveTo(18.585294723510742,10.103310585021973,18.585294723510742,13.896689414978027,16.246999740600586,16.23900032043457)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075000762939453,4.933000087738037)
                curveTo(22.974822998046875,8.837310791015625,22.974822998046875,15.162689208984375,19.075000762939453,19.066999435424805)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925000190734863,19.066999435424805)
                curveTo(1.025178074836731,15.162689208984375,1.025178074836731,8.837309837341309,4.925000190734863,4.932999610900879)
            }
            lucidePath(strokeWidth) {
                moveTo(7.752999782562256,16.23900032043457)
                curveTo(5.414704322814941,13.896690368652344,5.414704322814941,10.103310585021973,7.752999782562256,7.761000633239746)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                curveTo(9.996794700622559,12.71666145324707,10.377290725708008,13.380260467529297,10.997408866882324,13.739520072937012)
                curveTo(11.617527961730957,14.09877872467041,12.382472038269043,14.09877872467041,13.002591133117676,13.739520072937012)
                curveTo(13.622709274291992,13.380260467529297,14.003205299377441,12.71666145324707,14.0,12.0)
                curveTo(14.003205299377441,11.28333854675293,13.622709274291992,10.619739532470703,13.002591133117676,10.260479927062988)
                curveTo(12.382472038269043,9.90122127532959,11.617527961730957,9.90122127532959,10.997408866882324,10.260479927062988)
                curveTo(10.377290725708008,10.619739532470703,9.996794700622559,11.28333854675293,10.0,12.0)
            }
}

public val LucideIcons.All.RadioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radio: ImageVector
    @Composable get() = RadioDefinition.asImageVector()
