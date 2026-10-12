package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LocateFixed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(5.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,19.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.0f)
                curveTo(4.9887824f,14.508317f,6.320516f,16.830912f,8.4909315f,18.08832f)
                curveTo(10.661347f,19.345726f,13.338653f,19.345726f,15.5090685f,18.08832f)
                curveTo(17.679483f,16.830912f,19.011217f,14.508317f,19.0f,12.0f)
                curveTo(19.011217f,9.491683f,17.679483f,7.1690884f,15.5090685f,5.9116807f)
                curveTo(13.338653f,4.654273f,10.661347f,4.654273f,8.4909315f,5.9116807f)
                curveTo(6.320516f,7.1690884f,4.9887824f,9.491683f,5.0f,12.0f)
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

public val LucideIcons.All.LocateFixedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LocateFixed: ImageVector
    @Composable get() = LocateFixedDefinition.asImageVector()
