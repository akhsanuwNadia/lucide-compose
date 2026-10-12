package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                curveTo(3.98718f,15.866648f,5.5091615f,18.521042f,7.9896364f,19.958078f)
                curveTo(10.470112f,21.395117f,13.529888f,21.395117f,16.010363f,19.958078f)
                curveTo(18.490839f,18.521042f,20.01282f,15.866648f,20.0f,13.0f)
                curveTo(20.01282f,10.133352f,18.490839f,7.478958f,16.010363f,6.0419207f)
                curveTo(13.529888f,4.6048837f,10.470112f,4.6048837f,7.9896364f,6.0419207f)
                curveTo(5.5091615f,7.478958f,3.98718f,10.133352f,4.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,13.0f)
                lineTo(14.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(2.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(19.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.38f,18.7f)
                lineTo(4.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.64f,18.67f)
                lineTo(20.0f,21.0f)
            }
}

public val LucideIcons.All.AlarmClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClock: ImageVector
    @Composable get() = AlarmClockDefinition.asImageVector()
