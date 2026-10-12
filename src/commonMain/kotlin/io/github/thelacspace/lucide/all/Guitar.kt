package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Guitar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.9f,12.1f)
                lineTo(16.414f,7.5860004f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.1f,2.3f)
                curveTo(19.711157f,1.9188573f,19.088844f,1.9188573f,18.7f,2.3f)
                lineTo(17.586f,3.414f)
                curveTo(17.210901f,3.7889855f,17.000113f,4.2976103f,17.0f,4.828f)
                lineTo(17.0f,6.172f)
                curveTo(16.999887f,6.7023897f,16.789099f,7.2110147f,16.414f,7.586f)
                curveTo(16.788984f,7.2109013f,17.29761f,7.0001135f,17.828f,7.0f)
                lineTo(19.171999f,7.0f)
                curveTo(19.702389f,6.9998865f,20.211014f,6.7890987f,20.585999f,6.414f)
                lineTo(21.7f,5.3f)
                curveTo(22.081144f,4.9111567f,22.081144f,4.2888436f,21.7f,3.9f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                lineTo(8.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.23f,9.85f)
                curveTo(8.69472f,8.730292f,9.7876835f,8.000336f,11.0f,8.0f)
                curveTo(13.761424f,8.0f,16.0f,10.238576f,16.0f,13.0f)
                curveTo(15.999664f,14.2123165f,15.269708f,15.30528f,14.15f,15.77f)
                lineTo(13.23f,16.15f)
                curveTo(12.483714f,16.461315f,11.998316f,17.191385f,12.0f,18.0f)
                curveTo(12.0f,20.209139f,10.209139f,22.0f,8.0f,22.0f)
                curveTo(4.6862917f,22.0f,2.0f,19.31371f,2.0f,16.0f)
                curveTo(2.0f,13.790861f,3.790861f,12.0f,6.0f,12.0f)
                curveTo(6.8086143f,12.001684f,7.5386844f,11.516286f,7.85f,10.77f)
                close()
            }
}

public val LucideIcons.All.GuitarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Guitar: ImageVector
    @Composable get() = GuitarDefinition.asImageVector()
