package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(12.0f,22.0f)
                lineTo(16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(16.0f,6.0f)
            }
}

public val LucideIcons.All.MoveVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveVertical: ImageVector
    @Composable get() = MoveVerticalDefinition.asImageVector()
