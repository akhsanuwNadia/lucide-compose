package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,13.0f)
                lineTo(12.0f,7.0f)
                lineTo(6.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,21.0f)
            }
}

public val LucideIcons.All.ArrowUpToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpToLine: ImageVector
    @Composable get() = ArrowUpToLineDefinition.asImageVector()
