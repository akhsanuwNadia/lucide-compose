package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Captions") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,5.0)
                lineTo(19.0,5.0)
                curveTo(20.104570388793945,5.0,21.0,5.895430564880371,21.0,7.0)
                lineTo(21.0,17.0)
                curveTo(21.0,18.104570388793945,20.104570388793945,19.0,19.0,19.0)
                lineTo(5.0,19.0)
                curveTo(3.895430564880371,19.0,3.0,18.104570388793945,3.0,17.0)
                lineTo(3.0,7.0)
                curveTo(3.0,5.895430564880371,3.895430564880371,5.0,5.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(11.0,15.0)
                moveTo(15.0,15.0)
                lineTo(17.0,15.0)
                moveTo(7.0,11.0)
                lineTo(9.0,11.0)
                moveTo(13.0,11.0)
                lineTo(17.0,11.0)
            }
}

public val LucideIcons.All.CaptionsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Captions: ImageVector
    @Composable get() = CaptionsDefinition.asImageVector()
