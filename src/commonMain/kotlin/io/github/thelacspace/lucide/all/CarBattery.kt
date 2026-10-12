package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarBattery") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(18.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,15.0f)
                lineTo(16.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                lineTo(18.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(10.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,5.0f)
                lineTo(6.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(22.0f,7.0f)
                lineTo(22.0f,19.0f)
                lineTo(20.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,7.0f)
                lineTo(4.0f,7.0f)
                close()
            }
}

public val LucideIcons.All.CarBatteryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarBattery: ImageVector
    @Composable get() = CarBatteryDefinition.asImageVector()
