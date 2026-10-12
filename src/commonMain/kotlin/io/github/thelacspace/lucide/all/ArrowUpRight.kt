package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(17.0f,7.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                lineTo(17.0f,7.0f)
            }
}

public val LucideIcons.All.ArrowUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpRight: ImageVector
    @Composable get() = ArrowUpRightDefinition.asImageVector()
