package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamBowl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                curveTo(17.0,17.0,20.0,14.309999465942383,20.0,11.0)
                lineTo(4.0,11.0)
                curveTo(4.0,14.309999465942383,7.0,17.0,12.0,17.0)
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
                moveTo(12.0,18.0)
                lineTo(12.0,21.0)
                moveTo(5.139999866485596,11.0)
                curveTo(4.714271545410156,9.567357063293457,5.245218753814697,8.022454261779785,6.4617109298706055,7.154204845428467)
                curveTo(7.678203105926514,6.285955429077148,9.311797142028809,6.285955429077148,10.528288841247559,7.154204845428467)
                curveTo(11.744781494140625,8.022454261779785,12.275729179382324,9.567357063293457,11.850000381469727,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.140000343322754,11.0)
                curveTo(11.714271545410156,9.567357063293457,12.245219230651855,8.022454261779785,13.461710929870605,7.154204368591309)
                curveTo(14.678203582763672,6.285954475402832,16.311798095703125,6.285954475402832,17.528289794921875,7.154204368591309)
                curveTo(18.744781494140625,8.022454261779785,19.27573013305664,9.567357063293457,18.850000381469727,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,6.5)
                curveTo(15.505608558654785,5.2458415031433105,14.839741706848145,4.0845441818237305,13.754533767700195,3.4558403491973877)
                curveTo(12.669325828552246,2.827136516571045,11.330674171447754,2.827136516571045,10.245466232299805,3.4558403491973877)
                curveTo(9.160258293151855,4.0845441818237305,8.494391441345215,5.2458415031433105,8.5,6.5)
            }
}

public val LucideIcons.All.IceCreamBowlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamBowl: ImageVector
    @Composable get() = IceCreamBowlDefinition.asImageVector()
