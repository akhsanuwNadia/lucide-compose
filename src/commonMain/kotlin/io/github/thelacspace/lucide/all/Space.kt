package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Space") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,18.5f,21.5f,19.0f,21.0f,19.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.5f,19.0f,2.0f,18.5f,2.0f,18.0f)
                lineTo(2.0f,17.0f)
            }
}

public val LucideIcons.All.SpaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Space: ImageVector
    @Composable get() = SpaceDefinition.asImageVector()
