package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DraftingCompass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.989999771118164,6.739999771118164)
                lineTo(14.920000076293945,10.180000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(19.13599967956543,12.0)
                curveTo(17.255647659301758,13.9150972366333,14.68440055847168,14.993956565856934,12.000499725341797,14.993956565856934)
                curveTo(9.316598892211914,14.993956565856934,6.745351791381836,13.9150972366333,4.864999771118164,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(18.84000015258789,17.15999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(11.020000457763672,6.739999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                curveTo(9.996794700622559,5.7166619300842285,10.377290725708008,6.380260467529297,10.997408866882324,6.7395195960998535)
                curveTo(11.617527961730957,7.098779201507568,12.382472038269043,7.098779201507568,13.002591133117676,6.7395195960998535)
                curveTo(13.622709274291992,6.380260467529297,14.003205299377441,5.7166619300842285,14.0,5.0)
                curveTo(14.003205299377441,4.2833380699157715,13.622709274291992,3.619739532470703,13.002591133117676,3.2604801654815674)
                curveTo(12.382472038269043,2.9012207984924316,11.617527961730957,2.9012207984924316,10.997408866882324,3.2604801654815674)
                curveTo(10.377290725708008,3.619739532470703,9.996794700622559,4.2833380699157715,10.0,5.0)
            }
}

public val LucideIcons.All.DraftingCompassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DraftingCompass: ImageVector
    @Composable get() = DraftingCompassDefinition.asImageVector()
