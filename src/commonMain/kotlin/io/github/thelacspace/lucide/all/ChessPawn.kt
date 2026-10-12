package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessPawn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                curveTo(5.0,18.895429611206055,5.895430564880371,18.0,7.0,18.0)
                lineTo(17.0,18.0)
                curveTo(18.104570388793945,18.0,19.0,18.895429611206055,19.0,20.0)
                lineTo(19.0,21.0)
                curveTo(19.0,21.552284240722656,18.552284240722656,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.4477152824401855,22.0,5.0,21.552284240722656,5.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.5,10.0)
                lineTo(16.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(9.5,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,6.0)
                curveTo(7.993589878082275,7.433323860168457,8.7545804977417,8.760520935058594,9.994818687438965,9.479039192199707)
                curveTo(11.235055923461914,10.197558403015137,12.764944076538086,10.197558403015137,14.005181312561035,9.479039192199707)
                curveTo(15.2454195022583,8.760520935058594,16.006410598754883,7.433323860168457,16.0,6.0)
                curveTo(16.006410598754883,4.566676139831543,15.2454195022583,3.2394790649414062,14.005181312561035,2.5209603309631348)
                curveTo(12.764944076538086,1.8024417161941528,11.235055923461914,1.8024417161941528,9.994818687438965,2.5209603309631348)
                curveTo(8.7545804977417,3.2394790649414062,7.993589878082275,4.566676139831543,8.0,6.0)
            }
}

public val LucideIcons.All.ChessPawnDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessPawn: ImageVector
    @Composable get() = ChessPawnDefinition.asImageVector()
