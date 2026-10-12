package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Infinity") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,16.0f)
                curveTo(11.0f,16.0f,13.0f,8.0f,18.0f,8.0f)
                curveTo(20.202156f,8.009849f,21.982151f,9.797822f,21.982151f,12.0f)
                curveTo(21.982151f,14.202178f,20.202156f,15.990151f,18.0f,16.0f)
                curveTo(13.0f,16.0f,11.0f,8.0f,6.0f,8.0f)
                curveTo(4.566676f,7.99359f,3.239479f,8.7545805f,2.5209603f,9.994819f)
                curveTo(1.8024417f,11.235056f,1.8024417f,12.764944f,2.5209603f,14.005181f)
                curveTo(3.239479f,15.2454195f,4.566676f,16.00641f,6.0f,16.0f)
            }
}

public val LucideIcons.All.InfinityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Infinity: ImageVector
    @Composable get() = InfinityDefinition.asImageVector()
