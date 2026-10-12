package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,14.0f)
                lineTo(4.0f,9.0f)
                lineTo(9.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                lineTo(14.5f,9.0f)
                curveTo(17.537565f,9.0f,20.0f,11.462434f,20.0f,14.5f)
                curveTo(20.0f,17.537565f,17.537565f,20.0f,14.5f,20.0f)
                lineTo(11.0f,20.0f)
            }
}

public val LucideIcons.All.Undo2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo2: ImageVector
    @Composable get() = Undo2Definition.asImageVector()
