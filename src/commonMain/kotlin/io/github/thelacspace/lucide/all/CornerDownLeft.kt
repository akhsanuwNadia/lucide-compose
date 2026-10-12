package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                lineTo(20.0f,11.0f)
                curveTo(20.0f,13.209139f,18.209139f,15.0f,16.0f,15.0f)
                lineTo(4.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(4.0f,15.0f)
                lineTo(9.0f,20.0f)
            }
}

public val LucideIcons.All.CornerDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownLeft: ImageVector
    @Composable get() = CornerDownLeftDefinition.asImageVector()
