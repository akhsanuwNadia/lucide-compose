package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                curveTo(9.0,4.4477152824401855,9.447714805603027,4.0,10.0,4.0)
                lineTo(14.0,4.0)
                curveTo(14.552285194396973,4.0,15.0,4.4477152824401855,15.0,5.0)
                lineTo(15.0,11.0)
                curveTo(15.0,11.552285194396973,15.447714805603027,12.0,16.0,12.0)
                lineTo(19.292999267578125,12.0)
                curveTo(19.57900047302246,11.99993896484375,19.836868286132812,12.172194480895996,19.946325302124023,12.436422348022461)
                curveTo(20.0557804107666,12.700650215148926,19.995264053344727,13.004796981811523,19.792999267578125,13.206999778747559)
                lineTo(12.706998825073242,20.292999267578125)
                curveTo(12.316498756408691,20.683380126953125,11.683499336242676,20.683380126953125,11.292999267578125,20.292999267578125)
                lineTo(4.2069993019104,13.206998825073242)
                curveTo(4.004734992980957,13.004796028137207,3.9442176818847656,12.70064926147461,4.053674221038818,12.436421394348145)
                curveTo(4.163130760192871,12.17219352722168,4.420997619628906,11.999938011169434,4.7069993019104,11.999999046325684)
                lineTo(8.0,11.999999046325684)
                curveTo(8.552285194396973,11.999999046325684,9.0,11.552284240722656,9.0,10.999999046325684)
                close()
            }
}

public val LucideIcons.All.ArrowBigDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDown: ImageVector
    @Composable get() = ArrowBigDownDefinition.asImageVector()
