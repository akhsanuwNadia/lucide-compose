package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blinds") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,7.0)
                lineTo(8.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,11.0)
                lineTo(8.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(20.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(20.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(4.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                curveTo(1.9967949390411377,19.71666145324707,2.3772902488708496,20.380260467529297,2.9974091053009033,20.739519119262695)
                curveTo(3.617527961730957,21.098779678344727,4.382472038269043,21.098779678344727,5.002590656280518,20.739519119262695)
                curveTo(5.62270975112915,20.380260467529297,6.003204822540283,19.71666145324707,6.0,19.0)
                curveTo(6.003204822540283,18.28333854675293,5.62270975112915,17.619739532470703,5.002590656280518,17.260480880737305)
                curveTo(4.382472038269043,16.901220321655273,3.617527961730957,16.901220321655273,2.9974091053009033,17.260480880737305)
                curveTo(2.3772902488708496,17.619739532470703,1.9967949390411377,18.28333854675293,2.0,19.0)
            }
}

public val LucideIcons.All.BlindsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blinds: ImageVector
    @Composable get() = BlindsDefinition.asImageVector()
