package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CartonOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(5.0,10.0)
                lineTo(5.0,20.0)
                curveTo(5.0,21.104570388793945,5.895430564880371,22.0,7.0,22.0)
                lineTo(17.0,22.0)
                curveTo(18.104570388793945,22.0,19.0,21.104570388793945,19.0,20.0)
                lineTo(19.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(13.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.902000427246094,8.244999885559082)
                lineTo(16.0,6.0)
                lineTo(11.656999588012695,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,13.343000411987305)
                lineTo(19.0,10.0)
                curveTo(19.00029754638672,9.492447853088379,18.807613372802734,9.003767013549805,18.461000442504883,8.633000373840332)
                lineTo(16.0,6.0)
                lineTo(16.0,3.0)
                curveTo(16.0,2.4477152824401855,15.552285194396973,2.0,15.0,2.0)
                lineTo(9.0,2.0)
                curveTo(8.648812294006348,2.000277519226074,8.32351016998291,2.1847548484802246,8.142999649047852,2.4860000610351562)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.033999919891357,7.033999919891357)
                lineTo(5.539000034332275,8.633000373840332)
                curveTo(5.192386150360107,9.003767013549805,4.999701976776123,9.492447853088379,5.0,10.0)
            }
}

public val LucideIcons.All.CartonOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CartonOff: ImageVector
    @Composable get() = CartonOffDefinition.asImageVector()
