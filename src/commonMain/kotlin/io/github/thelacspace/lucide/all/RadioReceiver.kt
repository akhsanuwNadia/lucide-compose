package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioReceiver") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,16.0)
                lineTo(5.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(20.0,8.0)
                lineTo(22.0,8.0)
                lineTo(22.0,16.0)
                lineTo(20.0,16.0)
                lineTo(4.0,16.0)
                lineTo(2.0,16.0)
                lineTo(2.0,8.0)
                lineTo(4.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.010000228881836,12.0)
            }
}

public val LucideIcons.All.RadioReceiverDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioReceiver: ImageVector
    @Composable get() = RadioReceiverDefinition.asImageVector()
