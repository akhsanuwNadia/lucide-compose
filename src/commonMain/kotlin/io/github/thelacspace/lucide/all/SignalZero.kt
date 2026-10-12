package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SignalZero") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                lineTo(2.01f,20.0f)
            }
}

public val LucideIcons.All.SignalZeroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SignalZero: ImageVector
    @Composable get() = SignalZeroDefinition.asImageVector()
