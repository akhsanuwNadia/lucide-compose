package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListSortAscending") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
}

public val LucideIcons.All.ListSortAscendingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListSortAscending: ImageVector
    @Composable get() = ListSortAscendingDefinition.asImageVector()
