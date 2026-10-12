package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualNot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,9.0)
                lineTo(19.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,15.0)
                lineTo(19.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(5.0,19.0)
            }
}

public val LucideIcons.All.EqualNotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualNot: ImageVector
    @Composable get() = EqualNotDefinition.asImageVector()
