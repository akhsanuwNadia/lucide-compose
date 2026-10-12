package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Expand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,16.0f)
                lineTo(21.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(21.0f,3.0f)
                lineTo(16.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(3.0f,21.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,21.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,8.0f)
                lineTo(3.0f,3.0f)
                lineTo(8.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,9.0f)
                lineTo(3.0f,3.0f)
            }
}

public val LucideIcons.All.ExpandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Expand: ImageVector
    @Composable get() = ExpandDefinition.asImageVector()
