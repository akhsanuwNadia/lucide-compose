package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitPullRequestArrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                curveTo(1.9951925f,7.0749927f,2.5659356f,8.070391f,3.4961138f,8.60928f)
                curveTo(4.426292f,9.148169f,5.573708f,9.148169f,6.503886f,8.60928f)
                curveTo(7.4340644f,8.070391f,8.004807f,7.0749927f,8.0f,6.0f)
                curveTo(8.004807f,4.9250073f,7.4340644f,3.9296093f,6.503886f,3.3907204f)
                curveTo(5.573708f,2.8518312f,4.426292f,2.8518312f,3.4961138f,3.3907204f)
                curveTo(2.5659356f,3.9296093f,1.9951925f,4.9250073f,2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                curveTo(15.995193f,19.074993f,16.565935f,20.07039f,17.496113f,20.60928f)
                curveTo(18.426292f,21.148169f,19.573708f,21.148169f,20.503887f,20.60928f)
                curveTo(21.434065f,20.07039f,22.004808f,19.074993f,22.0f,18.0f)
                curveTo(22.004808f,16.925007f,21.434065f,15.929609f,20.503887f,15.39072f)
                curveTo(19.573708f,14.851831f,18.426292f,14.851831f,17.496113f,15.39072f)
                curveTo(16.565935f,15.929609f,15.995193f,16.925007f,16.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(12.0f,6.0f)
                lineTo(15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(17.0f,6.0f)
                curveTo(18.10457f,6.0f,19.0f,6.8954306f,19.0f,8.0f)
                lineTo(19.0f,15.0f)
            }
}

public val LucideIcons.All.GitPullRequestArrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitPullRequestArrow: ImageVector
    @Composable get() = GitPullRequestArrowDefinition.asImageVector()
