package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineSquiggle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,3.5f)
                curveTo(12.0f,1.5f,14.0f,6.0f,10.0f,7.5f)
                curveTo(1.5f,10.0f,2.0f,15.0f,5.0f,16.0f)
                curveTo(10.0f,18.0f,14.0f,6.0f,19.0f,9.0f)
                curveTo(24.0f,12.0f,19.5f,22.5f,15.0f,21.0f)
                curveTo(10.0f,18.5f,15.5f,10.0f,21.0f,19.0f)
            }
}

public val LucideIcons.All.LineSquiggleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineSquiggle: ImageVector
    @Composable get() = LineSquiggleDefinition.asImageVector()
