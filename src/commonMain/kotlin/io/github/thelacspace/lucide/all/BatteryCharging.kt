package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryCharging") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                lineTo(8.0f,12.0f)
                lineTo(12.0f,12.0f)
                lineTo(9.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.856f,6.0f)
                lineTo(16.0f,6.0f)
                curveTo(17.10457f,6.0f,18.0f,6.8954306f,18.0f,8.0f)
                lineTo(18.0f,16.0f)
                curveTo(18.0f,17.10457f,17.10457f,18.0f,16.0f,18.0f)
                lineTo(13.065001f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,14.0f)
                lineTo(22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.14f,18.0f)
                lineTo(4.0f,18.0f)
                curveTo(2.8954306f,18.0f,2.0f,17.10457f,2.0f,16.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                lineTo(6.936f,6.0f)
            }
}

public val LucideIcons.All.BatteryChargingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryCharging: ImageVector
    @Composable get() = BatteryChargingDefinition.asImageVector()
