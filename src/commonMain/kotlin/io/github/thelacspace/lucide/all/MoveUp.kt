package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(12.0,2.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.MoveUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveUp: ImageVector
    @Composable get() = MoveUpDefinition.asImageVector()
