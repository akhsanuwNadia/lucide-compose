package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(12.0f,15.0f)
                lineTo(17.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,4.0f)
                lineTo(12.0f,9.0f)
                lineTo(17.0f,4.0f)
            }
}

public val LucideIcons.All.ChevronsDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsDownUp: ImageVector
    @Composable get() = ChevronsDownUpDefinition.asImageVector()
