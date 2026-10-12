package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Speaker") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,2.0)
                lineTo(18.0,2.0)
                lineTo(20.0,2.0)
                lineTo(20.0,22.0)
                lineTo(18.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,2.0)
                lineTo(6.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                curveTo(7.993589878082275,15.433323860168457,8.7545804977417,16.760520935058594,9.994818687438965,17.479040145874023)
                curveTo(11.235055923461914,18.19755744934082,12.764944076538086,18.19755744934082,14.005181312561035,17.479040145874023)
                curveTo(15.2454195022583,16.760520935058594,16.006410598754883,15.433323860168457,16.0,14.0)
                curveTo(16.006410598754883,12.566676139831543,15.2454195022583,11.239479064941406,14.005181312561035,10.520960807800293)
                curveTo(12.764944076538086,9.802441596984863,11.235055923461914,9.802441596984863,9.994818687438965,10.520960807800293)
                curveTo(8.7545804977417,11.239479064941406,7.993589878082275,12.566676139831543,8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.010000228881836,14.0)
            }
}

public val LucideIcons.All.SpeakerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Speaker: ImageVector
    @Composable get() = SpeakerDefinition.asImageVector()
