package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryWarning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,17.0)
                lineTo(10.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,7.0)
                lineTo(10.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(16.0,6.0)
                curveTo(17.104570388793945,6.0,18.0,6.895430564880371,18.0,8.0)
                lineTo(18.0,16.0)
                curveTo(18.0,17.104570388793945,17.104570388793945,18.0,16.0,18.0)
                lineTo(14.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(6.0,6.0)
            }
}

public val LucideIcons.All.BatteryWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryWarning: ImageVector
    @Composable get() = BatteryWarningDefinition.asImageVector()
