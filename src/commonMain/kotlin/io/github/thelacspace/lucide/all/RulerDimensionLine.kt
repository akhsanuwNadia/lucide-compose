package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RulerDimensionLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,15.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(2.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(2.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,8.0)
                lineTo(22.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                lineTo(6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(20.0,12.0)
                lineTo(22.0,12.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,12.0)
                lineTo(4.0,12.0)
                close()
            }
}

public val LucideIcons.All.RulerDimensionLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RulerDimensionLine: ImageVector
    @Composable get() = RulerDimensionLineDefinition.asImageVector()
