package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutDownLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(2.0f,6.4771523f,6.4771523f,2.0f,12.0f,2.0f)
                curveTo(17.522848f,2.0f,22.0f,6.4771523f,22.0f,12.0f)
                curveTo(22.0f,17.522848f,17.522848f,22.0f,12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,16.0f)
            }
}

public val LucideIcons.All.CircleArrowOutDownLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutDownLeft: ImageVector
    @Composable get() = CircleArrowOutDownLeftDefinition.asImageVector()
