package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineSquiggle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,3.5)
                curveTo(12.0,1.5,14.0,6.0,10.0,7.5)
                curveTo(1.5,10.0,2.0,15.0,5.0,16.0)
                curveTo(10.0,18.0,14.0,6.0,19.0,9.0)
                curveTo(24.0,12.0,19.5,22.5,15.0,21.0)
                curveTo(10.0,18.5,15.5,10.0,21.0,19.0)
            }
}

public val LucideIcons.All.LineSquiggleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineSquiggle: ImageVector
    @Composable get() = LineSquiggleDefinition.asImageVector()
