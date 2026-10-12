package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitMergeConflict") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(16.0f,6.0f)
                curveTo(17.10457f,6.0f,18.0f,6.8954306f,18.0f,8.0f)
                lineTo(18.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,3.5f)
                lineTo(3.5f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,8.5f)
                lineTo(3.5f,3.5f)
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

public val LucideIcons.All.GitMergeConflictDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitMergeConflict: ImageVector
    @Composable get() = GitMergeConflictDefinition.asImageVector()
