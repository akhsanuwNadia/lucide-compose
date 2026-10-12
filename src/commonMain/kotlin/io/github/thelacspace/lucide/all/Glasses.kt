package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Glasses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                curveTo(1.993589997291565,16.43332290649414,2.7545807361602783,17.760520935058594,3.9948182106018066,18.479040145874023)
                curveTo(5.235055923461914,19.19755744934082,6.764944076538086,19.19755744934082,8.005181312561035,18.479040145874023)
                curveTo(9.2454195022583,17.760520935058594,10.006409645080566,16.43332290649414,10.0,15.0)
                curveTo(10.006409645080566,13.566676139831543,9.2454195022583,12.239479064941406,8.005181312561035,11.520960807800293)
                curveTo(6.764944076538086,10.802441596984863,5.235055923461914,10.802441596984863,3.9948182106018066,11.520960807800293)
                curveTo(2.7545807361602783,12.239479064941406,1.993589997291565,13.566676139831543,2.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                curveTo(13.993590354919434,16.43332290649414,14.7545804977417,17.760520935058594,15.994818687438965,18.479040145874023)
                curveTo(17.235055923461914,19.19755744934082,18.764944076538086,19.19755744934082,20.00518226623535,18.479040145874023)
                curveTo(21.245418548583984,17.760520935058594,22.006410598754883,16.43332290649414,22.0,15.0)
                curveTo(22.006410598754883,13.566676139831543,21.245418548583984,12.239479064941406,20.00518226623535,11.520960807800293)
                curveTo(18.764944076538086,10.802441596984863,17.235055923461914,10.802441596984863,15.994818687438965,11.520960807800293)
                curveTo(14.7545804977417,12.239479064941406,13.993590354919434,13.566676139831543,14.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                curveTo(14.0,13.895430564880371,13.104569435119629,13.0,12.0,13.0)
                curveTo(10.895430564880371,13.0,10.0,13.895430564880371,10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.5,13.0)
                lineTo(5.0,7.0)
                curveTo(5.699999809265137,5.699999809265137,6.400000095367432,5.0,8.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,13.0)
                lineTo(19.0,7.0)
                curveTo(18.299999237060547,5.699999809265137,17.5,5.0,16.0,5.0)
            }
}

public val LucideIcons.All.GlassesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Glasses: ImageVector
    @Composable get() = GlassesDefinition.asImageVector()
