package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(8.0f,6.0f)
                curveTo(8.0f,7.1045694f,7.1045694f,8.0f,6.0f,8.0f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(18.0f,8.0f)
                curveTo(16.89543f,8.0f,16.0f,7.1045694f,16.0f,6.0f)
                lineTo(16.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(6.0f,16.0f)
                curveTo(7.1045694f,16.0f,8.0f,16.89543f,8.0f,18.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(16.0f,18.0f)
                curveTo(16.0f,16.89543f,16.89543f,16.0f,18.0f,16.0f)
                lineTo(21.0f,16.0f)
            }
}

public val LucideIcons.All.MinimizeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize: ImageVector
    @Composable get() = MinimizeDefinition.asImageVector()
