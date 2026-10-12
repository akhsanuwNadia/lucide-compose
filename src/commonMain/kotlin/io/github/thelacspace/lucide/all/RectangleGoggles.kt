package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleGoggles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,6.0)
                curveTo(21.104570388793945,6.0,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,16.0)
                curveTo(22.0,17.104570388793945,21.104570388793945,18.0,20.0,18.0)
                lineTo(16.0,18.0)
                curveTo(15.370485305786133,18.0,14.777709007263184,17.703611373901367,14.399999618530273,17.200000762939453)
                lineTo(12.799999237060547,15.070000648498535)
                curveTo(12.61114501953125,14.818194389343262,12.314756393432617,14.670000076293945,11.999999046325684,14.670000076293945)
                curveTo(11.68524169921875,14.670000076293945,11.388853073120117,14.818194389343262,11.19999885559082,15.070000648498535)
                lineTo(9.600000381469727,17.200000762939453)
                curveTo(9.222290992736816,17.703611373901367,8.629514694213867,18.0,8.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                close()
            }
}

public val LucideIcons.All.RectangleGogglesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleGoggles: ImageVector
    @Composable get() = RectangleGogglesDefinition.asImageVector()
