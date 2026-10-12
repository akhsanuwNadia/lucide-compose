package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Camera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.997f,4.0f)
                curveTo(14.732041f,3.9999895f,15.407855f,4.403174f,15.757f,5.05f)
                lineTo(16.243f,5.9500003f)
                curveTo(16.592144f,6.596826f,17.26796f,7.0000105f,18.003f,7.0f)
                lineTo(20.0f,7.0f)
                curveTo(21.10457f,7.0f,22.0f,7.8954306f,22.0f,9.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,9.0f)
                curveTo(2.0f,7.8954306f,2.8954306f,7.0f,4.0f,7.0f)
                lineTo(5.9969997f,7.0f)
                curveTo(6.731255f,7.00004f,7.406494f,6.5977373f,7.7559996f,5.952f)
                lineTo(8.245f,5.0480003f)
                curveTo(8.594505f,4.402263f,9.269745f,3.99996f,10.004f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,13.0f)
                curveTo(8.995193f,14.074993f,9.565935f,15.070391f,10.496114f,15.60928f)
                curveTo(11.426291f,16.148169f,12.573709f,16.148169f,13.503886f,15.60928f)
                curveTo(14.434065f,15.070391f,15.004807f,14.074993f,15.0f,13.0f)
                curveTo(15.004807f,11.925007f,14.434065f,10.929609f,13.503886f,10.39072f)
                curveTo(12.573709f,9.851831f,11.426291f,9.851831f,10.496114f,10.39072f)
                curveTo(9.565935f,10.929609f,8.995193f,11.925007f,9.0f,13.0f)
            }
}

public val LucideIcons.All.CameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Camera: ImageVector
    @Composable get() = CameraDefinition.asImageVector()
