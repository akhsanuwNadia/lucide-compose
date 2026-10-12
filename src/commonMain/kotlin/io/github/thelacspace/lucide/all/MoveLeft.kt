package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(2.0f,12.0f)
                lineTo(6.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
}

public val LucideIcons.All.MoveLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveLeft: ImageVector
    @Composable get() = MoveLeftDefinition.asImageVector()
