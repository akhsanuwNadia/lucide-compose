package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(4.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.649999618530273,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                curveTo(1.9967949390411377,20.71666145324707,2.3772902488708496,21.380260467529297,2.9974091053009033,21.739519119262695)
                curveTo(3.617527961730957,22.098779678344727,4.382472038269043,22.098779678344727,5.002590656280518,21.739519119262695)
                curveTo(5.62270975112915,21.380260467529297,6.003204822540283,20.71666145324707,6.0,20.0)
                curveTo(6.003204822540283,19.28333854675293,5.62270975112915,18.619739532470703,5.002590656280518,18.260480880737305)
                curveTo(4.382472038269043,17.901220321655273,3.617527961730957,17.901220321655273,2.9974091053009033,18.260480880737305)
                curveTo(2.3772902488708496,18.619739532470703,1.9967949390411377,19.28333854675293,2.0,20.0)
            }
}

public val LucideIcons.All.FileKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileKey: ImageVector
    @Composable get() = FileKeyDefinition.asImageVector()
