package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,6.0)
                lineTo(12.0,11.0)
                lineTo(17.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,13.0)
                lineTo(12.0,18.0)
                lineTo(17.0,13.0)
            }
}

public val LucideIcons.All.ChevronsDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsDown: ImageVector
    @Composable get() = ChevronsDownDefinition.asImageVector()
