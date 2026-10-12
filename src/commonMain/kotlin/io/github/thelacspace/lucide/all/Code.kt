package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Code") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                lineTo(22.0,12.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                lineTo(2.0,12.0)
                lineTo(8.0,18.0)
            }
}

public val LucideIcons.All.CodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Code: ImageVector
    @Composable get() = CodeDefinition.asImageVector()
