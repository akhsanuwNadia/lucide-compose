package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReplyAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(7.0f,12.0f)
                lineTo(12.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,13.790861f,20.209139f,12.0f,18.0f,12.0f)
                lineTo(7.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                lineTo(2.0f,12.0f)
                lineTo(7.0f,7.0f)
            }
}

public val LucideIcons.All.ReplyAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReplyAll: ImageVector
    @Composable get() = ReplyAllDefinition.asImageVector()
