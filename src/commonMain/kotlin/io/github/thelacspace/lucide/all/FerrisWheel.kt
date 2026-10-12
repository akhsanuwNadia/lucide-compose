package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FerrisWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                curveTo(9.996794700622559,12.71666145324707,10.377290725708008,13.380260467529297,10.997408866882324,13.739520072937012)
                curveTo(11.617527961730957,14.09877872467041,12.382472038269043,14.09877872467041,13.002591133117676,13.739520072937012)
                curveTo(13.622709274291992,13.380260467529297,14.003205299377441,12.71666145324707,14.0,12.0)
                curveTo(14.003205299377441,11.28333854675293,13.622709274291992,10.619739532470703,13.002591133117676,10.260479927062988)
                curveTo(12.382472038269043,9.90122127532959,11.617527961730957,9.90122127532959,10.997408866882324,10.260479927062988)
                curveTo(10.377290725708008,10.619739532470703,9.996794700622559,11.28333854675293,10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.800000190734863,15.0)
                lineTo(3.3000001907348633,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.700000762939453,7.0)
                lineTo(17.200000762939453,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.800000190734863,9.0)
                lineTo(3.299999952316284,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.700000762939453,17.0)
                lineTo(17.200000762939453,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                lineTo(12.0,14.0)
                lineTo(15.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,18.700000762939453)
                curveTo(20.781328201293945,16.212305068969727,21.73904800415039,12.266304016113281,20.407550811767578,8.78039836883545)
                curveTo(19.076053619384766,5.294492244720459,15.731544494628906,2.9917967319488525,12.0,2.9917967319488525)
                curveTo(8.268455505371094,2.9917967319488525,4.923946380615234,5.294492244720459,3.5924487113952637,8.78039836883545)
                curveTo(2.260951280593872,12.266304016113281,3.2186708450317383,16.212305068969727,6.0,18.700000762939453)
            }
}

public val LucideIcons.All.FerrisWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FerrisWheel: ImageVector
    @Composable get() = FerrisWheelDefinition.asImageVector()
