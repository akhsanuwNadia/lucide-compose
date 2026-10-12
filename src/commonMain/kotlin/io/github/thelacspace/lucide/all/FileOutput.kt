package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileOutput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.22599983215332,20.924999237060547)
                curveTo(4.570777416229248,21.5859432220459,5.2545342445373535,22.00028419494629,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,7.126999855041504)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,11.0)
                lineTo(2.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,17.0)
                lineTo(2.0,14.0)
                lineTo(12.0,14.0)
            }
}

public val LucideIcons.All.FileOutputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileOutput: ImageVector
    @Composable get() = FileOutputDefinition.asImageVector()
