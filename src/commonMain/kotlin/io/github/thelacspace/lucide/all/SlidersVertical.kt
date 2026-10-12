package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SlidersVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,21.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.0)
                lineTo(21.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(19.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,14.0)
                lineTo(7.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(5.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(5.0,14.0)
            }
}

public val LucideIcons.All.SlidersVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SlidersVertical: ImageVector
    @Composable get() = SlidersVerticalDefinition.asImageVector()
