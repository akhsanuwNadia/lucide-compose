package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(5.0f,6.0f)
                lineTo(8.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,18.0f)
                lineTo(7.0f,18.0f)
                curveTo(5.8954306f,18.0f,5.0f,17.10457f,5.0f,16.0f)
                lineTo(5.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,15.0f)
                lineTo(19.0f,18.0f)
                lineTo(16.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,6.0f)
                lineTo(17.0f,6.0f)
                curveTo(18.10457f,6.0f,19.0f,6.8954306f,19.0f,8.0f)
                lineTo(19.0f,18.0f)
            }
}

public val LucideIcons.All.Repeat2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat2: ImageVector
    @Composable get() = Repeat2Definition.asImageVector()
