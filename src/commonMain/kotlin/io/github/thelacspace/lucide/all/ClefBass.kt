package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefBass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 11f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 6f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 8f)
                curveToRelative(0f, -4f, 4f, -4f, 4f, -4f)
                curveToRelative(6f, 0f, 6f, 6f, 6f, 6f)
                curveToRelative(0f, 7f, -10f, 11f, -10f, 11f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ClefBassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefBass: ImageVector
    @Composable get() = ClefBassDefinition.asImageVector()
