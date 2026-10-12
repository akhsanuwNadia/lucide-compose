package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TabletSmartphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(11.0,8.0)
                lineTo(13.0,8.0)
                lineTo(13.0,22.0)
                lineTo(11.0,22.0)
                lineTo(5.0,22.0)
                lineTo(3.0,22.0)
                lineTo(3.0,8.0)
                lineTo(5.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,4.0)
                curveTo(5.0,2.895430564880371,5.895430564880371,2.0,7.0,2.0)
                lineTo(19.0,2.0)
                curveTo(20.104570388793945,2.0,21.0,2.895430564880371,21.0,4.0)
                lineTo(21.0,20.0)
                curveTo(21.0,21.104570388793945,20.104570388793945,22.0,19.0,22.0)
                lineTo(16.600000381469727,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(8.010000228881836,18.0)
            }
}

public val LucideIcons.All.TabletSmartphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TabletSmartphone: ImageVector
    @Composable get() = TabletSmartphoneDefinition.asImageVector()
