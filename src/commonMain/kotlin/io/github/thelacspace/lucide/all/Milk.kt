package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Milk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,4.789000034332275)
                curveTo(8.999979972839355,5.578788757324219,8.766155242919922,6.35089635848999,8.32800006866455,7.008000373840332)
                lineTo(7.671999931335449,7.992000579833984)
                curveTo(7.2336554527282715,8.649388313293457,6.999823093414307,9.421871185302734,7.0,10.211999893188477)
                lineTo(7.0,20.0)
                curveTo(7.0,21.104570388793945,7.895430564880371,22.0,9.0,22.0)
                lineTo(15.0,22.0)
                curveTo(16.104570388793945,22.0,17.0,21.104570388793945,17.0,20.0)
                lineTo(17.0,10.211000442504883)
                curveTo(16.99997901916504,9.421212196350098,16.766155242919922,8.649104118347168,16.327999114990234,7.992000579833984)
                lineTo(15.671998977661133,7.008000373840332)
                curveTo(15.233654975891113,6.350612640380859,14.999822616577148,5.578129291534424,15.0,4.788000106811523)
                lineTo(15.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                curveTo(8.599372863769531,14.330206871032715,10.400627136230469,14.330206871032715,12.0,15.0)
                curveTo(13.59932804107666,15.67001724243164,15.40067195892334,15.67001724243164,17.0,15.0)
            }
}

public val LucideIcons.All.MilkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Milk: ImageVector
    @Composable get() = MilkDefinition.asImageVector()
