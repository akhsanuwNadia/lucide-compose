package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                curveTo(22.0f,17.522848f,17.522848f,22.0f,12.0f,22.0f)
                curveTo(6.4771523f,22.0f,2.0f,17.522848f,2.0f,12.0f)
                curveTo(2.0f,6.4771523f,6.4771523f,2.0f,12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,2.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(22.0f,2.0f)
                lineTo(22.0f,8.0f)
            }
}

public val LucideIcons.All.CircleArrowOutUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutUpRight: ImageVector
    @Composable get() = CircleArrowOutUpRightDefinition.asImageVector()
