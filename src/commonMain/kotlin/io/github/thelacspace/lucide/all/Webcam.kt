package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webcam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(3.98718f,12.866648f,5.5091615f,15.521042f,7.9896364f,16.958078f)
                curveTo(10.470112f,18.395117f,13.529888f,18.395117f,16.010363f,16.958078f)
                curveTo(18.490839f,15.521042f,20.01282f,12.866648f,20.0f,10.0f)
                curveTo(20.01282f,7.1333523f,18.490839f,4.478958f,16.010363f,3.041921f)
                curveTo(13.529888f,1.6048834f,10.470112f,1.6048834f,7.9896364f,3.041921f)
                curveTo(5.5091615f,4.478958f,3.98718f,7.1333523f,4.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                curveTo(8.995193f,11.074993f,9.565935f,12.070391f,10.496114f,12.60928f)
                curveTo(11.426291f,13.148169f,12.573709f,13.148169f,13.503886f,12.60928f)
                curveTo(14.434065f,12.070391f,15.004807f,11.074993f,15.0f,10.0f)
                curveTo(15.004807f,8.925007f,14.434065f,7.9296093f,13.503886f,7.3907204f)
                curveTo(12.573709f,6.8518314f,11.426291f,6.8518314f,10.496114f,7.3907204f)
                curveTo(9.565935f,7.9296093f,8.995193f,8.925007f,9.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(17.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,18.0f)
            }
}

public val LucideIcons.All.WebcamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webcam: ImageVector
    @Composable get() = WebcamDefinition.asImageVector()
