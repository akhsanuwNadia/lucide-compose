package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RemoveFormatting") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(20.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                lineTo(11.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,4.0)
                lineTo(8.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(15.0,20.0)
            }
}

public val LucideIcons.All.RemoveFormattingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RemoveFormatting: ImageVector
    @Composable get() = RemoveFormattingDefinition.asImageVector()
