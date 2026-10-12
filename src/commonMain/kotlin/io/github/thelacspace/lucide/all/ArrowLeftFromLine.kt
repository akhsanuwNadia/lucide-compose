package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowLeftFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,6.0)
                lineTo(3.0,12.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(17.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,19.0)
                lineTo(21.0,5.0)
            }
}

public val LucideIcons.All.ArrowLeftFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowLeftFromLine: ImageVector
    @Composable get() = ArrowLeftFromLineDefinition.asImageVector()
