package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipCargo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,12.0)
                lineTo(16.5,9.0)
                curveTo(16.5,8.447714805603027,16.947715759277344,8.0,17.5,8.0)
                lineTo(18.5,8.0)
                curveTo(19.052284240722656,8.0,19.5,7.5522847175598145,19.5,7.0)
                lineTo(19.5,5.0)
                curveTo(19.5,4.4477152824401855,19.052284240722656,4.0,18.5,4.0)
                lineTo(5.5,4.0)
                curveTo(4.9477152824401855,4.0,4.5,4.4477152824401855,4.5,5.0)
                lineTo(4.5,7.0)
                curveTo(4.5,7.5522847175598145,4.9477152824401855,8.0,5.5,8.0)
                lineTo(6.5,8.0)
                curveTo(7.0522847175598145,8.0,7.5,8.447714805603027,7.5,9.0)
                lineTo(7.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.3799991607666,19.0)
                curveTo(20.45599937438965,17.184999465942383,21.01599884033203,14.110000610351562,21.007999420166016,12.992000579833984)
                curveTo(21.003604888916016,12.442842483520508,20.557174682617188,11.999983787536621,20.007999420166016,12.000000953674316)
                lineTo(3.9839999675750732,12.000000953674316)
                curveTo(3.437903642654419,11.999931335449219,2.992737293243408,12.43797492980957,2.9839999675750732,12.984001159667969)
                curveTo(2.9539999961853027,14.844000816345215,3.9539999961853027,18.60500144958496,5.809999942779541,20.76000213623047)
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

public val LucideIcons.All.ShipCargoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipCargo: ImageVector
    @Composable get() = ShipCargoDefinition.asImageVector()
