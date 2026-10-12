package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HatGlasses") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                curveTo(13.995076f,16.898922f,13.1010895f,16.008924f,12.0f,16.008924f)
                curveTo(10.8989105f,16.008924f,10.004924f,16.898922f,10.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,11.0f)
                lineTo(16.89f,4.343f)
                curveTo(16.703194f,3.8052897f,16.296112f,3.3726568f,15.770755f,3.1535032f)
                curveTo(15.245398f,2.9343498f,14.6515465f,2.9494426f,14.138f,3.195f)
                lineTo(12.8619995f,3.8049998f)
                curveTo(12.592802f,3.9334657f,12.29828f,4.0000925f,12.0f,4.0f)
                lineTo(8.5f,4.0f)
                curveTo(7.604791f,3.9998183f,6.8184967f,4.5945425f,6.575f,5.456f)
                lineTo(5.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,11.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                curveTo(13.995193f,19.074993f,14.565935f,20.07039f,15.496114f,20.60928f)
                curveTo(16.426292f,21.148169f,17.573708f,21.148169f,18.503887f,20.60928f)
                curveTo(19.434065f,20.07039f,20.004808f,19.074993f,20.0f,18.0f)
                curveTo(20.004808f,16.925007f,19.434065f,15.929609f,18.503887f,15.39072f)
                curveTo(17.573708f,14.851831f,16.426292f,14.851831f,15.496114f,15.39072f)
                curveTo(14.565935f,15.929609f,13.995193f,16.925007f,14.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                curveTo(3.9951925f,19.074993f,4.5659356f,20.07039f,5.496114f,20.60928f)
                curveTo(6.426292f,21.148169f,7.573708f,21.148169f,8.503886f,20.60928f)
                curveTo(9.434065f,20.07039f,10.004807f,19.074993f,10.0f,18.0f)
                curveTo(10.004807f,16.925007f,9.434065f,15.929609f,8.503886f,15.39072f)
                curveTo(7.573708f,14.851831f,6.426292f,14.851831f,5.496114f,15.39072f)
                curveTo(4.5659356f,15.929609f,3.9951925f,16.925007f,4.0f,18.0f)
            }
}

public val LucideIcons.All.HatGlassesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HatGlasses: ImageVector
    @Composable get() = HatGlassesDefinition.asImageVector()
