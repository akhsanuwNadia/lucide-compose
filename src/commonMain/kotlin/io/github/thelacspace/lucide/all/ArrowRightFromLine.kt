package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowRightFromLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(7.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(21.0,12.0)
                lineTo(15.0,6.0)
            }
}

public val LucideIcons.All.ArrowRightFromLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowRightFromLine: ImageVector
    @Composable get() = ArrowRightFromLineDefinition.asImageVector()
