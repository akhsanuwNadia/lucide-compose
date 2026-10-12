package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Asterisk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(12.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.065f,8.496f)
                lineTo(5.9400005f,15.496f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.94f,8.504f)
                lineTo(18.065f,15.504f)
            }
}

public val LucideIcons.All.AsteriskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Asterisk: ImageVector
    @Composable get() = AsteriskDefinition.asImageVector()
