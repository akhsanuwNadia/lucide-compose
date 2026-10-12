package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(6.0f,16.0f)
                curveTo(6.0f,17.10457f,6.8954306f,18.0f,8.0f,18.0f)
                lineTo(22.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(18.0f,8.0f)
                curveTo(18.0f,6.8954306f,17.10457f,6.0f,16.0f,6.0f)
                lineTo(2.0f,6.0f)
            }
}

public val LucideIcons.All.CropDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crop: ImageVector
    @Composable get() = CropDefinition.asImageVector()
