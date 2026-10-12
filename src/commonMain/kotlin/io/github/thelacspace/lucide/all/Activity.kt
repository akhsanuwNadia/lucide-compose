package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Activity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(19.520000457763672,12.0)
                curveTo(18.62181282043457,11.998078346252441,17.832509994506836,12.595168113708496,17.59000015258789,13.460000038146973)
                lineTo(15.239999771118164,21.81999969482422)
                curveTo(15.208888053894043,21.926666259765625,15.11111068725586,21.999998092651367,15.0,21.999998092651367)
                curveTo(14.88888931274414,21.999998092651367,14.791111946105957,21.926666259765625,14.760000228881836,21.81999969482422)
                lineTo(9.239999771118164,2.180000066757202)
                curveTo(9.208888053894043,2.073333740234375,9.11111068725586,2.0000009536743164,9.0,2.0000009536743164)
                curveTo(8.88888931274414,2.0000009536743164,8.791111946105957,2.073333740234375,8.760000228881836,2.180000066757202)
                lineTo(6.410000324249268,10.539999961853027)
                curveTo(6.16849422454834,11.401261329650879,5.384476661682129,11.997440338134766,4.489999771118164,12.0)
                lineTo(2.0,12.0)
            }
}

public val LucideIcons.All.ActivityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Activity: ImageVector
    @Composable get() = ActivityDefinition.asImageVector()
