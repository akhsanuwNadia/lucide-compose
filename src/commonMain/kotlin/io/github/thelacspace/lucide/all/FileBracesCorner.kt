package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBracesCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,14.0)
                curveTo(4.4477152824401855,14.0,4.0,14.447714805603027,4.0,15.0)
                lineTo(4.0,17.0)
                curveTo(4.0,17.552284240722656,3.5522847175598145,18.0,3.0,18.0)
                curveTo(3.5522847175598145,18.0,4.0,18.447715759277344,4.0,19.0)
                lineTo(4.0,21.0)
                curveTo(4.0,21.552284240722656,4.4477152824401855,22.0,5.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                curveTo(9.552285194396973,22.0,10.0,21.552284240722656,10.0,21.0)
                lineTo(10.0,19.0)
                curveTo(10.0,18.447715759277344,10.447714805603027,18.0,11.0,18.0)
                curveTo(10.447714805603027,18.0,10.0,17.552284240722656,10.0,17.0)
                lineTo(10.0,15.0)
                curveTo(10.0,14.447714805603027,9.552285194396973,14.0,9.0,14.0)
            }
}

public val LucideIcons.All.FileBracesCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBracesCorner: ImageVector
    @Composable get() = FileBracesCornerDefinition.asImageVector()
