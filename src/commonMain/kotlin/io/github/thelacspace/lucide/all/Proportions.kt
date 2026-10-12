package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Proportions") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(15.0,9.0)
                curveTo(16.104570388793945,9.0,17.0,9.895430564880371,17.0,11.0)
                lineTo(17.0,20.0)
            }
}

public val LucideIcons.All.ProportionsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Proportions: ImageVector
    @Composable get() = ProportionsDefinition.asImageVector()
