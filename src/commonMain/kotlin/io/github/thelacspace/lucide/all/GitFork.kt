package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitFork") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                curveTo(8.995193f,19.074993f,9.565935f,20.07039f,10.496114f,20.60928f)
                curveTo(11.426291f,21.148169f,12.573709f,21.148169f,13.503886f,20.60928f)
                curveTo(14.434065f,20.07039f,15.004807f,19.074993f,15.0f,18.0f)
                curveTo(15.004807f,16.925007f,14.434065f,15.929609f,13.503886f,15.39072f)
                curveTo(12.573709f,14.851831f,11.426291f,14.851831f,10.496114f,15.39072f)
                curveTo(9.565935f,15.929609f,8.995193f,16.925007f,9.0f,18.0f)
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
                moveTo(15.0f,6.0f)
                curveTo(14.995193f,7.0749927f,15.565935f,8.070391f,16.496113f,8.60928f)
                curveTo(17.426292f,9.148169f,18.573708f,9.148169f,19.503887f,8.60928f)
                curveTo(20.434065f,8.070391f,21.004808f,7.0749927f,21.0f,6.0f)
                curveTo(21.004808f,4.9250073f,20.434065f,3.9296093f,19.503887f,3.3907204f)
                curveTo(18.573708f,2.8518312f,17.426292f,2.8518312f,16.496113f,3.3907204f)
                curveTo(15.565935f,3.9296093f,14.995193f,4.9250073f,15.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                lineTo(18.0f,11.0f)
                curveTo(18.0f,11.6f,17.6f,12.0f,17.0f,12.0f)
                lineTo(7.0f,12.0f)
                curveTo(6.4f,12.0f,6.0f,11.6f,6.0f,11.0f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,15.0f)
            }
}

public val LucideIcons.All.GitForkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitFork: ImageVector
    @Composable get() = GitForkDefinition.asImageVector()
