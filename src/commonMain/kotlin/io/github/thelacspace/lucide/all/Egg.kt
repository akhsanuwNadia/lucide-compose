package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Egg") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(8.0f,2.0f,4.0f,8.0f,4.0f,14.0f)
                curveTo(4.0196967f,18.404312f,7.595643f,21.964302f,12.0f,21.964302f)
                curveTo(16.404356f,21.964302f,19.980303f,18.404312f,20.0f,14.0f)
                curveTo(20.0f,8.0f,16.0f,2.0f,12.0f,2.0f)
            }
}

public val LucideIcons.All.EggDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Egg: ImageVector
    @Composable get() = EggDefinition.asImageVector()
