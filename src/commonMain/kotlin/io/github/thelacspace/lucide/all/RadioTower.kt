package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioTower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.900000095367432,16.100000381469727)
                curveTo(1.0,12.199999809265137,1.0,5.800000190734863,4.900000095367432,1.899999976158142)
            }
            lucidePath(strokeWidth) {
                moveTo(7.800000190734863,4.699999809265137)
                curveTo(5.848255634307861,6.72226619720459,5.518732070922852,9.811545372009277,7.0,12.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                curveTo(9.996794700622559,9.71666145324707,10.377290725708008,10.380260467529297,10.997408866882324,10.739520072937012)
                curveTo(11.617527961730957,11.09877872467041,12.382472038269043,11.09877872467041,13.002591133117676,10.739520072937012)
                curveTo(13.622709274291992,10.380260467529297,14.003205299377441,9.71666145324707,14.0,9.0)
                curveTo(14.003205299377441,8.28333854675293,13.622709274291992,7.619739532470703,13.002591133117676,7.2604804039001465)
                curveTo(12.382472038269043,6.901220798492432,11.617527961730957,6.901220798492432,10.997408866882324,7.2604804039001465)
                curveTo(10.377290725708008,7.619739532470703,9.996794700622559,8.28333854675293,10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.200000762939453,4.800000190734863)
                curveTo(18.200000762939453,6.800000190734863,18.46000099182129,9.90999984741211,17.0,12.270000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(19.100000381469727,1.899999976158142)
                curveTo(20.972280502319336,3.7684459686279297,22.02444076538086,6.304905414581299,22.02444076538086,8.949999809265137)
                curveTo(22.02444076538086,11.595094680786133,20.972280502319336,14.131553649902344,19.100000381469727,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,18.0)
                lineTo(14.5,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(12.0,11.0)
                lineTo(16.0,22.0)
            }
}

public val LucideIcons.All.RadioTowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioTower: ImageVector
    @Composable get() = RadioTowerDefinition.asImageVector()
