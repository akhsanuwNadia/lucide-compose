package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrendingUpDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.828f,14.828f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(21.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,3.0f)
                lineTo(12.0f,12.0f)
                lineTo(8.0f,8.0f)
                lineTo(2.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(21.0f,3.0f)
                lineTo(16.0f,3.0f)
            }
}

public val LucideIcons.All.TrendingUpDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrendingUpDown: ImageVector
    @Composable get() = TrendingUpDownDefinition.asImageVector()
