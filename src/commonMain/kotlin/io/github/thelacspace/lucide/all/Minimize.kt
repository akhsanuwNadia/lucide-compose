package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(8.0,6.0)
                curveTo(8.0,7.104569435119629,7.104569435119629,8.0,6.0,8.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(18.0,8.0)
                curveTo(16.895429611206055,8.0,16.0,7.104569435119629,16.0,6.0)
                lineTo(16.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(6.0,16.0)
                curveTo(7.104569435119629,16.0,8.0,16.895429611206055,8.0,18.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(16.0,18.0)
                curveTo(16.0,16.895429611206055,16.895429611206055,16.0,18.0,16.0)
                lineTo(21.0,16.0)
            }
}

public val LucideIcons.All.MinimizeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize: ImageVector
    @Composable get() = MinimizeDefinition.asImageVector()
