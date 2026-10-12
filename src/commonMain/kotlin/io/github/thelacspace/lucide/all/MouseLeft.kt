package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.317999839782715)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(5.0,15.0)
                curveTo(5.017234802246094,18.85377311706543,8.146187782287598,21.968765258789062,12.0,21.968765258789062)
                curveTo(15.853812217712402,21.968765258789062,18.982765197753906,18.85377311706543,19.0,15.0)
                lineTo(19.0,9.0)
                curveTo(19.0,5.4730000495910645,16.392000198364258,2.4850001335144043,13.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,4.0)
                curveTo(4.996795177459717,4.7166619300842285,5.37729024887085,5.380260467529297,5.997409343719482,5.7395195960998535)
                curveTo(6.617527961730957,6.098779201507568,7.382472038269043,6.098779201507568,8.002591133117676,5.7395195960998535)
                curveTo(8.622709274291992,5.380260467529297,9.003205299377441,4.7166619300842285,9.0,4.0)
                curveTo(9.003205299377441,3.2833380699157715,8.622709274291992,2.619739532470703,8.002591133117676,2.2604801654815674)
                curveTo(7.382472038269043,1.9012209177017212,6.617527961730957,1.9012209177017212,5.997409343719482,2.2604801654815674)
                curveTo(5.37729024887085,2.619739532470703,4.996795177459717,3.2833380699157715,5.0,4.0)
            }
}

public val LucideIcons.All.MouseLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseLeft: ImageVector
    @Composable get() = MouseLeftDefinition.asImageVector()
