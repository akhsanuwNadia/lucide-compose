package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListFilter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,5.0)
                lineTo(22.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(15.0,19.0)
            }
}

public val LucideIcons.All.ListFilterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListFilter: ImageVector
    @Composable get() = ListFilterDefinition.asImageVector()
