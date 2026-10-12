package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(21.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                lineTo(14.0,10.0)
                lineTo(14.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(10.0,14.0)
                lineTo(10.0,20.0)
            }
}

public val LucideIcons.All.Minimize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize2: ImageVector
    @Composable get() = Minimize2Definition.asImageVector()
