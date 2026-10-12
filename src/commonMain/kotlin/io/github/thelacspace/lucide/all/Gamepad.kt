package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                lineTo(15.010000228881836,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                lineTo(18.010000228881836,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,18.0)
                lineTo(20.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.GamepadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad: ImageVector
    @Composable get() = GamepadDefinition.asImageVector()
