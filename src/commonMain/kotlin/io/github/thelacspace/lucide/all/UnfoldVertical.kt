package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UnfoldVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                lineTo(12.0f,22.0f)
                lineTo(9.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(12.0f,2.0f)
                lineTo(9.0f,5.0f)
            }
}

public val LucideIcons.All.UnfoldVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UnfoldVertical: ImageVector
    @Composable get() = UnfoldVerticalDefinition.asImageVector()
