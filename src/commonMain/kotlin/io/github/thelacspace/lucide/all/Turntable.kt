package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Turntable") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.010000228881836)
                lineTo(10.010000228881836,12.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.0,12.0)
                curveTo(18.000545501708984,13.404129981994629,17.631519317626953,14.783672332763672,16.93000030517578,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.993589878082275,13.433323860168457,6.754580497741699,14.760520935058594,7.994818210601807,15.479039192199707)
                curveTo(9.235055923461914,16.19755744934082,10.764944076538086,16.19755744934082,12.005181312561035,15.479039192199707)
                curveTo(13.2454195022583,14.760520935058594,14.006409645080566,13.433323860168457,14.0,12.0)
                curveTo(14.006409645080566,10.566676139831543,13.2454195022583,9.239479064941406,12.005181312561035,8.520960807800293)
                curveTo(10.764944076538086,7.802441596984863,9.235055923461914,7.802441596984863,7.994818210601807,8.520960807800293)
                curveTo(6.754580497741699,9.239479064941406,5.993589878082275,10.566676139831543,6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
}

public val LucideIcons.All.TurntableDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Turntable: ImageVector
    @Composable get() = TurntableDefinition.asImageVector()
