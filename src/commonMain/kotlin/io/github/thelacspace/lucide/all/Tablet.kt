package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tablet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                curveTo(19.104570388793945,2.0,20.0,2.895430564880371,20.0,4.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.010000228881836,18.0)
            }
}

public val LucideIcons.All.TabletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tablet: ImageVector
    @Composable get() = TabletDefinition.asImageVector()
