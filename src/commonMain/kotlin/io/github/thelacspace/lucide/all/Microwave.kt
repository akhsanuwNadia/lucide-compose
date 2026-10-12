package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microwave") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,19.0)
                lineTo(20.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,8.0)
                lineTo(13.0,8.0)
                lineTo(14.0,8.0)
                lineTo(14.0,15.0)
                lineTo(13.0,15.0)
                lineTo(7.0,15.0)
                lineTo(6.0,15.0)
                lineTo(6.0,8.0)
                lineTo(7.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,19.0)
                lineTo(18.0,21.0)
            }
}

public val LucideIcons.All.MicrowaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microwave: ImageVector
    @Composable get() = MicrowaveDefinition.asImageVector()
