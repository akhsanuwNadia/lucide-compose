package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,15.0)
                lineTo(11.5,20.5)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.515999794006348,16.06999969482422)
                curveTo(2.787675619125366,14.50338363647461,1.4397008419036865,11.309032440185547,2.2208914756774902,8.261446952819824)
                curveTo(3.002082109451294,5.213860988616943,5.720494747161865,3.0618510246276855,8.866019248962402,3.0008842945098877)
                curveTo(12.011543273925781,2.93991756439209,14.81130313873291,4.984973907470703,15.710000038146973,8.0)
                lineTo(17.5,8.0)
                curveTo(19.23347282409668,8.000059127807617,20.812788009643555,8.995809555053711,21.560144424438477,10.559901237487793)
                curveTo(22.3075008392334,12.123992919921875,22.09000587463379,13.978299140930176,21.000999450683594,15.32699966430664)
            }
}

public val LucideIcons.All.CloudCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudCheck: ImageVector
    @Composable get() = CloudCheckDefinition.asImageVector()
