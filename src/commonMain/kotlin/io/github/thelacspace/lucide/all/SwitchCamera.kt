package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SwitchCamera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(4.0f,19.0f)
                curveTo(2.8954306f,19.0f,2.0f,18.10457f,2.0f,17.0f)
                lineTo(2.0f,7.0f)
                curveTo(2.0f,5.8954306f,2.8954306f,5.0f,4.0f,5.0f)
                lineTo(9.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,5.0f)
                lineTo(20.0f,5.0f)
                curveTo(21.10457f,5.0f,22.0f,5.8954306f,22.0f,7.0f)
                lineTo(22.0f,17.0f)
                curveTo(22.0f,18.10457f,21.10457f,19.0f,20.0f,19.0f)
                lineTo(15.0f,19.0f)
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
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(15.0f,19.0f)
                lineTo(18.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(9.0f,5.0f)
                lineTo(6.0f,8.0f)
            }
}

public val LucideIcons.All.SwitchCameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SwitchCamera: ImageVector
    @Composable get() = SwitchCameraDefinition.asImageVector()
