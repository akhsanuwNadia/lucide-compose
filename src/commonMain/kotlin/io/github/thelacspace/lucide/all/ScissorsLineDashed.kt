package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScissorsLineDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.420000076293945,9.420000076293945)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                curveTo(1.9967949390411377,8.71666145324707,2.3772902488708496,9.380260467529297,2.9974091053009033,9.739520072937012)
                curveTo(3.617527961730957,10.09877872467041,4.382472038269043,10.09877872467041,5.002590656280518,9.739520072937012)
                curveTo(5.62270975112915,9.380260467529297,6.003204822540283,8.71666145324707,6.0,8.0)
                curveTo(6.003204822540283,7.2833380699157715,5.62270975112915,6.619739532470703,5.002590656280518,6.2604804039001465)
                curveTo(4.382472038269043,5.901220798492432,3.617527961730957,5.901220798492432,2.9974091053009033,6.2604804039001465)
                curveTo(2.3772902488708496,6.619739532470703,1.9967949390411377,7.2833380699157715,2.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(5.420000076293945,14.579999923706055)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                curveTo(1.9967949390411377,16.71666145324707,2.3772902488708496,17.380260467529297,2.9974091053009033,17.739519119262695)
                curveTo(3.617527961730957,18.098779678344727,4.382472038269043,18.098779678344727,5.002590656280518,17.739519119262695)
                curveTo(5.62270975112915,17.380260467529297,6.003204822540283,16.71666145324707,6.0,16.0)
                curveTo(6.003204822540283,15.28333854675293,5.62270975112915,14.619739532470703,5.002590656280518,14.260479927062988)
                curveTo(4.382472038269043,13.90122127532959,3.617527961730957,13.90122127532959,2.9974091053009033,14.260479927062988)
                curveTo(2.3772902488708496,14.619739532470703,1.9967949390411377,15.28333854675293,2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.800000190734863,14.800000190734863)
                lineTo(14.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.ScissorsLineDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScissorsLineDashed: ImageVector
    @Composable get() = ScissorsLineDashedDefinition.asImageVector()
