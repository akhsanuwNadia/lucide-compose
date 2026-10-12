package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,12.0)
                lineTo(19.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,19.0)
            }
}

public val LucideIcons.All.PlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plus: ImageVector
    @Composable get() = PlusDefinition.asImageVector()
