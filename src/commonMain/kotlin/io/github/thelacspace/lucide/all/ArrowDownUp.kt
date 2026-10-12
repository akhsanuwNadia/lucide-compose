package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDownUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(7.0f,20.0f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(7.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(17.0f,4.0f)
                lineTo(13.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,4.0f)
                lineTo(17.0f,20.0f)
            }
}

public val LucideIcons.All.ArrowDownUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDownUp: ImageVector
    @Composable get() = ArrowDownUpDefinition.asImageVector()
