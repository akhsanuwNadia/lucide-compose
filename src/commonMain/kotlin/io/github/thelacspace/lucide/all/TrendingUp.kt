package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(22.0,7.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.5,15.5)
                lineTo(8.5,10.5)
                lineTo(2.0,17.0)
            }
}

public val LucideIcons.All.TrendingUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingUp: ImageVector
    @Composable get() = TrendingUpDefinition.asImageVector()
