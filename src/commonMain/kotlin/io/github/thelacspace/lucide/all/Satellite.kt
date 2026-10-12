package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Satellite") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f,6.5f)
                lineTo(10.352f,3.352f)
                curveTo(9.8814335f,2.8815033f,9.118567f,2.8815033f,8.648001f,3.352f)
                lineTo(6.352f,5.648f)
                curveTo(5.8815036f,6.118567f,5.8815036f,6.8814325f,6.352f,7.3519998f)
                lineTo(9.5f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,7.5f)
                lineTo(19.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,10.5f)
                lineTo(20.648f,13.648f)
                curveTo(21.118498f,14.1185665f,21.118498f,14.881433f,20.648f,15.351999f)
                lineTo(18.352001f,17.647999f)
                curveTo(17.881433f,18.118496f,17.118568f,18.118496f,16.648f,17.647999f)
                lineTo(13.5f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                curveTo(9.0f,17.68629f,6.3137083f,15.0f,3.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.352f,10.648f)
                curveTo(8.881504f,11.1185665f,8.881504f,11.881433f,9.352f,12.351999f)
                lineTo(11.648001f,14.647999f)
                curveTo(12.118568f,15.118496f,12.8814335f,15.118496f,13.352001f,14.647999f)
                lineTo(17.648f,10.351999f)
                curveTo(18.118498f,9.881432f,18.118498f,9.1185665f,17.648f,8.647999f)
                lineTo(15.352001f,6.351999f)
                curveTo(14.8814335f,5.8815017f,14.118568f,5.8815017f,13.648001f,6.351999f)
                close()
            }
}

public val LucideIcons.All.SatelliteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Satellite: ImageVector
    @Composable get() = SatelliteDefinition.asImageVector()
