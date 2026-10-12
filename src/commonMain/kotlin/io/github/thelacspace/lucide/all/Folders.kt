package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Folders") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,5.0)
                curveTo(21.104570388793945,5.0,22.0,5.895430564880371,22.0,7.0)
                lineTo(22.0,14.0)
                curveTo(22.0,15.104569435119629,21.104570388793945,16.0,20.0,16.0)
                lineTo(9.0,16.0)
                curveTo(7.895430564880371,16.0,7.0,15.104569435119629,7.0,14.0)
                lineTo(7.0,5.0)
                curveTo(7.0,3.895430564880371,7.895430564880371,3.0,9.0,3.0)
                lineTo(11.5,3.0)
                curveTo(11.972135543823242,3.0,12.416718482971191,3.2222912311553955,12.699999809265137,3.5999999046325684)
                lineTo(13.300000190734863,4.400000095367432)
                curveTo(13.583281517028809,4.777709007263184,14.027864456176758,5.0,14.5,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,8.267999649047852)
                curveTo(2.3793535232543945,8.626325607299805,1.9978700876235962,9.28934383392334,2.0,10.005999565124512)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(15.0,21.0)
                curveTo(15.714512825012207,20.999982833862305,16.374744415283203,20.618785858154297,16.73200035095215,20.0)
            }
}

public val LucideIcons.All.FoldersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Folders: ImageVector
    @Composable get() = FoldersDefinition.asImageVector()
