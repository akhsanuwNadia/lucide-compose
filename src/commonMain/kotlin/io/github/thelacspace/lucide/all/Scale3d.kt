package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scale3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                lineTo(5.0,18.0)
                curveTo(5.0,18.552284240722656,5.4477152824401855,19.0,6.0,19.0)
                lineTo(17.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.293000221252441,18.707000732421875)
                lineTo(11.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,19.0)
                curveTo(16.996795654296875,19.71666145324707,17.377290725708008,20.380260467529297,17.99740982055664,20.739519119262695)
                curveTo(18.61752700805664,21.098779678344727,19.38247299194336,21.098779678344727,20.00259017944336,20.739519119262695)
                curveTo(20.622709274291992,20.380260467529297,21.003204345703125,19.71666145324707,21.0,19.0)
                curveTo(21.003204345703125,18.28333854675293,20.622709274291992,17.619739532470703,20.00259017944336,17.260480880737305)
                curveTo(19.38247299194336,16.901220321655273,18.61752700805664,16.901220321655273,17.99740982055664,17.260480880737305)
                curveTo(17.377290725708008,17.619739532470703,16.996795654296875,18.28333854675293,17.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                curveTo(2.9967949390411377,5.7166619300842285,3.3772902488708496,6.380260467529297,3.9974091053009033,6.7395195960998535)
                curveTo(4.617527961730957,7.098779201507568,5.382472038269043,7.098779201507568,6.002590656280518,6.7395195960998535)
                curveTo(6.62270975112915,6.380260467529297,7.003204822540283,5.7166619300842285,7.0,5.0)
                curveTo(7.003204822540283,4.2833380699157715,6.62270975112915,3.619739532470703,6.002590656280518,3.2604801654815674)
                curveTo(5.382472038269043,2.9012207984924316,4.617527961730957,2.9012207984924316,3.9974091053009033,3.2604801654815674)
                curveTo(3.3772902488708496,3.619739532470703,2.9967949390411377,4.2833380699157715,3.0,5.0)
            }
}

public val LucideIcons.All.Scale3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scale3d: ImageVector
    @Composable get() = Scale3dDefinition.asImageVector()
