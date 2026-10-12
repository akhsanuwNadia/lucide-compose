package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Files") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                lineTo(11.0,2.0)
                curveTo(9.895430564880371,2.0,9.0,2.895430564880371,9.0,4.0)
                lineTo(9.0,15.0)
                curveTo(9.0,16.104570388793945,9.895430564880371,17.0,11.0,17.0)
                lineTo(19.0,17.0)
                curveTo(20.104570388793945,17.0,21.0,16.104570388793945,21.0,15.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.70599937438965,2.7060000896453857)
                curveTo(16.254226684570312,2.252593994140625,15.640057563781738,1.9984304904937744,15.0,2.0)
                lineTo(15.0,7.0)
                curveTo(15.0,7.5522847175598145,15.447714805603027,8.0,16.0,8.0)
                lineTo(21.0,8.0)
                curveTo(21.001569747924805,7.359942436218262,20.747406005859375,6.745773792266846,20.29400062561035,6.294000148773193)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,7.0)
                curveTo(3.895430564880371,7.0,3.0,7.895430564880371,3.0,9.0)
                lineTo(3.0,20.0)
                curveTo(3.0,21.104570388793945,3.895430564880371,22.0,5.0,22.0)
                lineTo(13.0,22.0)
                curveTo(13.714512825012207,21.999982833862305,14.374743461608887,21.618785858154297,14.732000350952148,21.0)
            }
}

public val LucideIcons.All.FilesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Files: ImageVector
    @Composable get() = FilesDefinition.asImageVector()
