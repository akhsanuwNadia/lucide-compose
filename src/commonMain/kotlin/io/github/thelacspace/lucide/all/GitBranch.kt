package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitBranch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                curveTo(10.029437f,6.0f,6.0f,10.029437f,6.0f,15.0f)
                lineTo(6.0f,3.0f)
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
                moveTo(3.0f,18.0f)
                curveTo(2.9951925f,19.074993f,3.5659356f,20.07039f,4.496114f,20.60928f)
                curveTo(5.426292f,21.148169f,6.573708f,21.148169f,7.503886f,20.60928f)
                curveTo(8.434065f,20.07039f,9.004807f,19.074993f,9.0f,18.0f)
                curveTo(9.004807f,16.925007f,8.434065f,15.929609f,7.503886f,15.39072f)
                curveTo(6.573708f,14.851831f,5.426292f,14.851831f,4.496114f,15.39072f)
                curveTo(3.5659356f,15.929609f,2.9951925f,16.925007f,3.0f,18.0f)
            }
}

public val LucideIcons.All.GitBranchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitBranch: ImageVector
    @Composable get() = GitBranchDefinition.asImageVector()
