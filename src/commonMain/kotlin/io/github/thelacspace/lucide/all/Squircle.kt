package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Squircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                curveTo(19.2f,3.0f,21.0f,4.8f,21.0f,12.0f)
                curveTo(21.0f,19.2f,19.2f,21.0f,12.0f,21.0f)
                curveTo(4.799999f,21.0f,3.0f,19.2f,3.0f,12.0f)
                curveTo(3.0f,4.799999f,4.8f,3.0f,12.0f,3.0f)
            }
}

public val LucideIcons.All.SquircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Squircle: ImageVector
    @Composable get() = SquircleDefinition.asImageVector()
