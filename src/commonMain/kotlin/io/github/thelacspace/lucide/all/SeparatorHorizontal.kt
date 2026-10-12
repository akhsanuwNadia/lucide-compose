package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SeparatorHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(12.0,20.0)
                lineTo(8.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(12.0,4.0)
                lineTo(16.0,8.0)
            }
}

public val LucideIcons.All.SeparatorHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SeparatorHorizontal: ImageVector
    @Composable get() = SeparatorHorizontalDefinition.asImageVector()
