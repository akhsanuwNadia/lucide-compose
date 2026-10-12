package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.5,3.0)
                lineTo(19.5,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(6.0,19.0)
                curveTo(6.0,20.104570388793945,6.895430564880371,21.0,8.0,21.0)
                lineTo(16.0,21.0)
                curveTo(17.104570388793945,21.0,18.0,20.104570388793945,18.0,19.0)
                lineTo(18.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(18.0,14.0)
            }
}

public val LucideIcons.All.BeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beaker: ImageVector
    @Composable get() = BeakerDefinition.asImageVector()
