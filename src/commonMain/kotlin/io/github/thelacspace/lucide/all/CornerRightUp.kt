package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerRightUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(15.0f,4.0f)
                lineTo(20.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(11.0f,20.0f)
                curveTo(13.209139f,20.0f,15.0f,18.209139f,15.0f,16.0f)
                lineTo(15.0f,4.0f)
            }
}

public val LucideIcons.All.CornerRightUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerRightUp: ImageVector
    @Composable get() = CornerRightUpDefinition.asImageVector()
