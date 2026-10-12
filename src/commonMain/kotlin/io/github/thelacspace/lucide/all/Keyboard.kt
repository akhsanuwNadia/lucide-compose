package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Keyboard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(10.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(14.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(16.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(6.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.0)
                lineTo(17.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
}

public val LucideIcons.All.KeyboardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Keyboard: ImageVector
    @Composable get() = KeyboardDefinition.asImageVector()
