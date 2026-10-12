package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(12.0,15.0)
                lineTo(17.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,4.0)
                lineTo(12.0,9.0)
                lineTo(17.0,4.0)
            }
}

public val LucideIcons.All.ChevronsDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsDownUp: ImageVector
    @Composable get() = ChevronsDownUpDefinition.asImageVector()
