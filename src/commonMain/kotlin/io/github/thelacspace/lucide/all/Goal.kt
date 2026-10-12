package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Goal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.0f,2.0f)
                lineTo(20.0f,6.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.561f,10.222f)
                curveTo(22.042654f,14.788601f,19.679014f,19.71422f,15.18961f,21.41551f)
                curveTo(10.700206f,23.116802f,5.665794f,20.994726f,3.7488644f,16.593077f)
                curveTo(1.831935f,12.191427f,3.7074554f,7.06006f,8.011001f,4.932f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.002f,9.997f)
                curveTo(6.6215663f,11.834537f,6.6715817f,14.376468f,8.12323f,16.15828f)
                curveTo(9.574879f,17.940092f,12.054243f,18.502825f,14.132857f,17.522263f)
                curveTo(16.211472f,16.541702f,17.353924f,14.270421f,16.902f,12.017f)
            }
}

public val LucideIcons.All.GoalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Goal: ImageVector
    @Composable get() = GoalDefinition.asImageVector()
