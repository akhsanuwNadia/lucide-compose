package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Music2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                curveTo(3.9935899f,19.433323f,4.7545805f,20.76052f,5.994818f,21.47904f)
                curveTo(7.235056f,22.197557f,8.764944f,22.197557f,10.005181f,21.47904f)
                curveTo(11.2454195f,20.76052f,12.00641f,19.433323f,12.0f,18.0f)
                curveTo(12.00641f,16.566677f,11.2454195f,15.239479f,10.005181f,14.520961f)
                curveTo(8.764944f,13.802442f,7.235056f,13.802442f,5.994818f,14.520961f)
                curveTo(4.7545805f,15.239479f,3.9935899f,16.566677f,4.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,2.0f)
                lineTo(19.0f,6.0f)
            }
}

public val LucideIcons.All.Music2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Music2: ImageVector
    @Composable get() = Music2Definition.asImageVector()
