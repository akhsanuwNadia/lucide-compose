package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,12.5f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.1f,2.9f,20.0f,4.0f,20.0f)
                lineTo(11.5f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.03f,12.7f)
                curveTo(12.400046f,13.094681f,11.599953f,13.094681f,10.969999f,12.7f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                curveTo(19.074993f,21.004808f,20.07039f,20.434065f,20.60928f,19.503887f)
                curveTo(21.148169f,18.573708f,21.148169f,17.426292f,20.60928f,16.496113f)
                curveTo(20.07039f,15.565935f,19.074993f,14.995193f,18.0f,15.0f)
                curveTo(16.348383f,15.007386f,15.013387f,16.348366f,15.013387f,18.0f)
                curveTo(15.013387f,19.651634f,16.348383f,20.992613f,18.0f,21.0f)
                close()
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
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(20.5f,20.5f)
            }
}

public val LucideIcons.All.MailSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailSearch: ImageVector
    @Composable get() = MailSearchDefinition.asImageVector()
