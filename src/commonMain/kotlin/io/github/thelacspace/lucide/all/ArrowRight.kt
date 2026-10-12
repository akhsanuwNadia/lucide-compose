package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,12.0f)
                lineTo(19.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(19.0f,12.0f)
                lineTo(12.0f,19.0f)
            }
}

public val LucideIcons.All.ArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRight: ImageVector
    @Composable get() = ArrowRightDefinition.asImageVector()
