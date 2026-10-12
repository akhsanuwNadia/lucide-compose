package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RemoveFormatting") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                lineTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(20.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,20.0f)
                lineTo(11.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,4.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,15.0f)
                lineTo(15.0f,20.0f)
            }
}

public val LucideIcons.All.RemoveFormattingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RemoveFormatting: ImageVector
    @Composable get() = RemoveFormattingDefinition.asImageVector()
