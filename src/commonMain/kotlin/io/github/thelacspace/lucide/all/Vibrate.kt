package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vibrate") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(4.0f,10.0f)
                lineTo(2.0f,12.0f)
                lineTo(4.0f,14.0f)
                lineTo(2.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                lineTo(20.0f,10.0f)
                lineTo(22.0f,12.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                lineTo(15.0f,5.0f)
                lineTo(16.0f,5.0f)
                lineTo(16.0f,19.0f)
                lineTo(15.0f,19.0f)
                lineTo(9.0f,19.0f)
                lineTo(8.0f,19.0f)
                lineTo(8.0f,5.0f)
                lineTo(9.0f,5.0f)
                close()
            }
}

public val LucideIcons.All.VibrateDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vibrate: ImageVector
    @Composable get() = VibrateDefinition.asImageVector()
