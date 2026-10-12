package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VideoOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.65999984741211,6.0)
                lineTo(14.0,6.0)
                curveTo(15.104569435119629,6.0,16.0,6.895430564880371,16.0,8.0)
                lineTo(16.0,10.5)
                lineTo(21.248001098632812,7.437999725341797)
                curveTo(21.402666091918945,7.347747802734375,21.593788146972656,7.347099304199219,21.74906349182129,7.436299800872803)
                curveTo(21.90433692932129,7.5254998207092285,22.00005340576172,7.690927982330322,22.0,7.869999885559082)
                lineTo(22.0,16.06599998474121)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                curveTo(16.0,17.104570388793945,15.104569435119629,18.0,14.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.VideoOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VideoOff: ImageVector
    @Composable get() = VideoOffDefinition.asImageVector()
