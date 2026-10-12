package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,18.0f)
                lineTo(17.0f,12.0f)
                lineTo(11.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(21.0f,19.0f)
            }
}

public val LucideIcons.All.ArrowRightToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightToLine: ImageVector
    @Composable get() = ArrowRightToLineDefinition.asImageVector()
