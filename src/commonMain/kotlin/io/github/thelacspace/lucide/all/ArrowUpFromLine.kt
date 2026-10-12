package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,9.0)
                lineTo(12.0,3.0)
                lineTo(6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(19.0,21.0)
            }
}

public val LucideIcons.All.ArrowUpFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpFromLine: ImageVector
    @Composable get() = ArrowUpFromLineDefinition.asImageVector()
