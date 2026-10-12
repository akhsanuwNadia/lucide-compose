package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownToLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                lineTo(12.0f,17.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
            }
}

public val LucideIcons.All.ArrowDownToLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownToLine: ImageVector
    @Composable get() = ArrowDownToLineDefinition.asImageVector()
