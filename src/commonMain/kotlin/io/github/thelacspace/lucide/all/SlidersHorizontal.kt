package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SlidersHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                lineTo(14.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,19.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(14.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(3.0,12.0)
            }
}

public val LucideIcons.All.SlidersHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SlidersHorizontal: ImageVector
    @Composable get() = SlidersHorizontalDefinition.asImageVector()
