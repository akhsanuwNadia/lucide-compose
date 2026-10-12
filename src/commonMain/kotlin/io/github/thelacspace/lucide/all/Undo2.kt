package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,14.0)
                lineTo(4.0,9.0)
                lineTo(9.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(14.5,9.0)
                curveTo(17.537565231323242,9.0,20.0,11.462433815002441,20.0,14.5)
                curveTo(20.0,17.537565231323242,17.537565231323242,20.0,14.5,20.0)
                lineTo(11.0,20.0)
            }
}

public val LucideIcons.All.Undo2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo2: ImageVector
    @Composable get() = Undo2Definition.asImageVector()
