package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,13.0f)
                lineTo(15.01f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,11.0f)
                lineTo(18.01f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,18.0f)
                lineTo(20.0f,18.0f)
                lineTo(4.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(2.0f,6.0f)
                lineTo(4.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.GamepadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad: ImageVector
    @Composable get() = GamepadDefinition.asImageVector()
