package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("List") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.009999990463257,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(3.009999990463257,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(3.009999990463257,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                lineTo(21.0,19.0)
            }
}

public val LucideIcons.All.ListDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.List: ImageVector
    @Composable get() = ListDefinition.asImageVector()
