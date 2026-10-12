package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parentheses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                curveTo(8.0,21.0,4.0,18.0,4.0,12.0)
                curveTo(4.0,6.0,8.0,3.0,8.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                curveTo(16.0,3.0,20.0,6.0,20.0,12.0)
                curveTo(20.0,18.0,16.0,21.0,16.0,21.0)
            }
}

public val LucideIcons.All.ParenthesesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parentheses: ImageVector
    @Composable get() = ParenthesesDefinition.asImageVector()
