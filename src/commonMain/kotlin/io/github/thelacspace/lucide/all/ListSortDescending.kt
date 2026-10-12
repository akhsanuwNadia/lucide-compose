package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListSortDescending") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 19f)
                horizontalLineTo(3f)
            }
}

public val LucideIcons.All.ListSortDescendingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListSortDescending: ImageVector
    @Composable get() = ListSortDescendingDefinition.asImageVector()
