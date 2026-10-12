package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vibrate") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(4.0,10.0)
                lineTo(2.0,12.0)
                lineTo(4.0,14.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.0)
                lineTo(20.0,10.0)
                lineTo(22.0,12.0)
                lineTo(20.0,14.0)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                lineTo(15.0,5.0)
                lineTo(16.0,5.0)
                lineTo(16.0,19.0)
                lineTo(15.0,19.0)
                lineTo(9.0,19.0)
                lineTo(8.0,19.0)
                lineTo(8.0,5.0)
                lineTo(9.0,5.0)
                close()
            }
}

public val LucideIcons.All.VibrateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vibrate: ImageVector
    @Composable get() = VibrateDefinition.asImageVector()
