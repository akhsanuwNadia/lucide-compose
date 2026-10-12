package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartColumn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,17.0)
                lineTo(13.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,17.0)
                lineTo(8.0,14.0)
            }
}

public val LucideIcons.All.ChartColumnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartColumn: ImageVector
    @Composable get() = ChartColumnDefinition.asImageVector()
