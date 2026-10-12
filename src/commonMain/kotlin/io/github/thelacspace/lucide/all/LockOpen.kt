package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LockOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,11.0)
                lineTo(19.0,11.0)
                curveTo(20.104570388793945,11.0,21.0,11.895430564880371,21.0,13.0)
                lineTo(21.0,20.0)
                curveTo(21.0,21.104570388793945,20.104570388793945,22.0,19.0,22.0)
                lineTo(5.0,22.0)
                curveTo(3.895430564880371,22.0,3.0,21.104570388793945,3.0,20.0)
                lineTo(3.0,13.0)
                curveTo(3.0,11.895430564880371,3.895430564880371,11.0,5.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(7.0,7.0)
                curveTo(6.997419357299805,4.431235313415527,8.941742897033691,2.2784485816955566,11.497504234313965,2.0202908515930176)
                curveTo(14.053264617919922,1.762133240699768,16.388826370239258,3.4826080799102783,16.899999618530273,6.0)
            }
}

public val LucideIcons.All.LockOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LockOpen: ImageVector
    @Composable get() = LockOpenDefinition.asImageVector()
