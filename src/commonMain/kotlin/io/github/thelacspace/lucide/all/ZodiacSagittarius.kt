package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacSagittarius") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(3.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(15.0,15.0)
            }
}

public val LucideIcons.All.ZodiacSagittariusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacSagittarius: ImageVector
    @Composable get() = ZodiacSagittariusDefinition.asImageVector()
