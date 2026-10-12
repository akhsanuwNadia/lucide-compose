package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampCeiling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.829000473022461,15.998000144958496)
                curveTo(15.267690658569336,17.241069793701172,14.843535423278809,18.624868392944336,13.78360366821289,19.408588409423828)
                curveTo(12.723672866821289,20.19230842590332,11.276328086853027,20.19230842590332,10.216397285461426,19.408588409423828)
                curveTo(9.156465530395508,18.624868392944336,8.73231029510498,17.241069793701172,9.171000480651855,15.998000144958496)
            }
            lucidePath(strokeWidth) {
                moveTo(20.920000076293945,14.605999946594238)
                curveTo(21.052509307861328,14.915111541748047,21.020761489868164,15.270129203796387,20.83551025390625,15.550826072692871)
                curveTo(20.650259017944336,15.831522941589355,20.33631706237793,16.00029945373535,20.0,16.0)
                lineTo(4.0,16.0)
                curveTo(3.6636836528778076,16.00029945373535,3.3497414588928223,15.831522941589355,3.16448974609375,15.550826072692871)
                curveTo(2.9792380332946777,15.270129203796387,2.94749116897583,14.915111541748047,3.0799999237060547,14.605999946594238)
                lineTo(6.079999923706055,7.605999946594238)
                curveTo(6.237725734710693,7.238061904907227,6.599680423736572,6.999643802642822,7.0,7.0)
                lineTo(17.0,7.0)
                curveTo(17.400320053100586,6.999643802642822,17.76227378845215,7.238061904907227,17.920000076293945,7.605999946594238)
                close()
            }
}

public val LucideIcons.All.LampCeilingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampCeiling: ImageVector
    @Composable get() = LampCeilingDefinition.asImageVector()
