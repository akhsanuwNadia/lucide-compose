package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lectern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 13f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, false, lf, 1.057f)
                arcToRelative(-4.333f, Af, 1f, true, false, 0021f, 6f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1.287f, Lf)
                arcToRelative(3.1f, 11.621f, Af, false, false, 0f, 005.001f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 22f)
                verticalLineTo(11f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, hf)
                arcToRelative(-4f, af, 1f, true, false, 00f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 6f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, hf)
            }
}

public val LucideIcons.All.LecternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lectern: ImageVector
    @Composable get() = LecternDefinition.asImageVector()
