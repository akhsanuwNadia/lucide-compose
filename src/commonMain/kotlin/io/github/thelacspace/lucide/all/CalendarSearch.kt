package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,10.69f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(12.25f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,21.0f)
                lineTo(20.125f,19.125f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.0f)
                lineTo(21.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(8.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                curveTo(14.995193f,18.074993f,15.565935f,19.07039f,16.496113f,19.60928f)
                curveTo(17.426292f,20.148169f,18.573708f,20.148169f,19.503887f,19.60928f)
                curveTo(20.434065f,19.07039f,21.004808f,18.074993f,21.0f,17.0f)
                curveTo(21.004808f,15.925007f,20.434065f,14.929609f,19.503887f,14.39072f)
                curveTo(18.573708f,13.851831f,17.426292f,13.851831f,16.496113f,14.39072f)
                curveTo(15.565935f,14.929609f,14.995193f,15.925007f,15.0f,17.0f)
            }
}

public val LucideIcons.All.CalendarSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarSearch: ImageVector
    @Composable get() = CalendarSearchDefinition.asImageVector()
