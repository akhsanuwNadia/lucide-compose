package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Baseline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(12.0,4.0)
                lineTo(18.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(16.0,12.0)
            }
}

public val LucideIcons.All.BaselineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Baseline: ImageVector
    @Composable get() = BaselineDefinition.asImageVector()
