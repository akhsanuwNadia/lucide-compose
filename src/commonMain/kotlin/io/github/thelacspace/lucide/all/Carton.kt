package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carton") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(13.0,10.0)
                curveTo(12.999702453613281,9.492447853088379,13.19238567352295,9.003767013549805,13.538999557495117,8.633000373840332)
                lineTo(16.0,6.0)
                lineTo(8.0,6.0)
                lineTo(5.539000034332275,8.633000373840332)
                curveTo(5.192386150360107,9.003767013549805,4.999701976776123,9.492447853088379,5.0,10.0)
                lineTo(5.0,20.0)
                curveTo(5.0,21.104570388793945,5.895430564880371,22.0,7.0,22.0)
                lineTo(17.0,22.0)
                curveTo(18.104570388793945,22.0,19.0,21.104570388793945,19.0,20.0)
                lineTo(19.0,10.0)
                curveTo(19.00029754638672,9.492447853088379,18.807613372802734,9.003767013549805,18.461000442504883,8.633000373840332)
                lineTo(16.0,6.0)
                lineTo(16.0,3.0)
                curveTo(16.0,2.4477152824401855,15.552285194396973,2.0,15.0,2.0)
                lineTo(9.0,2.0)
                curveTo(8.447714805603027,2.0,8.0,2.4477152824401855,8.0,3.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(13.0,10.0)
            }
}

public val LucideIcons.All.CartonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carton: ImageVector
    @Composable get() = CartonDefinition.asImageVector()
