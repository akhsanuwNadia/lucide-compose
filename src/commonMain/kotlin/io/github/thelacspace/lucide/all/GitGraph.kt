package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GitGraph") { strokeWidth ->
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
                lineTo(5.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                curveTo(1.9951925f,19.074993f,2.5659356f,20.07039f,3.4961138f,20.60928f)
                curveTo(4.426292f,21.148169f,5.573708f,21.148169f,6.503886f,20.60928f)
                curveTo(7.4340644f,20.07039f,8.004807f,19.074993f,8.0f,18.0f)
                curveTo(8.004807f,16.925007f,7.4340644f,15.929609f,6.503886f,15.39072f)
                curveTo(5.573708f,14.851831f,4.426292f,14.851831f,3.4961138f,15.39072f)
                curveTo(2.5659356f,15.929609f,1.9951925f,16.925007f,2.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                curveTo(15.995193f,7.0749927f,16.565935f,8.070391f,17.496113f,8.60928f)
                curveTo(18.426292f,9.148169f,19.573708f,9.148169f,20.503887f,8.60928f)
                curveTo(21.434065f,8.070391f,22.004808f,7.0749927f,22.0f,6.0f)
                curveTo(22.004808f,4.9250073f,21.434065f,3.9296093f,20.503887f,3.3907204f)
                curveTo(19.573708f,2.8518312f,18.426292f,2.8518312f,17.496113f,3.3907204f)
                curveTo(16.565935f,3.9296093f,15.995193f,4.9250073f,16.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,15.7f)
                curveTo(17.906773f,13.994533f,18.997667f,11.558202f,19.0f,9.0f)
            }
}

public val LucideIcons.All.GitGraphDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GitGraph: ImageVector
    @Composable get() = GitGraphDefinition.asImageVector()
