package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReplyAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(7.0,12.0)
                lineTo(12.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,18.0)
                lineTo(22.0,16.0)
                curveTo(22.0,13.790861129760742,20.209138870239258,12.0,18.0,12.0)
                lineTo(7.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,17.0)
                lineTo(2.0,12.0)
                lineTo(7.0,7.0)
            }
}

public val LucideIcons.All.ReplyAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReplyAll: ImageVector
    @Composable get() = ReplyAllDefinition.asImageVector()
