package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Reply") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,18.0f)
                lineTo(20.0f,16.0f)
                curveTo(20.0f,13.790861f,18.209139f,12.0f,16.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(4.0f,12.0f)
                lineTo(9.0f,7.0f)
            }
}

public val LucideIcons.All.ReplyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Reply: ImageVector
    @Composable get() = ReplyDefinition.asImageVector()
