package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BatteryPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.543000221252441,6.0)
                lineTo(16.0,6.0)
                curveTo(17.104570388793945,6.0,18.0,6.895430564880371,18.0,8.0)
                lineTo(18.0,16.0)
                curveTo(18.0,17.104570388793945,17.104570388793945,18.0,16.0,18.0)
                lineTo(12.395000457763672,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                lineTo(22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                lineTo(13.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.605999946594238,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(7.605999946594238,6.0)
            }
}

public val LucideIcons.All.BatteryPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BatteryPlus: ImageVector
    @Composable get() = BatteryPlusDefinition.asImageVector()
