package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.3f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.98f,3.0f)
                curveTo(8.659667f,2.9933364f,9.296198f,3.332317f,9.67f,3.9f)
                lineTo(10.33f,5.1000004f)
                curveTo(10.699923f,5.6617208f,11.327414f,5.9998894f,12.0f,6.0f)
                lineTo(20.0f,6.0f)
                curveTo(21.10457f,6.0f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,11.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305f,19.53f)
                lineTo(15.228001f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,16.852f)
                lineTo(14.304999f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,15.228f)
                lineTo(16.469f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,20.772f)
                lineTo(16.469f,21.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,15.228f)
                lineTo(19.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,21.696f)
                lineTo(19.148f,20.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,16.852f)
                lineTo(21.696f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,19.148f)
                lineTo(21.696f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
}

public val LucideIcons.All.FolderCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderCog: ImageVector
    @Composable get() = FolderCogDefinition.asImageVector()
