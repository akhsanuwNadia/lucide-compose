package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartColumnIncreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,17.0f)
                lineTo(13.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(18.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,17.0f)
                lineTo(8.0f,14.0f)
            }
}

public val LucideIcons.All.ChartColumnIncreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartColumnIncreasing: ImageVector
    @Composable get() = ChartColumnIncreasingDefinition.asImageVector()
