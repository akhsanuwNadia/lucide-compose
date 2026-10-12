package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                lineTo(12.0f,15.0f)
                lineTo(18.0f,9.0f)
            }
}

public val LucideIcons.All.ChevronDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronDown: ImageVector
    @Composable get() = ChevronDownDefinition.asImageVector()
