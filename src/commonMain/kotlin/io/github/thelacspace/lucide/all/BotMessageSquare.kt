package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotMessageSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(8.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,11.0f)
                lineTo(15.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(4.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,16.0f)
                curveTo(20.0f,17.10457f,19.10457f,18.0f,18.0f,18.0f)
                lineTo(8.828f,18.0f)
                curveTo(8.29761f,18.000113f,7.7889853f,18.210901f,7.414f,18.586f)
                lineTo(5.212f,20.788f)
                curveTo(5.0089426f,20.99102f,4.7035913f,21.051746f,4.438307f,20.941868f)
                curveTo(4.1730223f,20.83199f,4.0000367f,20.57314f,4.0f,20.286f)
                lineTo(4.0f,8.0f)
                curveTo(4.0f,6.8954306f,4.8954306f,6.0f,6.0f,6.0f)
                lineTo(18.0f,6.0f)
                curveTo(19.10457f,6.0f,20.0f,6.8954306f,20.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(9.0f,13.0f)
            }
}

public val LucideIcons.All.BotMessageSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotMessageSquare: ImageVector
    @Composable get() = BotMessageSquareDefinition.asImageVector()
