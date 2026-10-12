package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.4f,20.4f)
                curveTo(20.030739f,20.776829f,19.527538f,20.992485f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0022328f,4.470423f,3.2144122f,3.9633505f,3.59f,3.5900002f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.3f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(8.7f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(2.0f,2.0f)
            }
}

public val LucideIcons.All.SquareOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareOff: ImageVector
    @Composable get() = SquareOffDefinition.asImageVector()
