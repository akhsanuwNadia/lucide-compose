package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                curveTo(14.447715f,8.0f,14.0f,7.5522847f,14.0f,7.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(19.292f,6.2939997f)
                curveTo(19.74614f,6.745444f,20.00104f,7.3596535f,20.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(13.818f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.305f,19.53f)
                lineTo(4.228f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.592f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.228f,16.852f)
                lineTo(3.3040001f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.852f,15.228f)
                lineTo(5.4690003f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.852f,20.772f)
                lineTo(5.4690003f,21.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.148f,15.228f)
                lineTo(8.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.53f,21.696f)
                lineTo(8.148f,20.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.773f,16.852f)
                lineTo(10.695f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.773f,19.148f)
                lineTo(10.695f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                curveTo(3.9951925f,19.074993f,4.5659356f,20.07039f,5.496114f,20.60928f)
                curveTo(6.426292f,21.148169f,7.573708f,21.148169f,8.503886f,20.60928f)
                curveTo(9.434065f,20.07039f,10.004807f,19.074993f,10.0f,18.0f)
                curveTo(10.004807f,16.925007f,9.434065f,15.929609f,8.503886f,15.39072f)
                curveTo(7.573708f,14.851831f,6.426292f,14.851831f,5.496114f,15.39072f)
                curveTo(4.5659356f,15.929609f,3.9951925f,16.925007f,4.0f,18.0f)
            }
}

public val LucideIcons.All.FileCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileCog: ImageVector
    @Composable get() = FileCogDefinition.asImageVector()
