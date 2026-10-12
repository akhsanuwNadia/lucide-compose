package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotebookDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,11.75f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,11.75f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(11.65f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                curveTo(14.995193f,6.0749927f,15.565935f,7.0703907f,16.496113f,7.6092796f)
                curveTo(17.426292f,8.148169f,18.573708f,8.148169f,19.503887f,7.6092796f)
                curveTo(20.434065f,7.0703907f,21.004808f,6.0749927f,21.0f,5.0f)
                curveTo(21.004808f,3.925007f,20.434065f,2.9296093f,19.503887f,2.3907204f)
                curveTo(18.573708f,1.8518313f,17.426292f,1.8518313f,16.496113f,2.3907204f)
                curveTo(15.565935f,2.9296093f,14.995193f,3.925007f,15.0f,5.0f)
            }
}

public val LucideIcons.All.NotebookDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotebookDot: ImageVector
    @Composable get() = NotebookDotDefinition.asImageVector()
