package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cylinder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0221589f,20.651617f,7.045099f,21.986614f,12.0f,21.986614f)
                curveTo(16.9549f,21.986614f,20.97784f,20.651617f,21.0f,19.0f)
                lineTo(21.0f,5.0f)
            }
}

public val LucideIcons.All.CylinderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cylinder: ImageVector
    @Composable get() = CylinderDefinition.asImageVector()
