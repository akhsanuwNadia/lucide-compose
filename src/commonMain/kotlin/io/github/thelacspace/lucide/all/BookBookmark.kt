package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(7.751f)
                arcToRelative(.25f, .25f, 0f, false, false, lf, 2.28f)
                arcToRelative(-1.834f, af, .5f, false, false, 01.627f, 0f)
                lineToRelative(2.28f, 1.834f)
                arcTo(.25f, .25f, 0f, false, false, Vf, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 19.5f)
                verticalLineToRelative(-15f)
                arcTo(2.5f, 2.5f, 0f, false, false, Hf, 19f)
                arcToRelative(1f, 1f, 0f, false, true, vf, 18f)
                arcToRelative(1f, 1f, 0f, true, false, 1f, Hf)
                arcToRelative(6.5f, af, 1f, true, false, 010f, -5f)
                horizontalLineTo(20f)
            }
}

public val LucideIcons.All.BookBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookBookmark: ImageVector
    @Composable get() = BookBookmarkDefinition.asImageVector()
