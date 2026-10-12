package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Donut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.5f,10.0f)
                curveTo(19.757986f,9.985338f,19.060843f,9.641754f,18.597218f,9.062225f)
                curveTo(18.133595f,8.482697f,17.951424f,7.727135f,18.1f,7.0f)
                lineTo(18.0f,7.0f)
                curveTo(16.945688f,7.0110965f,15.9656105f,6.4586506f,15.429221f,5.550915f)
                curveTo(14.892832f,4.6431794f,14.881691f,3.5181797f,15.4f,2.6f)
                curveTo(11.098309f,1.027257f,6.2780113f,2.5780087f,3.700278f,6.3639507f)
                curveTo(1.1225452f,10.149893f,1.4463857f,15.203132f,4.486297f,18.629063f)
                curveTo(7.5262084f,22.054995f,12.505023f,22.977762f,16.570768f,20.868786f)
                curveTo(20.636513f,18.75981f,22.749763f,14.1582575f,21.7f,9.7f)
                curveTo(21.400002f,9.9f,20.900002f,10.0f,20.5f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                curveTo(8.995193f,13.074993f,9.565935f,14.070391f,10.496114f,14.60928f)
                curveTo(11.426291f,15.148169f,12.573709f,15.148169f,13.503886f,14.60928f)
                curveTo(14.434065f,14.070391f,15.004807f,13.074993f,15.0f,12.0f)
                curveTo(15.004807f,10.925007f,14.434065f,9.929609f,13.503886f,9.39072f)
                curveTo(12.573709f,8.851831f,11.426291f,8.851831f,10.496114f,9.39072f)
                curveTo(9.565935f,9.929609f,8.995193f,10.925007f,9.0f,12.0f)
            }
}

public val LucideIcons.All.DonutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Donut: ImageVector
    @Composable get() = DonutDefinition.asImageVector()
