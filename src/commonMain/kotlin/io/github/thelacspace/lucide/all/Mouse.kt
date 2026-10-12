package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,2.0f)
                lineTo(19.0f,2.0f)
                lineTo(19.0f,22.0f)
                lineTo(12.0f,22.0f)
                lineTo(12.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(5.0f,2.0f)
                lineTo(12.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,10.0f)
            }
}

public val LucideIcons.All.MouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mouse: ImageVector
    @Composable get() = MouseDefinition.asImageVector()
