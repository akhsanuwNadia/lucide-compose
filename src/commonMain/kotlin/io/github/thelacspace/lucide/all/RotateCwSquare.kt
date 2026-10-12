package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,5.0f)
                lineTo(6.0f,5.0f)
                curveTo(4.8954306f,5.0f,4.0f,5.8954306f,4.0f,7.0f)
                lineTo(4.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,8.0f)
                lineTo(12.0f,5.0f)
                lineTo(9.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(4.0f,18.0f)
                curveTo(4.0f,19.10457f,4.8954306f,20.0f,6.0f,20.0f)
                lineTo(18.0f,20.0f)
                curveTo(19.10457f,20.0f,20.0f,19.10457f,20.0f,18.0f)
                lineTo(20.0f,7.0f)
                curveTo(20.0f,5.8954306f,19.10457f,5.0f,18.0f,5.0f)
                lineTo(16.0f,5.0f)
            }
}

public val LucideIcons.All.RotateCwSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwSquare: ImageVector
    @Composable get() = RotateCwSquareDefinition.asImageVector()
