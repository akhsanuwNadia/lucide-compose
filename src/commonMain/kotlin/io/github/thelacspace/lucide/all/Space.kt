package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Space") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(22.0,18.0)
                curveTo(22.0,18.5,21.5,19.0,21.0,19.0)
                lineTo(3.0,19.0)
                curveTo(2.5,19.0,2.0,18.5,2.0,18.0)
                lineTo(2.0,17.0)
            }
}

public val LucideIcons.All.SpaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Space: ImageVector
    @Composable get() = SpaceDefinition.asImageVector()
