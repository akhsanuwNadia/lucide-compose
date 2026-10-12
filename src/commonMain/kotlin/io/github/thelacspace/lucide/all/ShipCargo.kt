package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipCargo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,12.0f)
                lineTo(16.5f,9.0f)
                curveTo(16.5f,8.447715f,16.947716f,8.0f,17.5f,8.0f)
                lineTo(18.5f,8.0f)
                curveTo(19.052284f,8.0f,19.5f,7.5522847f,19.5f,7.0f)
                lineTo(19.5f,5.0f)
                curveTo(19.5f,4.4477153f,19.052284f,4.0f,18.5f,4.0f)
                lineTo(5.5f,4.0f)
                curveTo(4.9477153f,4.0f,4.5f,4.4477153f,4.5f,5.0f)
                lineTo(4.5f,7.0f)
                curveTo(4.5f,7.5522847f,4.9477153f,8.0f,5.5f,8.0f)
                lineTo(6.5f,8.0f)
                curveTo(7.0522847f,8.0f,7.5f,8.447715f,7.5f,9.0f)
                lineTo(7.5f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f,19.0f)
                curveTo(20.456f,17.185f,21.015999f,14.110001f,21.008f,12.992001f)
                curveTo(21.003605f,12.4428425f,20.557175f,11.999984f,20.008f,12.000001f)
                lineTo(3.984f,12.000001f)
                curveTo(3.4379036f,11.999931f,2.9927373f,12.437975f,2.984f,12.984001f)
                curveTo(2.954f,14.844001f,3.954f,18.605001f,5.81f,20.760002f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                curveTo(2.6f,20.5f,3.2f,21.0f,4.5f,21.0f)
                curveTo(7.0f,21.0f,7.0f,19.0f,9.5f,19.0f)
                curveTo(10.8f,19.0f,11.4f,19.5f,12.0f,20.0f)
                curveTo(12.6f,20.5f,13.2f,21.0f,14.5f,21.0f)
                curveTo(17.0f,21.0f,17.0f,19.0f,19.5f,19.0f)
                curveTo(20.8f,19.0f,21.4f,19.5f,22.0f,20.0f)
            }
}

public val LucideIcons.All.ShipCargoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipCargo: ImageVector
    @Composable get() = ShipCargoDefinition.asImageVector()
