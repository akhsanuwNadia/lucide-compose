package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IterationCw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(4.0f,5.581722f,7.581722f,2.0f,12.0f,2.0f)
                curveTo(16.418278f,2.0f,20.0f,5.581722f,20.0f,10.0f)
                curveTo(20.0f,14.418278f,16.418278f,18.0f,12.0f,18.0f)
                lineTo(4.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(4.0f,18.0f)
                lineTo(8.0f,14.0f)
            }
}

public val LucideIcons.All.IterationCwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IterationCw: ImageVector
    @Composable get() = IterationCwDefinition.asImageVector()
