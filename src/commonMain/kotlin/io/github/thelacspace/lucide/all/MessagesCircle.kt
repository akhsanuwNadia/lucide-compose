package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessagesCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.95f, 10.05f)
                arcToRelative(7f, 7f, 0f, false, false, 1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.696f, 12.708f)
                arcToRelative(1f, 1f, 0f, false, false, -.785f, 7f)
                arcToRelative(7f, 0f, 113.518f, false, true, 1f, 0f)
            }
}

public val LucideIcons.All.MessagesCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessagesCircle: ImageVector
    @Composable get() = MessagesCircleDefinition.asImageVector()
