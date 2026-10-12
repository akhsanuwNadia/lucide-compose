package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IterationCcw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(20.0f,18.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                curveTo(20.0f,5.581722f,16.418278f,2.0f,12.0f,2.0f)
                curveTo(7.581722f,2.0f,4.0f,5.581722f,4.0f,10.0f)
                curveTo(4.0f,14.418278f,7.581722f,18.0f,12.0f,18.0f)
                lineTo(20.0f,18.0f)
            }
}

public val LucideIcons.All.IterationCcwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IterationCcw: ImageVector
    @Composable get() = IterationCcwDefinition.asImageVector()
