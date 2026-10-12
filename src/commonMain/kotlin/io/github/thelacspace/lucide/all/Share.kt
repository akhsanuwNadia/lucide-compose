package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Share") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(12.0,2.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.ShareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Share: ImageVector
    @Composable get() = ShareDefinition.asImageVector()
