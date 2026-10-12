package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UnfoldHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,15.0f)
                lineTo(22.0f,12.0f)
                lineTo(19.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(2.0f,12.0f)
                lineTo(5.0f,15.0f)
            }
}

public val LucideIcons.All.UnfoldHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UnfoldHorizontal: ImageVector
    @Composable get() = UnfoldHorizontalDefinition.asImageVector()
