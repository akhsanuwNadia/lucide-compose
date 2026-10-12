package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.206999778747559,19.792999267578125)
                curveTo(13.004796981811523,19.995264053344727,12.700650215148926,20.0557804107666,12.436422348022461,19.946325302124023)
                curveTo(12.172194480895996,19.836868286132812,11.99993896484375,19.57900047302246,12.0,19.292999267578125)
                lineTo(12.0,16.0)
                curveTo(12.0,15.447714805603027,11.552285194396973,15.0,11.0,15.0)
                lineTo(5.0,15.0)
                curveTo(4.4477152824401855,15.0,4.0,14.552285194396973,4.0,14.0)
                lineTo(4.0,10.0)
                curveTo(4.0,9.447714805603027,4.4477152824401855,9.0,5.0,9.0)
                lineTo(11.0,9.0)
                curveTo(11.552285194396973,9.0,12.0,8.552285194396973,12.0,8.0)
                lineTo(12.0,4.706999778747559)
                curveTo(11.99993896484375,4.4209980964660645,12.172194480895996,4.163131237030029,12.436422348022461,4.053674697875977)
                curveTo(12.700650215148926,3.944218158721924,13.004796981811523,4.004735469818115,13.206999778747559,4.206999778747559)
                lineTo(20.14699935913086,11.14699935913086)
                curveTo(20.373369216918945,11.373357772827148,20.50054359436035,11.68037223815918,20.50054359436035,12.000499725341797)
                curveTo(20.50054359436035,12.320626258850098,20.373369216918945,12.627640724182129,20.14699935913086,12.853999137878418)
                close()
            }
}

public val LucideIcons.All.ArrowBigRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigRight: ImageVector
    @Composable get() = ArrowBigRightDefinition.asImageVector()
