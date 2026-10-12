package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,6.0f)
                lineTo(7.0f,12.0f)
                lineTo(13.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
}

public val LucideIcons.All.ArrowLeftToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftToLine: ImageVector
    @Composable get() = ArrowLeftToLineDefinition.asImageVector()
