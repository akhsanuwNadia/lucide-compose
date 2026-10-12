package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandleBottomRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,15.0)
                lineTo(15.0,21.0)
            }
}

public val LucideIcons.All.HandleBottomRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandleBottomRight: ImageVector
    @Composable get() = HandleBottomRightDefinition.asImageVector()
