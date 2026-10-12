package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SunDim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                curveTo(7.993589878082275,13.433323860168457,8.7545804977417,14.760520935058594,9.994818687438965,15.479039192199707)
                curveTo(11.235055923461914,16.19755744934082,12.764944076538086,16.19755744934082,14.005181312561035,15.479039192199707)
                curveTo(15.2454195022583,14.760520935058594,16.006410598754883,13.433323860168457,16.0,12.0)
                curveTo(16.006410598754883,10.566676139831543,15.2454195022583,9.239479064941406,14.005181312561035,8.520960807800293)
                curveTo(12.764944076538086,7.802441596984863,11.235055923461914,7.802441596984863,9.994818687438965,8.520960807800293)
                curveTo(8.7545804977417,9.239479064941406,7.993589878082275,10.566676139831543,8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,4.0)
                lineTo(12.010000228881836,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(20.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(4.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.656999588012695,6.3429999351501465)
                lineTo(17.66699981689453,6.3429999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(17.656999588012695,17.656999588012695)
                lineTo(17.66699981689453,17.656999588012695)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3429999351501465,17.656999588012695)
                lineTo(6.353000164031982,17.656999588012695)
            }
            lucidePath(strokeWidth) {
                moveTo(6.3429999351501465,6.3429999351501465)
                lineTo(6.353000164031982,6.3429999351501465)
            }
}

public val LucideIcons.All.SunDimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SunDim: ImageVector
    @Composable get() = SunDimDefinition.asImageVector()
