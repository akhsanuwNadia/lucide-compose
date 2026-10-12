package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarBattery") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(18.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,15.0)
                lineTo(16.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(10.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,5.0)
                lineTo(6.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(20.0,7.0)
                lineTo(22.0,7.0)
                lineTo(22.0,19.0)
                lineTo(20.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,7.0)
                lineTo(4.0,7.0)
                close()
            }
}

public val LucideIcons.All.CarBatteryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarBattery: ImageVector
    @Composable get() = CarBatteryDefinition.asImageVector()
