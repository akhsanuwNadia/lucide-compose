package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,6.0)
                lineTo(7.0,12.0)
                lineTo(13.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(21.0,12.0)
            }
}

public val LucideIcons.All.ArrowLeftToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftToLine: ImageVector
    @Composable get() = ArrowLeftToLineDefinition.asImageVector()
