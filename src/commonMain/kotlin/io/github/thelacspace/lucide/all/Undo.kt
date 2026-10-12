package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,13.0f)
                lineTo(9.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                curveTo(21.0f,12.029437f,16.970562f,8.0f,12.0f,8.0f)
                curveTo(9.785122f,8.002255f,7.6488533f,8.821158f,6.0f,10.3f)
                lineTo(3.0f,13.0f)
            }
}

public val LucideIcons.All.UndoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo: ImageVector
    @Composable get() = UndoDefinition.asImageVector()
