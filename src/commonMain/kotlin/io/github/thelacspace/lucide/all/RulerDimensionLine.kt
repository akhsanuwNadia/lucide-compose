package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RulerDimensionLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(2.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                lineTo(22.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                lineTo(6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
                close()
            }
}

public val LucideIcons.All.RulerDimensionLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RulerDimensionLine: ImageVector
    @Composable get() = RulerDimensionLineDefinition.asImageVector()
