package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CookingPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(20.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.859999656677246,6.78000020980835)
                lineTo(8.40999984741211,4.970000267028809)
                curveTo(8.279787063598633,4.455467700958252,8.359435081481934,3.9102771282196045,8.631401062011719,3.4544990062713623)
                curveTo(8.903367042541504,2.99872088432312,9.345346450805664,2.669736623764038,9.859999656677246,2.5400002002716064)
                lineTo(11.799999237060547,2.06000018119812)
                curveTo(12.315912246704102,1.9301027059555054,12.862318992614746,2.011111259460449,13.318351745605469,2.2851061820983887)
                curveTo(13.774384498596191,2.559101104736328,14.102457046508789,3.00350022315979,14.229999542236328,3.5200002193450928)
                lineTo(14.679999351501465,5.320000171661377)
            }
}

public val LucideIcons.All.CookingPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CookingPot: ImageVector
    @Composable get() = CookingPotDefinition.asImageVector()
