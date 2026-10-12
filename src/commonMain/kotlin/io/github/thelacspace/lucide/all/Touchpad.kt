package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Touchpad") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(22.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,14.0)
            }
}

public val LucideIcons.All.TouchpadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Touchpad: ImageVector
    @Composable get() = TouchpadDefinition.asImageVector()
