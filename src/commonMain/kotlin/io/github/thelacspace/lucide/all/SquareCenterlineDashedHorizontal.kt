package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCenterlineDashedHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.1f,3.9f,21.0f,5.0f,21.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
}

public val LucideIcons.All.SquareCenterlineDashedHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCenterlineDashedHorizontal: ImageVector
    @Composable get() = SquareCenterlineDashedHorizontalDefinition.asImageVector()
