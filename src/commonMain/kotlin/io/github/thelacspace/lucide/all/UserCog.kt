package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(6.0f,15.0f)
                curveTo(3.790861f,15.0f,2.0f,16.790861f,2.0f,19.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.305f,16.53f)
                lineTo(15.228001f,16.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,13.852f)
                lineTo(14.304999f,13.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,12.228f)
                lineTo(16.469f,11.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,17.772f)
                lineTo(16.469f,18.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,12.228f)
                lineTo(19.531f,11.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,18.696f)
                lineTo(19.148f,17.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,13.852f)
                lineTo(21.696f,13.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,16.148f)
                lineTo(21.696f,16.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                curveTo(14.995193f,16.074993f,15.565935f,17.07039f,16.496113f,17.60928f)
                curveTo(17.426292f,18.148169f,18.573708f,18.148169f,19.503887f,17.60928f)
                curveTo(20.434065f,17.07039f,21.004808f,16.074993f,21.0f,15.0f)
                curveTo(21.004808f,13.925007f,20.434065f,12.929609f,19.503887f,12.39072f)
                curveTo(18.573708f,11.851831f,17.426292f,11.851831f,16.496113f,12.39072f)
                curveTo(15.565935f,12.929609f,14.995193f,13.925007f,15.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(4.99359f,8.433324f,5.7545805f,9.760521f,6.994818f,10.479039f)
                curveTo(8.235056f,11.197558f,9.764944f,11.197558f,11.005181f,10.479039f)
                curveTo(12.2454195f,9.760521f,13.00641f,8.433324f,13.0f,7.0f)
                curveTo(13.00641f,5.566676f,12.2454195f,4.239479f,11.005181f,3.5209603f)
                curveTo(9.764944f,2.8024418f,8.235056f,2.8024418f,6.994818f,3.5209603f)
                curveTo(5.7545805f,4.239479f,4.99359f,5.566676f,5.0f,7.0f)
            }
}

public val LucideIcons.All.UserCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserCog: ImageVector
    @Composable get() = UserCogDefinition.asImageVector()
