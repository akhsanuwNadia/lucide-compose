package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareFunction") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                curveTo(11.0f,17.0f,11.8f,16.0f,11.8f,14.2f)
                lineTo(11.8f,10.0f)
                curveTo(11.8f,8.0f,12.8f,6.7f,15.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.2f)
                lineTo(14.7f,11.2f)
            }
}

public val LucideIcons.All.SquareFunctionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareFunction: ImageVector
    @Composable get() = SquareFunctionDefinition.asImageVector()
