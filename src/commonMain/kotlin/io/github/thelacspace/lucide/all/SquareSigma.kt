package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareSigma") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.9f)
                lineTo(16.0f,7.0f)
                lineTo(8.0f,7.0f)
                lineTo(12.0f,12.0f)
                lineTo(8.0f,17.0f)
                lineTo(16.0f,17.0f)
                lineTo(16.0f,15.1f)
            }
}

public val LucideIcons.All.SquareSigmaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareSigma: ImageVector
    @Composable get() = SquareSigmaDefinition.asImageVector()
