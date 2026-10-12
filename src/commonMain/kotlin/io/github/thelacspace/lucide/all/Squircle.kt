package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Squircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                curveTo(19.200000762939453,3.0,21.0,4.800000190734863,21.0,12.0)
                curveTo(21.0,19.200000762939453,19.200000762939453,21.0,12.0,21.0)
                curveTo(4.799999237060547,21.0,3.0,19.200000762939453,3.0,12.0)
                curveTo(3.0,4.799999237060547,4.800000190734863,3.0,12.0,3.0)
            }
}

public val LucideIcons.All.SquircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Squircle: ImageVector
    @Composable get() = SquircleDefinition.asImageVector()
