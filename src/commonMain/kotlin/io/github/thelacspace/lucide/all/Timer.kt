package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(15.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                curveTo(3.98718f,16.866648f,5.5091615f,19.521042f,7.9896364f,20.958078f)
                curveTo(10.470112f,22.395117f,13.529888f,22.395117f,16.010363f,20.958078f)
                curveTo(18.490839f,19.521042f,20.01282f,16.866648f,20.0f,14.0f)
                curveTo(20.01282f,11.133352f,18.490839f,8.478958f,16.010363f,7.0419207f)
                curveTo(13.529888f,5.6048837f,10.470112f,5.6048837f,7.9896364f,7.0419207f)
                curveTo(5.5091615f,8.478958f,3.98718f,11.133352f,4.0f,14.0f)
            }
}

public val LucideIcons.All.TimerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timer: ImageVector
    @Composable get() = TimerDefinition.asImageVector()
