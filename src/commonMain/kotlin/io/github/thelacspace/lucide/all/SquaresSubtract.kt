package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquaresSubtract") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,22.0f)
                curveTo(8.895431f,22.0f,8.0f,21.10457f,8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                lineTo(14.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                curveTo(16.0f,2.8954306f,15.104569f,2.0f,14.0f,2.0f)
                lineTo(4.0f,2.0f)
                curveTo(2.8954306f,2.0f,2.0f,2.8954306f,2.0f,4.0f)
                lineTo(2.0f,14.0f)
                curveTo(2.0f,15.104569f,2.8954306f,16.0f,4.0f,16.0f)
                lineTo(7.0f,16.0f)
                curveTo(7.5522847f,16.0f,8.0f,15.552285f,8.0f,15.0f)
                lineTo(8.0f,10.0f)
                curveTo(8.0f,8.895431f,8.895431f,8.0f,10.0f,8.0f)
                lineTo(15.0f,8.0f)
                curveTo(15.552285f,8.0f,16.0f,7.5522847f,16.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.0f)
                curveTo(21.10457f,8.0f,22.0f,8.895431f,22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,14.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,20.0f)
                curveTo(22.0f,21.10457f,21.10457f,22.0f,20.0f,22.0f)
            }
}

public val LucideIcons.All.SquaresSubtractDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquaresSubtract: ImageVector
    @Composable get() = SquaresSubtractDefinition.asImageVector()
