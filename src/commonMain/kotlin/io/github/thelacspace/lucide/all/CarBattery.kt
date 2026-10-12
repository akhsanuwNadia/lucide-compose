package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarBattery") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 15f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 5f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.CarBatteryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarBattery: ImageVector
    @Composable get() = CarBatteryDefinition.asImageVector()
