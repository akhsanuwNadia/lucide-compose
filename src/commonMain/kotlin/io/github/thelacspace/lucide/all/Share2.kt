package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Share2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                curveTo(14.995193f,6.0749927f,15.565935f,7.0703907f,16.496113f,7.6092796f)
                curveTo(17.426292f,8.148169f,18.573708f,8.148169f,19.503887f,7.6092796f)
                curveTo(20.434065f,7.0703907f,21.004808f,6.0749927f,21.0f,5.0f)
                curveTo(21.004808f,3.925007f,20.434065f,2.9296093f,19.503887f,2.3907204f)
                curveTo(18.573708f,1.8518313f,17.426292f,1.8518313f,16.496113f,2.3907204f)
                curveTo(15.565935f,2.9296093f,14.995193f,3.925007f,15.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(2.9951925f,13.074993f,3.5659356f,14.070391f,4.496114f,14.60928f)
                curveTo(5.426292f,15.148169f,6.573708f,15.148169f,7.503886f,14.60928f)
                curveTo(8.434065f,14.070391f,9.004807f,13.074993f,9.0f,12.0f)
                curveTo(9.004807f,10.925007f,8.434065f,9.929609f,7.503886f,9.39072f)
                curveTo(6.573708f,8.851831f,5.426292f,8.851831f,4.496114f,9.39072f)
                curveTo(3.5659356f,9.929609f,2.9951925f,10.925007f,3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                curveTo(14.995193f,20.074993f,15.565935f,21.07039f,16.496113f,21.60928f)
                curveTo(17.426292f,22.148169f,18.573708f,22.148169f,19.503887f,21.60928f)
                curveTo(20.434065f,21.07039f,21.004808f,20.074993f,21.0f,19.0f)
                curveTo(21.004808f,17.925007f,20.434065f,16.92961f,19.503887f,16.39072f)
                curveTo(18.573708f,15.851831f,17.426292f,15.851831f,16.496113f,16.39072f)
                curveTo(15.565935f,16.92961f,14.995193f,17.925007f,15.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.59f,13.51f)
                lineTo(15.42f,17.49f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.41f,6.51f)
                lineTo(8.59f,10.49f)
            }
}

public val LucideIcons.All.Share2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Share2: ImageVector
    @Composable get() = Share2Definition.asImageVector()
