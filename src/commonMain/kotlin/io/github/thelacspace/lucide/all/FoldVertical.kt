package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FoldVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,19.0)
                lineTo(12.0,16.0)
                lineTo(9.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(12.0,8.0)
                lineTo(9.0,5.0)
            }
}

public val LucideIcons.All.FoldVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FoldVertical: ImageVector
    @Composable get() = FoldVerticalDefinition.asImageVector()
