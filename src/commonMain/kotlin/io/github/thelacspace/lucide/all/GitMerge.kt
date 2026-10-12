package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitMerge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                curveTo(2.9951925f,7.0749927f,3.5659356f,8.070391f,4.496114f,8.60928f)
                curveTo(5.426292f,9.148169f,6.573708f,9.148169f,7.503886f,8.60928f)
                curveTo(8.434065f,8.070391f,9.004807f,7.0749927f,9.0f,6.0f)
                curveTo(9.004807f,4.9250073f,8.434065f,3.9296093f,7.503886f,3.3907204f)
                curveTo(6.573708f,2.8518312f,5.426292f,2.8518312f,4.496114f,3.3907204f)
                curveTo(3.5659356f,3.9296093f,2.9951925f,4.9250073f,3.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(6.0f,9.0f)
                curveTo(6.0f,13.970563f,10.029437f,18.0f,15.0f,18.0f)
            }
}

public val LucideIcons.All.GitMergeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitMerge: ImageVector
    @Composable get() = GitMergeDefinition.asImageVector()
