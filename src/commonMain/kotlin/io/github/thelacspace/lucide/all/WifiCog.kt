package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.305f,19.53f)
                lineTo(15.228001f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,16.852f)
                lineTo(14.304999f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,15.228f)
                lineTo(16.469f,14.304999f)
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
                moveTo(2.0f,8.82f)
                curveTo(7.694013f,3.7271194f,16.305986f,3.7271194f,22.0f,8.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,16.852f)
                lineTo(21.696f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,19.148f)
                lineTo(21.696f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.859f)
                curveTo(7.6835294f,10.227202f,11.616187f,9.322459f,15.18f,10.517f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,16.429f)
                curveTo(9.062173f,15.877196f,9.746771f,15.466026f,10.498f,15.229001f)
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

public val LucideIcons.All.WifiCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiCog: ImageVector
    @Composable get() = WifiCogDefinition.asImageVector()
