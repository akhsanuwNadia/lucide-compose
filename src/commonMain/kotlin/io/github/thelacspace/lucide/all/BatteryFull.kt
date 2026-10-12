package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryFull") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(6.0,14.0)
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

public val LucideIcons.All.BatteryFullDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryFull: ImageVector
    @Composable get() = BatteryFullDefinition.asImageVector()
