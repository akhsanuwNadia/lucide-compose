package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bolt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(21.0,8.0)
                curveTo(20.999267578125,7.286201477050781,20.618167877197266,6.626898765563965,20.0,6.269999980926514)
                lineTo(13.0,2.2699999809265137)
                curveTo(12.381197929382324,1.9127343893051147,11.618802070617676,1.9127343893051147,11.0,2.2699999809265137)
                lineTo(4.0,6.269999980926514)
                curveTo(3.3818318843841553,6.626898765563965,3.000732183456421,7.286201477050781,3.0,8.0)
                lineTo(3.0,16.0)
                curveTo(3.000732421875,16.71379852294922,3.3818321228027344,17.37310028076172,4.0,17.729999542236328)
                lineTo(11.0,21.729999542236328)
                curveTo(11.618802070617676,22.087265014648438,12.381197929382324,22.087265014648438,13.0,21.729999542236328)
                lineTo(20.0,17.729999542236328)
                curveTo(20.618167877197266,17.37310028076172,20.999267578125,16.71379852294922,21.0,16.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                curveTo(7.993589878082275,13.433323860168457,8.7545804977417,14.760520935058594,9.994818687438965,15.479039192199707)
                curveTo(11.235055923461914,16.19755744934082,12.764944076538086,16.19755744934082,14.005181312561035,15.479039192199707)
                curveTo(15.2454195022583,14.760520935058594,16.006410598754883,13.433323860168457,16.0,12.0)
                curveTo(16.006410598754883,10.566676139831543,15.2454195022583,9.239479064941406,14.005181312561035,8.520960807800293)
                curveTo(12.764944076538086,7.802441596984863,11.235055923461914,7.802441596984863,9.994818687438965,8.520960807800293)
                curveTo(8.7545804977417,9.239479064941406,7.993589878082275,10.566676139831543,8.0,12.0)
            }
}

public val LucideIcons.All.BoltDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bolt: ImageVector
    @Composable get() = BoltDefinition.asImageVector()
