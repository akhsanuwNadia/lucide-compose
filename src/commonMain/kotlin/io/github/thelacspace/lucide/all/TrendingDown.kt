package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(13.5f,8.5f)
                lineTo(8.5f,13.5f)
                lineTo(2.0f,7.0f)
            }
}

public val LucideIcons.All.TrendingDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingDown: ImageVector
    @Composable get() = TrendingDownDefinition.asImageVector()
