package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                lineTo(6.0f,12.0f)
                lineTo(11.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(13.0f,12.0f)
                lineTo(18.0f,7.0f)
            }
}

public val LucideIcons.All.ChevronsLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsLeft: ImageVector
    @Composable get() = ChevronsLeftDefinition.asImageVector()
