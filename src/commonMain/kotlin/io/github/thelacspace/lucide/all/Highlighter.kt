package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Highlighter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(3.0f,17.0f)
                lineTo(3.0f,20.0f)
                lineTo(12.0f,20.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(17.4f,16.6f)
                curveTo(16.622313f,17.362286f,15.3776865f,17.362286f,14.599999f,16.6f)
                lineTo(9.4f,11.400001f)
                curveTo(8.637713f,10.6223135f,8.637713f,9.377687f,9.4f,8.6f)
                lineTo(14.0f,4.0f)
            }
}

public val LucideIcons.All.HighlighterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Highlighter: ImageVector
    @Composable get() = HighlighterDefinition.asImageVector()
