package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Motorbike") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,14.0f)
                lineTo(17.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(9.0f,11.0f)
                curveTo(9.0f,9.895431f,9.895431f,9.0f,11.0f,9.0f)
                lineTo(13.0f,9.0f)
                curveTo(14.030603f,9.000492f,14.892093f,9.784058f,14.99f,10.809999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,17.0f)
                lineTo(11.0f,17.0f)
                curveTo(11.552285f,17.0f,12.0f,16.552284f,12.0f,16.0f)
                curveTo(12.0f,12.686292f,14.686292f,10.0f,18.0f,10.0f)
                curveTo(18.552284f,10.0f,19.0f,9.552285f,19.0f,9.0f)
                lineTo(19.0f,8.25f)
                curveTo(18.789217f,6.9448595f,18.070116f,5.77632f,17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                curveTo(15.995193f,18.074993f,16.565935f,19.07039f,17.496113f,19.60928f)
                curveTo(18.426292f,20.148169f,19.573708f,20.148169f,20.503887f,19.60928f)
                curveTo(21.434065f,19.07039f,22.004808f,18.074993f,22.0f,17.0f)
                curveTo(22.004808f,15.925007f,21.434065f,14.929609f,20.503887f,14.39072f)
                curveTo(19.573708f,13.851831f,18.426292f,13.851831f,17.496113f,14.39072f)
                curveTo(16.565935f,14.929609f,15.995193f,15.925007f,16.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                curveTo(1.9951925f,18.074993f,2.5659356f,19.07039f,3.4961138f,19.60928f)
                curveTo(4.426292f,20.148169f,5.573708f,20.148169f,6.503886f,19.60928f)
                curveTo(7.4340644f,19.07039f,8.004807f,18.074993f,8.0f,17.0f)
                curveTo(8.004807f,15.925007f,7.4340644f,14.929609f,6.503886f,14.39072f)
                curveTo(5.573708f,13.851831f,4.426292f,13.851831f,3.4961138f,14.39072f)
                curveTo(2.5659356f,14.929609f,1.9951925f,15.925007f,2.0f,17.0f)
            }
}

public val LucideIcons.All.MotorbikeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Motorbike: ImageVector
    @Composable get() = MotorbikeDefinition.asImageVector()
