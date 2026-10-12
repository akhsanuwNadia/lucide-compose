package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.5,21.0)
                lineTo(14.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5,21.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,21.0)
                lineTo(12.0,15.0)
                lineTo(8.5,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(22.0,21.0)
            }
}

public val LucideIcons.All.TentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tent: ImageVector
    @Composable get() = TentDefinition.asImageVector()
