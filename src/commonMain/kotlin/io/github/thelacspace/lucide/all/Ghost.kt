package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ghost") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.528f, 20.472f)
                arcToRelative(1.6f, 1.6f, 0f, false, false, lf, 1.057f)
                arcToRelative(1.056f, af, 1.6f, true, false, 002.276f, 0f)
                lineToRelative(1.057f, -1.056f)
                arcToRelative(1.6f, 1.6f, 0f, false, false, lf, 1.114f)
                arcToRelative(1.114f, af, 1.4f, true, false, 002.414f, -1f)
                verticalLineTo(10f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, vf)
                arcToRelative(10.586f, af, 1.4f, true, false, 002.414f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                verticalLineToRelative(1f)
            }
}

public val LucideIcons.All.GhostDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ghost: ImageVector
    @Composable get() = GhostDefinition.asImageVector()
