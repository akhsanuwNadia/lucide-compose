package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UnfoldHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,15.0)
                lineTo(22.0,12.0)
                lineTo(19.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,9.0)
                lineTo(2.0,12.0)
                lineTo(5.0,15.0)
            }
}

public val LucideIcons.All.UnfoldHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UnfoldHorizontal: ImageVector
    @Composable get() = UnfoldHorizontalDefinition.asImageVector()
