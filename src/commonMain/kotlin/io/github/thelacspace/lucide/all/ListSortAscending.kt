package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListSortAscending") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 19f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                horizontalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                horizontalLineTo(3f)
            }
}

public val LucideIcons.All.ListSortAscendingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListSortAscending: ImageVector
    @Composable get() = ListSortAscendingDefinition.asImageVector()
