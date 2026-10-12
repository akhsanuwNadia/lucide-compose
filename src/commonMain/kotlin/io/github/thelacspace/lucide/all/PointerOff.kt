package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PointerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,4.5f)
                lineTo(10.0f,4.0f)
                curveTo(9.999843f,3.3977294f,9.728286f,2.8275974f,9.260749f,2.4479413f)
                curveTo(8.793211f,2.0682855f,8.17948f,1.9195346f,7.59f,2.043f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f,8.4f)
                curveTo(13.710034f,7.7924047f,13.242163f,7.311537f,12.639999f,7.1049995f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.7f,16.2f)
                curveTo(21.901775f,15.484177f,22.002748f,14.743713f,22.0f,14.0f)
                lineTo(22.0f,11.0f)
                curveTo(22.003204f,10.283339f,21.62271f,9.61974f,21.00259f,9.26048f)
                curveTo(20.382473f,8.901221f,19.617527f,8.901221f,18.99741f,9.26048f)
                curveTo(18.37729f,9.61974f,17.996796f,10.283339f,18.0f,11.0f)
                lineTo(18.0f,10.0f)
                curveTo(17.9996f,9.129938f,17.436745f,8.359954f,16.607838f,8.095526f)
                curveTo(15.778931f,7.8310976f,14.8741665f,8.132899f,14.37f,8.842f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(5.2f,13.2f)
                curveTo(4.401206f,12.491795f,3.1870177f,12.535785f,2.4415674f,13.299937f)
                curveTo(1.696117f,14.064091f,1.6822219f,15.278996f,2.4099998f,16.06f)
                lineTo(6.0f,19.7f)
                curveTo(7.572237f,21.299866f,9.7612095f,22.138971f,12.0f,22.0f)
                lineTo(14.0f,22.0f)
                curveTo(16.121761f,22.000076f,18.156649f,21.157272f,19.657f,19.657f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.PointerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PointerOff: ImageVector
    @Composable get() = PointerOffDefinition.asImageVector()
