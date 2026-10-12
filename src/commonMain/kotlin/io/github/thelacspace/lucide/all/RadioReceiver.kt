package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RadioReceiver") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,16.0f)
                lineTo(5.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,16.0f)
                lineTo(19.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(22.0f,8.0f)
                lineTo(22.0f,16.0f)
                lineTo(20.0f,16.0f)
                lineTo(4.0f,16.0f)
                lineTo(2.0f,16.0f)
                lineTo(2.0f,8.0f)
                lineTo(4.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.01f,12.0f)
            }
}

public val LucideIcons.All.RadioReceiverDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RadioReceiver: ImageVector
    @Composable get() = RadioReceiverDefinition.asImageVector()
