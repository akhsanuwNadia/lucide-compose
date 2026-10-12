package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Code") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                lineTo(22.0f,12.0f)
                lineTo(16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(2.0f,12.0f)
                lineTo(8.0f,18.0f)
            }
}

public val LucideIcons.All.CodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Code: ImageVector
    @Composable get() = CodeDefinition.asImageVector()
