package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerRightDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(15.0f,20.0f)
                lineTo(20.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(11.0f,4.0f)
                curveTo(13.209139f,4.0f,15.0f,5.790861f,15.0f,8.0f)
                lineTo(15.0f,20.0f)
            }
}

public val LucideIcons.All.CornerRightDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerRightDown: ImageVector
    @Composable get() = CornerRightDownDefinition.asImageVector()
