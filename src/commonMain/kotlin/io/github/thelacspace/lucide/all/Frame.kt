package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Frame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(2.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(18.0f,22.0f)
            }
}

public val LucideIcons.All.FrameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Frame: ImageVector
    @Composable get() = FrameDefinition.asImageVector()
