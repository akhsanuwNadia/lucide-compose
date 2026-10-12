package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cylinder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0221588611602783,20.6516170501709,7.045098781585693,21.986614227294922,12.0,21.986614227294922)
                curveTo(16.95490074157715,21.986614227294922,20.977840423583984,20.6516170501709,21.0,19.0)
                lineTo(21.0,5.0)
            }
}

public val LucideIcons.All.CylinderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cylinder: ImageVector
    @Composable get() = CylinderDefinition.asImageVector()
