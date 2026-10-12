package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(5.0,6.0)
                lineTo(8.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,18.0)
                lineTo(7.0,18.0)
                curveTo(5.895430564880371,18.0,5.0,17.104570388793945,5.0,16.0)
                lineTo(5.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,15.0)
                lineTo(19.0,18.0)
                lineTo(16.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,6.0)
                lineTo(17.0,6.0)
                curveTo(18.104570388793945,6.0,19.0,6.895430564880371,19.0,8.0)
                lineTo(19.0,18.0)
            }
}

public val LucideIcons.All.Repeat2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat2: ImageVector
    @Composable get() = Repeat2Definition.asImageVector()
