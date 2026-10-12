package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualNot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(19.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,15.0f)
                lineTo(19.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(5.0f,19.0f)
            }
}

public val LucideIcons.All.EqualNotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualNot: ImageVector
    @Composable get() = EqualNotDefinition.asImageVector()
