package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MouseRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.317999839782715)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,10.0)
                lineTo(19.0,15.0)
                curveTo(18.982765197753906,18.85377311706543,15.853812217712402,21.968765258789062,12.0,21.968765258789062)
                curveTo(8.146187782287598,21.968765258789062,5.017234802246094,18.85377311706543,5.0,15.0)
                lineTo(5.0,9.0)
                curveTo(5.0,5.4730000495910645,7.607999801635742,2.4850001335144043,11.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                curveTo(14.996794700622559,4.7166619300842285,15.377290725708008,5.380260467529297,15.997408866882324,5.7395195960998535)
                curveTo(16.61752700805664,6.098779201507568,17.38247299194336,6.098779201507568,18.00259017944336,5.7395195960998535)
                curveTo(18.622709274291992,5.380260467529297,19.003204345703125,4.7166619300842285,19.0,4.0)
                curveTo(19.003204345703125,3.2833380699157715,18.622709274291992,2.619739532470703,18.00259017944336,2.2604801654815674)
                curveTo(17.38247299194336,1.9012209177017212,16.61752700805664,1.9012209177017212,15.997408866882324,2.2604801654815674)
                curveTo(15.377290725708008,2.619739532470703,14.996794700622559,3.2833380699157715,15.0,4.0)
            }
}

public val LucideIcons.All.MouseRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MouseRight: ImageVector
    @Composable get() = MouseRightDefinition.asImageVector()
