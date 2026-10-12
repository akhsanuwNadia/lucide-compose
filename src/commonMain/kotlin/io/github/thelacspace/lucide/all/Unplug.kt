package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unplug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(22.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.300000190734863,20.299999237060547)
                curveTo(6.750324726104736,20.751890182495117,7.36203670501709,21.005891799926758,8.0,21.005891799926758)
                curveTo(8.637964248657227,21.005891799926758,9.249676704406738,20.751890182495117,9.700000762939453,20.299999237060547)
                lineTo(12.0,18.0)
                lineTo(6.0,12.0)
                lineTo(3.700000047683716,14.300000190734863)
                curveTo(3.2481091022491455,14.750324249267578,2.994107246398926,15.36203670501709,2.994107246398926,16.0)
                curveTo(2.994107246398926,16.637964248657227,3.2481091022491455,17.249675750732422,3.700000047683716,17.700000762939453)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,13.5)
                lineTo(10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.5,16.5)
                lineTo(13.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(18.0,12.0)
                lineTo(20.299999237060547,9.699999809265137)
                curveTo(20.751890182495117,9.249675750732422,21.005891799926758,8.63796329498291,21.005891799926758,8.0)
                curveTo(21.005891799926758,7.362036228179932,20.751890182495117,6.750324249267578,20.299999237060547,6.299999713897705)
                lineTo(17.69999885559082,3.6999998092651367)
                curveTo(17.24967384338379,3.2481091022491455,16.637962341308594,2.994107484817505,15.999999046325684,2.994107484817505)
                curveTo(15.362035751342773,2.994107484817505,14.750323295593262,3.2481091022491455,14.299999237060547,3.6999998092651367)
                close()
            }
}

public val LucideIcons.All.UnplugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unplug: ImageVector
    @Composable get() = UnplugDefinition.asImageVector()
