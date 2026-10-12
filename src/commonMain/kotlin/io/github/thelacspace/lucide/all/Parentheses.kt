package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Parentheses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                curveTo(8.0f,21.0f,4.0f,18.0f,4.0f,12.0f)
                curveTo(4.0f,6.0f,8.0f,3.0f,8.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                curveTo(16.0f,3.0f,20.0f,6.0f,20.0f,12.0f)
                curveTo(20.0f,18.0f,16.0f,21.0f,16.0f,21.0f)
            }
}

public val LucideIcons.All.ParenthesesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Parentheses: ImageVector
    @Composable get() = ParenthesesDefinition.asImageVector()
