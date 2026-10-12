package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.228f,16.852f)
                lineTo(14.304999f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,19.148f)
                lineTo(14.304999f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,2.0f)
                lineTo(16.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.47f,14.305f)
                lineTo(16.852f,15.228001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,20.772f)
                lineTo(16.469f,21.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,15.228f)
                lineTo(19.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,21.696f)
                lineTo(19.148f,20.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773f,16.852f)
                lineTo(21.697f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.773f,19.148f)
                lineTo(21.697f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,10.5f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(10.5f,21.0f)
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
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
}

public val LucideIcons.All.CalendarCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarCog: ImageVector
    @Composable get() = CalendarCogDefinition.asImageVector()
