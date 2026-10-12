package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(7.751f)
                arcToRelative(.25f, .25f, 0f, false, false, lf, 2.28f)
                arcToRelative(-1.834f, af, .5f, false, false, 01.627f, 0f)
                lineToRelative(2.28f, 1.834f)
                arcToRelative(.25f, .25f, 0f, false, false, Vf, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                arcToRelative(2f, 2f, 0f, false, false, Vf, 8f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, hf)
                arcToRelative(-7.9f, af, 2f, false, false, 01f, -1.69f)
            }
}

public val LucideIcons.All.FolderBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderBookmark: ImageVector
    @Composable get() = FolderBookmarkDefinition.asImageVector()
