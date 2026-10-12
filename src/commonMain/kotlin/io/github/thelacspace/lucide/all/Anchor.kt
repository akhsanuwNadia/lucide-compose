package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Anchor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,13.0)
                lineTo(21.0,12.0)
                curveTo(20.977840423583984,16.954851150512695,16.95490074157715,20.959840774536133,12.0,20.959840774536133)
                curveTo(7.045098781585693,20.959840774536133,3.0221588611602783,16.954851150512695,3.0,12.0)
                lineTo(5.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(15.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                curveTo(9.996794700622559,4.7166619300842285,10.377290725708008,5.380260467529297,10.997408866882324,5.7395195960998535)
                curveTo(11.617527961730957,6.098779201507568,12.382472038269043,6.098779201507568,13.002591133117676,5.7395195960998535)
                curveTo(13.622709274291992,5.380260467529297,14.003205299377441,4.7166619300842285,14.0,4.0)
                curveTo(14.003205299377441,3.2833380699157715,13.622709274291992,2.619739532470703,13.002591133117676,2.2604801654815674)
                curveTo(12.382472038269043,1.9012209177017212,11.617527961730957,1.9012209177017212,10.997408866882324,2.2604801654815674)
                curveTo(10.377290725708008,2.619739532470703,9.996794700622559,3.2833380699157715,10.0,4.0)
            }
}

public val LucideIcons.All.AnchorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Anchor: ImageVector
    @Composable get() = AnchorDefinition.asImageVector()
