package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Voicemail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.993589997291565,13.433323860168457,2.7545807361602783,14.760520935058594,3.9948182106018066,15.479039192199707)
                curveTo(5.235055923461914,16.19755744934082,6.764944076538086,16.19755744934082,8.005181312561035,15.479039192199707)
                curveTo(9.2454195022583,14.760520935058594,10.006409645080566,13.433323860168457,10.0,12.0)
                curveTo(10.006409645080566,10.566676139831543,9.2454195022583,9.239479064941406,8.005181312561035,8.520960807800293)
                curveTo(6.764944076538086,7.802441596984863,5.235055923461914,7.802441596984863,3.9948182106018066,8.520960807800293)
                curveTo(2.7545807361602783,9.239479064941406,1.993589997291565,10.566676139831543,2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                curveTo(13.993590354919434,13.433323860168457,14.7545804977417,14.760520935058594,15.994818687438965,15.479039192199707)
                curveTo(17.235055923461914,16.19755744934082,18.764944076538086,16.19755744934082,20.00518226623535,15.479039192199707)
                curveTo(21.245418548583984,14.760520935058594,22.006410598754883,13.433323860168457,22.0,12.0)
                curveTo(22.006410598754883,10.566676139831543,21.245418548583984,9.239479064941406,20.00518226623535,8.520960807800293)
                curveTo(18.764944076538086,7.802441596984863,17.235055923461914,7.802441596984863,15.994818687438965,8.520960807800293)
                curveTo(14.7545804977417,9.239479064941406,13.993590354919434,10.566676139831543,14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(18.0,16.0)
            }
}

public val LucideIcons.All.VoicemailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Voicemail: ImageVector
    @Composable get() = VoicemailDefinition.asImageVector()
