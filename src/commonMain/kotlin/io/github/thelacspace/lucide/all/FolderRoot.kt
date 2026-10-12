package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderRoot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.069999694824219,6.0)
                curveTo(11.400961875915527,5.9965386390686035,10.777966499328613,5.6587700843811035,10.40999984741211,5.099999904632568)
                lineTo(9.59000015258789,3.8999998569488525)
                curveTo(9.222033500671387,3.3412294387817383,8.599038124084473,3.0034611225128174,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.100000381469727,2.9000000953674316,20.0,4.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,13.0)
                curveTo(9.996794700622559,13.71666145324707,10.377290725708008,14.380260467529297,10.997408866882324,14.739520072937012)
                curveTo(11.617527961730957,15.09877872467041,12.382472038269043,15.09877872467041,13.002591133117676,14.739520072937012)
                curveTo(13.622709274291992,14.380260467529297,14.003205299377441,13.71666145324707,14.0,13.0)
                curveTo(14.003205299377441,12.28333854675293,13.622709274291992,11.619739532470703,13.002591133117676,11.260479927062988)
                curveTo(12.382472038269043,10.90122127532959,11.617527961730957,10.90122127532959,10.997408866882324,11.260479927062988)
                curveTo(10.377290725708008,11.619739532470703,9.996794700622559,12.28333854675293,10.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,20.0)
            }
}

public val LucideIcons.All.FolderRootDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderRoot: ImageVector
    @Composable get() = FolderRootDefinition.asImageVector()
