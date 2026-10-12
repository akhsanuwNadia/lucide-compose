package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Warehouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                lineTo(18.0,10.0)
                curveTo(18.0,9.447714805603027,17.552284240722656,9.0,17.0,9.0)
                lineTo(7.0,9.0)
                curveTo(6.4477152824401855,9.0,6.0,9.447714805603027,6.0,10.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                curveTo(22.0,20.104570388793945,21.104570388793945,21.0,20.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,8.0)
                curveTo(1.9995487928390503,7.231415748596191,2.43957257270813,6.53056526184082,3.131999969482422,6.197000026702881)
                lineTo(11.081999778747559,2.2230000495910645)
                curveTo(11.658113479614258,1.92515230178833,12.342885971069336,1.92515230178833,12.918999671936035,2.2230000495910645)
                lineTo(20.867000579833984,6.197000026702881)
                curveTo(21.559816360473633,6.530279636383057,22.000267028808594,7.231189250946045,22.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(18.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                lineTo(18.0,17.0)
            }
}

public val LucideIcons.All.WarehouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Warehouse: ImageVector
    @Composable get() = WarehouseDefinition.asImageVector()
