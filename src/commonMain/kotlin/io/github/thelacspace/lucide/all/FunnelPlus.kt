package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FunnelPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.354000091552734,3.0)
                lineTo(3.0,3.0)
                curveTo(2.6049017906188965,3.0001425743103027,2.2469286918640137,3.2328999042510986,2.0865042209625244,3.5939629077911377)
                curveTo(1.9260797500610352,3.955026149749756,1.9932841062545776,4.376694679260254,2.257999897003174,4.670000076293945)
                lineTo(9.482999801635742,12.659000396728516)
                curveTo(9.815536499023438,13.026500701904297,9.999774932861328,13.504382133483887,10.0,14.0)
                lineTo(10.0,20.0)
                curveTo(9.999823570251465,20.379026412963867,10.213948249816895,20.725576400756836,10.552999496459961,20.895000457763672)
                lineTo(12.552999496459961,21.895000457763672)
                curveTo(12.86306095123291,22.049938201904297,13.231244087219238,22.03326416015625,13.526030540466309,21.850933074951172)
                curveTo(13.820817947387695,21.66860008239746,14.000162124633789,21.34661865234375,14.0,21.0)
                lineTo(14.0,14.0)
                curveTo(14.000225067138672,13.504382133483887,14.184463500976562,13.026500701904297,14.517000198364258,12.659000396728516)
                lineTo(15.735000610351562,11.31100082397461)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(22.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,3.0)
                lineTo(19.0,9.0)
            }
}

public val LucideIcons.All.FunnelPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FunnelPlus: ImageVector
    @Composable get() = FunnelPlusDefinition.asImageVector()
