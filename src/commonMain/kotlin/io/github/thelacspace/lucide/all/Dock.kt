package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(18.0f,16.0f)
            }
}

public val LucideIcons.All.DockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dock: ImageVector
    @Composable get() = DockDefinition.asImageVector()
