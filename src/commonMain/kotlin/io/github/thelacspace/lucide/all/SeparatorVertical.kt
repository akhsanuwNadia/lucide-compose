package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SeparatorVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(20.0,12.0)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(4.0,12.0)
                lineTo(8.0,16.0)
            }
}

public val LucideIcons.All.SeparatorVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SeparatorVertical: ImageVector
    @Composable get() = SeparatorVerticalDefinition.asImageVector()
