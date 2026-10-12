package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(12.0f,9.0f)
                lineTo(6.0f,15.0f)
            }
}

public val LucideIcons.All.ChevronUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronUp: ImageVector
    @Composable get() = ChevronUpDefinition.asImageVector()
