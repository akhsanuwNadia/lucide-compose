package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coffee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                curveTo(16.552284240722656,8.0,17.0,8.447714805603027,17.0,9.0)
                lineTo(17.0,17.0)
                curveTo(17.0,19.209138870239258,15.209138870239258,21.0,13.0,21.0)
                lineTo(7.0,21.0)
                curveTo(4.790861129760742,21.0,3.0,19.209138870239258,3.0,17.0)
                lineTo(3.0,9.0)
                curveTo(3.0,8.447714805603027,3.4477152824401855,8.0,4.0,8.0)
                lineTo(18.0,8.0)
                curveTo(19.43332290649414,7.993589878082275,20.760520935058594,8.7545804977417,21.479040145874023,9.994818687438965)
                curveTo(22.19755744934082,11.235055923461914,22.19755744934082,12.764944076538086,21.479040145874023,14.005181312561035)
                curveTo(20.760520935058594,15.2454195022583,19.43332290649414,16.006410598754883,18.0,16.0)
                lineTo(17.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(6.0,4.0)
            }
}

public val LucideIcons.All.CoffeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coffee: ImageVector
    @Composable get() = CoffeeDefinition.asImageVector()
