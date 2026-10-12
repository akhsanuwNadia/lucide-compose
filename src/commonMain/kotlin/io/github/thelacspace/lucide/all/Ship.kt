package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ship") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,9.189000129699707)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(19.0,6.0)
                curveTo(19.0,4.895430564880371,18.104570388793945,4.0,17.0,4.0)
                lineTo(7.0,4.0)
                curveTo(5.895430564880371,4.0,5.0,4.895430564880371,5.0,6.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.3799991607666,19.0)
                curveTo(20.455684661865234,17.18457794189453,21.01578712463379,15.11012077331543,21.0,13.0)
                lineTo(12.812000274658203,9.361000061035156)
                curveTo(12.295027732849121,9.131328582763672,11.704973220825195,9.131328582763672,11.188000679016113,9.361000061035156)
                lineTo(3.0,13.00100040435791)
                curveTo(2.953707695007324,15.84467887878418,3.9537172317504883,18.606271743774414,5.809999942779541,20.761001586914062)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                curveTo(2.5999999046325684,20.5,3.200000047683716,21.0,4.5,21.0)
                curveTo(7.0,21.0,7.0,19.0,9.5,19.0)
                curveTo(10.800000190734863,19.0,11.399999618530273,19.5,12.0,20.0)
                curveTo(12.600000381469727,20.5,13.199999809265137,21.0,14.5,21.0)
                curveTo(17.0,21.0,17.0,19.0,19.5,19.0)
                curveTo(20.799999237060547,19.0,21.399999618530273,19.5,22.0,20.0)
            }
}

public val LucideIcons.All.ShipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ship: ImageVector
    @Composable get() = ShipDefinition.asImageVector()
