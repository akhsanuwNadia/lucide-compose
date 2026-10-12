package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RouteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(2.9951925f,20.074993f,3.5659356f,21.07039f,4.496114f,21.60928f)
                curveTo(5.426292f,22.148169f,6.573708f,22.148169f,7.503886f,21.60928f)
                curveTo(8.434065f,21.07039f,9.004807f,20.074993f,9.0f,19.0f)
                curveTo(9.004807f,17.925007f,8.434065f,16.92961f,7.503886f,16.39072f)
                curveTo(6.573708f,15.851831f,5.426292f,15.851831f,4.496114f,16.39072f)
                curveTo(3.5659356f,16.92961f,2.9951925f,17.925007f,3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(17.5f,19.0f)
                curveTo(17.9f,19.0f,18.4f,18.9f,18.8f,18.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.2f,5.2f)
                curveTo(3.652398f,5.8346205f,2.7652485f,7.483902f,3.0815449f,9.138375f)
                curveTo(3.3978415f,10.792849f,4.829395f,11.991218f,6.5f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.3f)
                curveTo(20.900892f,13.520127f,19.479874f,12.099108f,17.7f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(10.7f,5.0f)
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

public val LucideIcons.All.RouteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RouteOff: ImageVector
    @Composable get() = RouteOffDefinition.asImageVector()
