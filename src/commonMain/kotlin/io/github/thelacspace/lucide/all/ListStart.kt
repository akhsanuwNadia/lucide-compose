package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(9.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(13.0,5.0)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,19.0)
                lineTo(21.0,7.0)
                curveTo(21.0,5.895430564880371,20.104570388793945,5.0,19.0,5.0)
                lineTo(13.0,5.0)
            }
}

public val LucideIcons.All.ListStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListStart: ImageVector
    @Composable get() = ListStartDefinition.asImageVector()
