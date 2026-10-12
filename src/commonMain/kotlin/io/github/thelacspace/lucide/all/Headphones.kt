package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Headphones") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,14.0)
                lineTo(6.0,14.0)
                curveTo(7.104569435119629,14.0,8.0,14.895430564880371,8.0,16.0)
                lineTo(8.0,19.0)
                curveTo(8.0,20.104570388793945,7.104569435119629,21.0,6.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,12.0)
                curveTo(3.0221588611602783,7.0451483726501465,7.045098781585693,3.040159225463867,12.0,3.040159225463867)
                curveTo(16.95490074157715,3.040159225463867,20.977840423583984,7.0451483726501465,21.0,12.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(18.0,21.0)
                curveTo(16.895429611206055,21.0,16.0,20.104570388793945,16.0,19.0)
                lineTo(16.0,16.0)
                curveTo(16.0,14.895430564880371,16.895429611206055,14.0,18.0,14.0)
                lineTo(21.0,14.0)
            }
}

public val LucideIcons.All.HeadphonesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Headphones: ImageVector
    @Composable get() = HeadphonesDefinition.asImageVector()
