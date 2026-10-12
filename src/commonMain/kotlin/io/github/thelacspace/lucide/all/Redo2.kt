package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Redo2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(20.0,9.0)
                lineTo(15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(9.5,9.0)
                curveTo(6.462433815002441,9.0,4.0,11.462433815002441,4.0,14.5)
                curveTo(4.0,17.537565231323242,6.462433815002441,20.0,9.5,20.0)
                lineTo(13.0,20.0)
            }
}

public val LucideIcons.All.Redo2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Redo2: ImageVector
    @Composable get() = Redo2Definition.asImageVector()
