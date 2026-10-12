package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandleBottomRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                lineTo(8f, 21f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21f, 15f)
                lineToRelative(-6f, 6f)
            }
}

public val LucideIcons.All.HandleBottomRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandleBottomRight: ImageVector
    @Composable get() = HandleBottomRightDefinition.asImageVector()
