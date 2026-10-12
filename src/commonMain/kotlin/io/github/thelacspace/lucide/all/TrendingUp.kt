package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(22.0f,7.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.5f,15.5f)
                lineTo(8.5f,10.5f)
                lineTo(2.0f,17.0f)
            }
}

public val LucideIcons.All.TrendingUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingUp: ImageVector
    @Composable get() = TrendingUpDefinition.asImageVector()
