package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                curveTo(7.99359f,19.433323f,8.7545805f,20.76052f,9.994819f,21.47904f)
                curveTo(11.235056f,22.197557f,12.764944f,22.197557f,14.005181f,21.47904f)
                curveTo(15.2454195f,20.76052f,16.00641f,19.433323f,16.0f,18.0f)
                curveTo(16.00641f,16.566677f,15.2454195f,15.239479f,14.005181f,14.520961f)
                curveTo(12.764944f,13.802442f,11.235056f,13.802442f,9.994819f,14.520961f)
                curveTo(8.7545805f,15.239479f,7.99359f,16.566677f,8.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                lineTo(16.0f,2.0f)
            }
}

public val LucideIcons.All.Music3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music3: ImageVector
    @Composable get() = Music3Definition.asImageVector()
