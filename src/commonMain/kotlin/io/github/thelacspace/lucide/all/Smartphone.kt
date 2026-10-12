package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Smartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(17.0,2.0)
                curveTo(18.104570388793945,2.0,19.0,2.895430564880371,19.0,4.0)
                lineTo(19.0,20.0)
                curveTo(19.0,21.104570388793945,18.104570388793945,22.0,17.0,22.0)
                lineTo(7.0,22.0)
                curveTo(5.895430564880371,22.0,5.0,21.104570388793945,5.0,20.0)
                lineTo(5.0,4.0)
                curveTo(5.0,2.895430564880371,5.895430564880371,2.0,7.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.010000228881836,18.0)
            }
}

public val LucideIcons.All.SmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Smartphone: ImageVector
    @Composable get() = SmartphoneDefinition.asImageVector()
