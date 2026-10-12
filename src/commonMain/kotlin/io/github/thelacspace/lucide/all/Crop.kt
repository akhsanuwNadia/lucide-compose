package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(6.0,16.0)
                curveTo(6.0,17.104570388793945,6.895430564880371,18.0,8.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(18.0,8.0)
                curveTo(18.0,6.895430564880371,17.104570388793945,6.0,16.0,6.0)
                lineTo(2.0,6.0)
            }
}

public val LucideIcons.All.CropDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crop: ImageVector
    @Composable get() = CropDefinition.asImageVector()
