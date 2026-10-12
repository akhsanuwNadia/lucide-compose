package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Key") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2f, 21f)
                lineToRelative(9.6f, -9.6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.5f, 15.5f)
                lineToRelative(2.3f, 2.3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.4f)
                lineToRelative(-2.1f, 2.1f)
                arcToRelative(1f, 1f, 0f, false, true, -1.4f, 0f)
                lineTo(4f, 19f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 7.5f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, 11.0f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, false, -11.0f, 0f)
            }
}

public val LucideIcons.All.KeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Key: ImageVector
    @Composable get() = KeyDefinition.asImageVector()
