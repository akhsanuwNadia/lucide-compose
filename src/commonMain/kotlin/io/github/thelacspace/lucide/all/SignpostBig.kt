package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignpostBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(4.0,9.0)
                lineTo(2.0,7.0)
                lineTo(4.0,5.0)
                lineTo(10.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(20.0,5.0)
                lineTo(22.0,7.0)
                lineTo(20.0,9.0)
                lineTo(14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(10.0,4.0)
                curveTo(9.996794700622559,3.2833380699157715,10.377290725708008,2.619739532470703,10.997408866882324,2.2604801654815674)
                curveTo(11.617527961730957,1.9012209177017212,12.382472038269043,1.9012209177017212,13.002591133117676,2.2604801654815674)
                curveTo(13.622709274291992,2.619739532470703,14.003205299377441,3.2833380699157715,14.0,4.0)
                lineTo(14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,22.0)
                lineTo(16.0,22.0)
            }
}

public val LucideIcons.All.SignpostBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignpostBig: ImageVector
    @Composable get() = SignpostBigDefinition.asImageVector()
