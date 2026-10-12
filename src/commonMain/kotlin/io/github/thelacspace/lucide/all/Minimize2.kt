package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Minimize2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(14.0f,10.0f)
                lineTo(14.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(10.0f,14.0f)
                lineTo(10.0f,20.0f)
            }
}

public val LucideIcons.All.Minimize2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Minimize2: ImageVector
    @Composable get() = Minimize2Definition.asImageVector()
