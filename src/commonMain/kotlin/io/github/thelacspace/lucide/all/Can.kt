package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Can") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 10.5f)
                arcToRelative(9f, 2.5f, 0f, true, false, 0f, vf)
                arcToRelative(8f, af, 9f, false, false, 0018f, 0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 10.5f)
                arcTo(9f, 2.5f, 25.32f, false, false, 9f, 2.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 16.858f)
            }
}

public val LucideIcons.All.CanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Can: ImageVector
    @Composable get() = CanDefinition.asImageVector()
