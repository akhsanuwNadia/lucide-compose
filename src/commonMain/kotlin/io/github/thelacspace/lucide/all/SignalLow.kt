package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignalLow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,20.0)
                lineTo(2.009999990463257,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(7.0,16.0)
            }
}

public val LucideIcons.All.SignalLowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignalLow: ImageVector
    @Composable get() = SignalLowDefinition.asImageVector()
