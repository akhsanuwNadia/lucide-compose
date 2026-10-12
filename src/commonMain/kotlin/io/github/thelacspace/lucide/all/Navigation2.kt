package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Navigation2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(19.0f,21.0f)
                lineTo(12.0f,17.0f)
                lineTo(5.0f,21.0f)
                lineTo(12.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.Navigation2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Navigation2: ImageVector
    @Composable get() = Navigation2Definition.asImageVector()
