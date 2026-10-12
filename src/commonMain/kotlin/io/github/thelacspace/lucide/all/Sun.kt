package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sun") { strokeWidth ->
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
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.929999828338623,4.929999828338623)
                lineTo(6.339999675750732,6.339999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(17.65999984741211,17.65999984741211)
                lineTo(19.06999969482422,19.06999969482422)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.340000152587891,17.65999984741211)
                lineTo(4.930000305175781,19.06999969482422)
            }
            lucidePath(strokeWidth) {
                moveTo(19.06999969482422,4.929999828338623)
                lineTo(17.65999984741211,6.339999675750732)
            }
}

public val LucideIcons.All.SunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sun: ImageVector
    @Composable get() = SunDefinition.asImageVector()
