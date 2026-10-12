package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandMetal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,12.5)
                lineTo(18.0,10.0)
                curveTo(18.0,8.895430564880371,17.104570388793945,8.0,16.0,8.0)
                curveTo(14.895430564880371,8.0,14.0,8.895430564880371,14.0,10.0)
                lineTo(14.0,11.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,11.0)
                lineTo(14.0,9.0)
                curveTo(14.003205299377441,8.28333854675293,13.622709274291992,7.619739532470703,13.002591133117676,7.2604804039001465)
                curveTo(12.382472038269043,6.901220798492432,11.617527961730957,6.901220798492432,10.997408866882324,7.2604804039001465)
                curveTo(10.377290725708008,7.619739532470703,9.996794700622559,8.28333854675293,10.0,9.0)
                lineTo(10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,10.5)
                lineTo(10.0,5.0)
                curveTo(10.003205299377441,4.2833380699157715,9.622709274291992,3.619739532470703,9.002591133117676,3.2604801654815674)
                curveTo(8.382472038269043,2.9012207984924316,7.617527961730957,2.9012207984924316,6.997409343719482,3.2604801654815674)
                curveTo(6.37729024887085,3.619739532470703,5.996795177459717,4.2833380699157715,6.0,5.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(5.239999771118164,13.239999771118164)
                curveTo(4.451085567474365,12.522586822509766,3.238067150115967,12.550286293029785,2.482722520828247,13.302962303161621)
                curveTo(1.7273775339126587,14.055638313293457,1.6953845024108887,15.268550872802734,2.4099998474121094,16.059999465942383)
                lineTo(6.009999752044678,19.65999984741211)
                curveTo(7.5,21.139999389648438,9.199999809265137,22.0,12.0,22.0)
                lineTo(14.0,22.0)
                curveTo(18.418277740478516,22.0,22.0,18.418277740478516,22.0,14.0)
                lineTo(22.0,7.0)
                curveTo(22.003204345703125,6.2833380699157715,21.622709274291992,5.619739532470703,21.00259017944336,5.2604804039001465)
                curveTo(20.38247299194336,4.901220798492432,19.61752700805664,4.901220798492432,18.99740982055664,5.2604804039001465)
                curveTo(18.377290725708008,5.619739532470703,17.996795654296875,6.2833380699157715,18.0,7.0)
                lineTo(18.0,12.0)
            }
}

public val LucideIcons.All.HandMetalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandMetal: ImageVector
    @Composable get() = HandMetalDefinition.asImageVector()
