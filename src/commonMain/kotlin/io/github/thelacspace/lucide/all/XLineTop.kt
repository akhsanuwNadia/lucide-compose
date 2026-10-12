package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("XLineTop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,4.0f)
                lineTo(6.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(6.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,20.0f)
            }
}

public val LucideIcons.All.XLineTopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.XLineTop: ImageVector
    @Composable get() = XLineTopDefinition.asImageVector()
