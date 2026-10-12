package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SlidersHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,3.0f)
                lineTo(14.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,19.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(14.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,10.0f)
                lineTo(8.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
}

public val LucideIcons.All.SlidersHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SlidersHorizontal: ImageVector
    @Composable get() = SlidersHorizontalDefinition.asImageVector()
