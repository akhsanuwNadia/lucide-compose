package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CopySlash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(20.0,8.0)
                curveTo(21.104570388793945,8.0,22.0,8.895430564880371,22.0,10.0)
                lineTo(22.0,20.0)
                curveTo(22.0,21.104570388793945,21.104570388793945,22.0,20.0,22.0)
                lineTo(10.0,22.0)
                curveTo(8.895430564880371,22.0,8.0,21.104570388793945,8.0,20.0)
                lineTo(8.0,10.0)
                curveTo(8.0,8.895430564880371,8.895430564880371,8.0,10.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                curveTo(2.9000000953674316,16.0,2.0,15.100000381469727,2.0,14.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.9000000953674316,2.9000000953674316,2.0,4.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.100000381469727,2.0,16.0,2.9000000953674316,16.0,4.0)
            }
}

public val LucideIcons.All.CopySlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CopySlash: ImageVector
    @Composable get() = CopySlashDefinition.asImageVector()
