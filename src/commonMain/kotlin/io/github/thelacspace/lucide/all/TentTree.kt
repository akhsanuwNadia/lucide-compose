package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TentTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,4.0)
                curveTo(1.9967949390411377,4.7166619300842285,2.3772902488708496,5.380260467529297,2.9974091053009033,5.7395195960998535)
                curveTo(3.617527961730957,6.098779201507568,4.382472038269043,6.098779201507568,5.002590656280518,5.7395195960998535)
                curveTo(5.62270975112915,5.380260467529297,6.003204822540283,4.7166619300842285,6.0,4.0)
                curveTo(6.003204822540283,3.2833380699157715,5.62270975112915,2.619739532470703,5.002590656280518,2.2604801654815674)
                curveTo(4.382472038269043,1.9012209177017212,3.617527961730957,1.9012209177017212,2.9974091053009033,2.2604801654815674)
                curveTo(2.3772902488708496,2.619739532470703,1.9967949390411377,3.2833380699157715,2.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(17.0,2.0)
                lineTo(20.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(17.0,7.0)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(7.0,14.0)
                lineTo(2.0,22.0)
                lineTo(22.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(8.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,14.0)
                lineTo(14.0,22.0)
            }
}

public val LucideIcons.All.TentTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TentTree: ImageVector
    @Composable get() = TentTreeDefinition.asImageVector()
