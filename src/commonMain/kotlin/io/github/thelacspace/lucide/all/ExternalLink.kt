package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ExternalLink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,14.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,13.0)
                lineTo(18.0,19.0)
                curveTo(18.0,20.104570388793945,17.104570388793945,21.0,16.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,8.0)
                curveTo(3.0,6.895430564880371,3.895430564880371,6.0,5.0,6.0)
                lineTo(11.0,6.0)
            }
}

public val LucideIcons.All.ExternalLinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ExternalLink: ImageVector
    @Composable get() = ExternalLinkDefinition.asImageVector()
