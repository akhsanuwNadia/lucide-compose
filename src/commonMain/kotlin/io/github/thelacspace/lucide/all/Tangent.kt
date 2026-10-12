package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tangent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                curveTo(14.996794700622559,4.7166619300842285,15.377290725708008,5.380260467529297,15.997408866882324,5.7395195960998535)
                curveTo(16.61752700805664,6.098779201507568,17.38247299194336,6.098779201507568,18.00259017944336,5.7395195960998535)
                curveTo(18.622709274291992,5.380260467529297,19.003204345703125,4.7166619300842285,19.0,4.0)
                curveTo(19.003204345703125,3.2833380699157715,18.622709274291992,2.619739532470703,18.00259017944336,2.2604801654815674)
                curveTo(17.38247299194336,1.9012209177017212,16.61752700805664,1.9012209177017212,15.997408866882324,2.2604801654815674)
                curveTo(15.377290725708008,2.619739532470703,14.996794700622559,3.2833380699157715,15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.59000015258789,5.409999847412109)
                lineTo(5.409999847412109,15.59000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                curveTo(1.9967949390411377,17.71666145324707,2.3772902488708496,18.380260467529297,2.9974091053009033,18.739519119262695)
                curveTo(3.617527961730957,19.098779678344727,4.382472038269043,19.098779678344727,5.002590656280518,18.739519119262695)
                curveTo(5.62270975112915,18.380260467529297,6.003204822540283,17.71666145324707,6.0,17.0)
                curveTo(6.003204822540283,16.28333854675293,5.62270975112915,15.619739532470703,5.002590656280518,15.260479927062988)
                curveTo(4.382472038269043,14.90122127532959,3.617527961730957,14.90122127532959,2.9974091053009033,15.260479927062988)
                curveTo(2.3772902488708496,15.619739532470703,1.9967949390411377,16.28333854675293,2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                curveTo(12.0,22.0,8.0,13.0,10.5,10.5)
                curveTo(13.0,8.0,22.0,12.0,22.0,12.0)
            }
}

public val LucideIcons.All.TangentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tangent: ImageVector
    @Composable get() = TangentDefinition.asImageVector()
