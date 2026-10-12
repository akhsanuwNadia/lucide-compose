package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderArchive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,19.0)
                curveTo(12.996794700622559,19.71666145324707,13.377290725708008,20.380260467529297,13.997408866882324,20.739519119262695)
                curveTo(14.617527961730957,21.098779678344727,15.382472038269043,21.098779678344727,16.00259017944336,20.739519119262695)
                curveTo(16.622709274291992,20.380260467529297,17.003204345703125,19.71666145324707,17.0,19.0)
                curveTo(17.003204345703125,18.28333854675293,16.622709274291992,17.619739532470703,16.00259017944336,17.260480880737305)
                curveTo(15.382472038269043,16.901220321655273,14.617527961730957,16.901220321655273,13.997408866882324,17.260480880737305)
                curveTo(13.377290725708008,17.619739532470703,12.996794700622559,18.28333854675293,13.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.899999618530273,19.799999237060547)
                curveTo(21.57900619506836,19.457868576049805,22.005290985107422,18.760313034057617,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.100000381469727,6.0)
                curveTo(11.420332908630371,6.006663799285889,10.783802032470703,5.667683124542236,10.40999984741211,5.099999904632568)
                lineTo(9.600000381469727,3.9000000953674316)
                curveTo(9.230077743530273,3.3382794857025146,8.60258674621582,3.000110626220703,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                lineTo(9.100000381469727,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                lineTo(15.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,17.0)
                lineTo(15.0,15.0)
            }
}

public val LucideIcons.All.FolderArchiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderArchive: ImageVector
    @Composable get() = FolderArchiveDefinition.asImageVector()
