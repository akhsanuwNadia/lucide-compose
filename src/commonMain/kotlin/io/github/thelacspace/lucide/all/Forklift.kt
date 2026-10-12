package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forklift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(5.0,12.0)
                curveTo(3.895430564880371,12.0,3.0,12.895430564880371,3.0,14.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,19.0)
                lineTo(22.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(6.0,7.0)
                curveTo(6.0,5.895430564880371,6.895430564880371,5.0,8.0,5.0)
                lineTo(10.17199993133545,5.0)
                curveTo(10.70238971710205,5.000113010406494,11.211014747619629,5.210901260375977,11.586000442504883,5.585999965667725)
                lineTo(15.414000511169434,9.413999557495117)
                curveTo(15.789098739624023,9.788985252380371,15.999887466430664,10.29761028289795,16.0,10.82800006866455)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(11.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                curveTo(10.996794700622559,19.71666145324707,11.377290725708008,20.380260467529297,11.997408866882324,20.739519119262695)
                curveTo(12.617527961730957,21.098779678344727,13.382472038269043,21.098779678344727,14.002591133117676,20.739519119262695)
                curveTo(14.622709274291992,20.380260467529297,15.003205299377441,19.71666145324707,15.0,19.0)
                curveTo(15.003205299377441,18.28333854675293,14.622709274291992,17.619739532470703,14.002591133117676,17.260480880737305)
                curveTo(13.382472038269043,16.901220321655273,12.617527961730957,16.901220321655273,11.997408866882324,17.260480880737305)
                curveTo(11.377290725708008,17.619739532470703,10.996794700622559,18.28333854675293,11.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                curveTo(2.9967949390411377,19.71666145324707,3.3772902488708496,20.380260467529297,3.9974091053009033,20.739519119262695)
                curveTo(4.617527961730957,21.098779678344727,5.382472038269043,21.098779678344727,6.002590656280518,20.739519119262695)
                curveTo(6.62270975112915,20.380260467529297,7.003204822540283,19.71666145324707,7.0,19.0)
                curveTo(7.003204822540283,18.28333854675293,6.62270975112915,17.619739532470703,6.002590656280518,17.260480880737305)
                curveTo(5.382472038269043,16.901220321655273,4.617527961730957,16.901220321655273,3.9974091053009033,17.260480880737305)
                curveTo(3.3772902488708496,17.619739532470703,2.9967949390411377,18.28333854675293,3.0,19.0)
            }
}

public val LucideIcons.All.ForkliftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forklift: ImageVector
    @Composable get() = ForkliftDefinition.asImageVector()
