package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartBarIncreasing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(15.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.0f)
                lineTo(19.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,6.0f)
                lineTo(10.0f,6.0f)
            }
}

public val LucideIcons.All.ChartBarIncreasingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartBarIncreasing: ImageVector
    @Composable get() = ChartBarIncreasingDefinition.asImageVector()
