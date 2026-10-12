package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Download") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(12.0,15.0)
                lineTo(17.0,10.0)
            }
}

public val LucideIcons.All.DownloadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Download: ImageVector
    @Composable get() = DownloadDefinition.asImageVector()
