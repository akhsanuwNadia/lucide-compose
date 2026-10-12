package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tally4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(4.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,4.0)
                lineTo(9.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,4.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.Tally4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tally4: ImageVector
    @Composable get() = Tally4Definition.asImageVector()
