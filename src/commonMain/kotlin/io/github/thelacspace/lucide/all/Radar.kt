package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.07f,4.93f)
                curveTo(15.86834f,1.7249093f,10.911971f,1.0725396f,6.99f,3.34f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(4.01f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.29f,9.62f)
                curveTo(1.2610148f,13.811246f,3.0369482f,18.189772f,6.6948323f,20.480019f)
                curveTo(10.352716f,22.770267f,15.067198f,22.455473f,18.388119f,19.699238f)
                curveTo(21.70904f,16.943003f,22.88708f,12.367234f,21.31f,8.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.24f,7.76f)
                curveTo(14.672045f,6.18292f,12.360399f,5.6024513f,10.2333975f,6.2517033f)
                curveTo(8.106396f,6.9009557f,6.512967f,8.673421f,6.0930166f,10.857295f)
                curveTo(5.673066f,13.04117f,6.4954853f,15.278193f,8.23f,16.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.99f,11.66f)
                curveTo(18.10036f,13.59013f,17.27393f,15.455185f,15.77f,16.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.41f,10.59f)
                lineTo(19.07f,4.9300003f)
            }
}

public val LucideIcons.All.RadarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radar: ImageVector
    @Composable get() = RadarDefinition.asImageVector()
