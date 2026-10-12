package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(5.0f,12.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(5.0f,12.0f)
            }
}

public val LucideIcons.All.ArrowLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeft: ImageVector
    @Composable get() = ArrowLeftDefinition.asImageVector()
