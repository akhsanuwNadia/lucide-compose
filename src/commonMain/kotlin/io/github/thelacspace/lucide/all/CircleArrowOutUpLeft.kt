package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleArrowOutUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(2.0f,2.0f)
                lineTo(8.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(17.522848f,2.0f,22.0f,6.4771523f,22.0f,12.0f)
                curveTo(22.0f,17.522848f,17.522848f,22.0f,12.0f,22.0f)
                curveTo(6.4771523f,22.0f,2.0f,17.522848f,2.0f,12.0f)
            }
}

public val LucideIcons.All.CircleArrowOutUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleArrowOutUpLeft: ImageVector
    @Composable get() = CircleArrowOutUpLeftDefinition.asImageVector()
