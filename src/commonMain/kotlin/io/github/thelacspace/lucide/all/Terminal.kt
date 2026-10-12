package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Terminal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(20.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,17.0)
                lineTo(10.0,11.0)
                lineTo(4.0,5.0)
            }
}

public val LucideIcons.All.TerminalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Terminal: ImageVector
    @Composable get() = TerminalDefinition.asImageVector()
