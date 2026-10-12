package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryLow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(16.0,6.0)
                lineTo(18.0,6.0)
                lineTo(18.0,18.0)
                lineTo(16.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.BatteryLowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryLow: ImageVector
    @Composable get() = BatteryLowDefinition.asImageVector()
