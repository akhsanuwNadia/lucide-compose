package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305f,7.53f)
                lineTo(15.228001f,7.1480002f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,4.852f)
                lineTo(14.304999f,4.4690003f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,3.228f)
                lineTo(16.469f,2.304f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,8.772f)
                lineTo(16.469f,9.695001f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,3.228f)
                lineTo(19.531f,2.304f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,9.696f)
                lineTo(19.148f,8.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,4.852f)
                lineTo(21.696f,4.4690003f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,7.148f)
                lineTo(21.696f,7.5309997f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,13.0f)
                lineTo(22.0f,15.0f)
                curveTo(22.0f,16.10457f,21.10457f,17.0f,20.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(2.8954306f,17.0f,2.0f,16.10457f,2.0f,15.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(11.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
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
}

public val LucideIcons.All.MonitorCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorCog: ImageVector
    @Composable get() = MonitorCogDefinition.asImageVector()
