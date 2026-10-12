package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MoveDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(5.0,19.0)
                lineTo(5.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(5.0,19.0)
            }
}

public val LucideIcons.All.MoveDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MoveDownLeft: ImageVector
    @Composable get() = MoveDownLeftDefinition.asImageVector()
