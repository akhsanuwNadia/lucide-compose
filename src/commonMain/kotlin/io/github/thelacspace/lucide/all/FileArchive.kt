package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileArchive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.659000396728516,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(8.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,7.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                curveTo(5.996795177459717,20.71666145324707,6.37729024887085,21.380260467529297,6.997409343719482,21.739519119262695)
                curveTo(7.617527961730957,22.098779678344727,8.382472038269043,22.098779678344727,9.002591133117676,21.739519119262695)
                curveTo(9.622709274291992,21.380260467529297,10.003205299377441,20.71666145324707,10.0,20.0)
                curveTo(10.003205299377441,19.28333854675293,9.622709274291992,18.619739532470703,9.002591133117676,18.260480880737305)
                curveTo(8.382472038269043,17.901220321655273,7.617527961730957,17.901220321655273,6.997409343719482,18.260480880737305)
                curveTo(6.37729024887085,18.619739532470703,5.996795177459717,19.28333854675293,6.0,20.0)
            }
}

public val LucideIcons.All.FileArchiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileArchive: ImageVector
    @Composable get() = FileArchiveDefinition.asImageVector()
