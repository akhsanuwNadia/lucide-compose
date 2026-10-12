package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IterationCcw") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(20.0,18.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                curveTo(20.0,5.581721782684326,16.418277740478516,2.0,12.0,2.0)
                curveTo(7.581721782684326,2.0,4.0,5.581721782684326,4.0,10.0)
                curveTo(4.0,14.418277740478516,7.581721782684326,18.0,12.0,18.0)
                lineTo(20.0,18.0)
            }
}

public val LucideIcons.All.IterationCcwDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IterationCcw: ImageVector
    @Composable get() = IterationCcwDefinition.asImageVector()
