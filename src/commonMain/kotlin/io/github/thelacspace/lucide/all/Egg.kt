package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Egg") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                curveTo(8.0,2.0,4.0,8.0,4.0,14.0)
                curveTo(4.0196967124938965,18.404312133789062,7.595643043518066,21.96430206298828,12.0,21.96430206298828)
                curveTo(16.404356002807617,21.96430206298828,19.980302810668945,18.404312133789062,20.0,14.0)
                curveTo(20.0,8.0,16.0,2.0,12.0,2.0)
            }
}

public val LucideIcons.All.EggDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Egg: ImageVector
    @Composable get() = EggDefinition.asImageVector()
