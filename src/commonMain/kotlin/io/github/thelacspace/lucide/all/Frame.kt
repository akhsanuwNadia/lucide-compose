package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Frame") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(2.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.FrameDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Frame: ImageVector
    @Composable get() = FrameDefinition.asImageVector()
