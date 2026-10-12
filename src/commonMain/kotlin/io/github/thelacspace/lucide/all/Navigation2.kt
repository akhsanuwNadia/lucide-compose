package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(19.0,21.0)
                lineTo(12.0,17.0)
                lineTo(5.0,21.0)
                lineTo(12.0,2.0)
                close()
            }
}

public val LucideIcons.All.Navigation2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2: ImageVector
    @Composable get() = Navigation2Definition.asImageVector()
