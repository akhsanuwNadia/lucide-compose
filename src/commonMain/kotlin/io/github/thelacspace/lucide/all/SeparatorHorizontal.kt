package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SeparatorHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(12.0f,20.0f)
                lineTo(8.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(12.0f,4.0f)
                lineTo(16.0f,8.0f)
            }
}

public val LucideIcons.All.SeparatorHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SeparatorHorizontal: ImageVector
    @Composable get() = SeparatorHorizontalDefinition.asImageVector()
