package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(7.0,20.0)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(7.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(17.0,4.0)
                lineTo(13.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,4.0)
                lineTo(17.0,20.0)
            }
}

public val LucideIcons.All.ArrowDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownUp: ImageVector
    @Composable get() = ArrowDownUpDefinition.asImageVector()
