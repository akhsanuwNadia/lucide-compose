package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,10.0)
                lineTo(14.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,21.0)
                curveTo(8.43299674987793,21.0,10.0,19.43299674987793,10.0,17.5)
                curveTo(10.0,15.56700325012207,8.43299674987793,14.0,6.5,14.0)
                curveTo(4.56700325012207,14.0,3.0,15.56700325012207,3.0,17.5)
                curveTo(3.0001847743988037,18.165578842163086,2.7470507621765137,18.8062801361084,2.2920000553131104,19.29199981689453)
                curveTo(2.005246162414551,19.578027725219727,1.9193395376205444,20.008779525756836,2.0744311809539795,20.38292694091797)
                curveTo(2.229522943496704,20.7570743560791,2.594982147216797,21.00072479248047,3.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.968999862670898,17.0310001373291)
                lineTo(21.378000259399414,5.624000072479248)
                curveTo(22.200664520263672,4.7939453125,22.197669982910156,3.4550647735595703,21.371301651000977,2.628697395324707)
                curveTo(20.54493522644043,1.8023298978805542,19.2060546875,1.7993361949920654,18.375999450683594,2.621999979019165)
                lineTo(6.9670000076293945,14.031000137329102)
            }
}

public val LucideIcons.All.BrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brush: ImageVector
    @Composable get() = BrushDefinition.asImageVector()
