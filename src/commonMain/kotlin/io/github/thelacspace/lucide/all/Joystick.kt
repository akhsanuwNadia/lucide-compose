package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Joystick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                curveTo(21.0f,15.895431f,20.10457f,15.0f,19.0f,15.0f)
                lineTo(5.0f,15.0f)
                curveTo(3.8954306f,15.0f,3.0f,15.895431f,3.0f,17.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(19.0f,21.0f)
                curveTo(20.10457f,21.0f,21.0f,20.10457f,21.0f,19.0f)
                lineTo(21.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                lineTo(6.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                curveTo(8.995193f,7.0749927f,9.565935f,8.070391f,10.496114f,8.60928f)
                curveTo(11.426291f,9.148169f,12.573709f,9.148169f,13.503886f,8.60928f)
                curveTo(14.434065f,8.070391f,15.004807f,7.0749927f,15.0f,6.0f)
                curveTo(15.004807f,4.9250073f,14.434065f,3.9296093f,13.503886f,3.3907204f)
                curveTo(12.573709f,2.8518312f,11.426291f,2.8518312f,10.496114f,3.3907204f)
                curveTo(9.565935f,3.9296093f,8.995193f,4.9250073f,9.0f,6.0f)
            }
}

public val LucideIcons.All.JoystickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Joystick: ImageVector
    @Composable get() = JoystickDefinition.asImageVector()
