package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Goal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,2.0)
                lineTo(20.0,6.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.56100082397461,10.222000122070312)
                curveTo(22.042654037475586,14.78860092163086,19.679014205932617,19.71422004699707,15.18960952758789,21.415510177612305)
                curveTo(10.70020580291748,23.116802215576172,5.6657938957214355,20.994726181030273,3.7488644123077393,16.593076705932617)
                curveTo(1.8319350481033325,12.191427230834961,3.7074553966522217,7.060060024261475,8.011000633239746,4.932000160217285)
            }
            lucidePath(strokeWidth) {
                moveTo(8.001999855041504,9.996999740600586)
                curveTo(6.621566295623779,11.8345365524292,6.671581745147705,14.37646770477295,8.12322998046875,16.158279418945312)
                curveTo(9.574878692626953,17.940092086791992,12.054243087768555,18.502824783325195,14.132857322692871,17.522262573242188)
                curveTo(16.211471557617188,16.541702270507812,17.353923797607422,14.270421028137207,16.902000427246094,12.017000198364258)
            }
}

public val LucideIcons.All.GoalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Goal: ImageVector
    @Composable get() = GoalDefinition.asImageVector()
