package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigRightDash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,9.0)
                curveTo(11.552285194396973,9.0,12.0,8.552285194396973,12.0,8.0)
                lineTo(12.0,4.706999778747559)
                curveTo(11.99993896484375,4.4209980964660645,12.172194480895996,4.163131237030029,12.436422348022461,4.053674697875977)
                curveTo(12.700650215148926,3.944218158721924,13.004796981811523,4.004735469818115,13.206999778747559,4.206999778747559)
                lineTo(20.14699935913086,11.14699935913086)
                curveTo(20.373369216918945,11.373357772827148,20.50054359436035,11.68037223815918,20.50054359436035,12.000499725341797)
                curveTo(20.50054359436035,12.320626258850098,20.373369216918945,12.627640724182129,20.14699935913086,12.853999137878418)
                lineTo(13.206998825073242,19.79399871826172)
                curveTo(13.004796028137207,19.99626350402832,12.70064926147461,20.056779861450195,12.436421394348145,19.947324752807617)
                curveTo(12.17219352722168,19.837867736816406,11.999938011169434,19.579999923706055,11.999999046325684,19.29399871826172)
                lineTo(11.999999046325684,16.0)
                curveTo(11.999999046325684,15.447714805603027,11.552284240722656,15.0,10.999999046325684,15.0)
                lineTo(9.0,15.0)
                curveTo(8.447714805603027,15.0,8.0,14.552285194396973,8.0,14.0)
                lineTo(8.0,10.0)
                curveTo(8.0,9.447714805603027,8.447714805603027,9.0,9.0,9.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,9.0)
                lineTo(4.0,15.0)
            }
}

public val LucideIcons.All.ArrowBigRightDashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigRightDash: ImageVector
    @Composable get() = ArrowBigRightDashDefinition.asImageVector()
