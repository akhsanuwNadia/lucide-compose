package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Signal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(2.009999990463257,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(7.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.0)
                lineTo(17.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,4.0)
                lineTo(22.0,20.0)
            }
}

public val LucideIcons.All.SignalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Signal: ImageVector
    @Composable get() = SignalDefinition.asImageVector()
