package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Grid2x2X") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,20.0f)
                curveTo(12.0f,20.552284f,11.552285f,21.0f,11.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,11.0f)
                curveTo(21.0f,11.552285f,20.552284f,12.0f,20.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,16.5f)
                lineTo(21.5f,21.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,21.5f)
                lineTo(21.5f,16.5f)
            }
}

public val LucideIcons.All.Grid2x2XDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Grid2x2X: ImageVector
    @Composable get() = Grid2x2XDefinition.asImageVector()
