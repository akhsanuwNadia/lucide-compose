package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyboardOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,4.0)
                curveTo(21.104570388793945,4.0,22.0,4.895430564880371,22.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(22.0,16.40999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.6899995803833,4.0)
                lineTo(20.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,6.0)
                curveTo(2.0,4.895430564880371,2.895430564880371,4.0,4.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(6.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.010000228881836,12.0)
            }
}

public val LucideIcons.All.KeyboardOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyboardOff: ImageVector
    @Composable get() = KeyboardOffDefinition.asImageVector()
