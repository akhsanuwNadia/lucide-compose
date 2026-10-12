package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.307f)
                lineTo(22.0f,15.0f)
                curveTo(22.0f,16.10457f,21.10457f,17.0f,20.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(2.8954306f,17.0f,2.0f,16.10457f,2.0f,15.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(12.693f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
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
}

public val LucideIcons.All.MonitorDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorDot: ImageVector
    @Composable get() = MonitorDotDefinition.asImageVector()
