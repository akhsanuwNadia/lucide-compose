package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 3f)
                verticalLineToRelative(7.751f)
                arcToRelative(.25f, .25f, 0f, false, false, lf, 2.28f)
                arcToRelative(-1.834f, af, .5f, false, false, 01.627f, 0f)
                lineToRelative(2.28f, 1.834f)
                arcToRelative(.25f, .25f, 0f, false, false, Vf, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.SquareBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBookmark: ImageVector
    @Composable get() = SquareBookmarkDefinition.asImageVector()
