package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carrot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                curveTo(16.91827f,14.064496f,16.91129f,10.942524f,14.984383f,9.015617f)
                curveTo(13.057476f,7.0887113f,9.935504f,7.0817304f,8.0f,9.0f)
                quadTo(4.0f,13.0f,2.013f,21.385f)
                curveTo(1.9729048f,21.553833f,2.0232139f,21.73138f,2.1459167f,21.854084f)
                curveTo(2.2686195f,21.976786f,2.446168f,22.027096f,2.615f,21.987f)
                quadTo(11.0f,20.0f,15.0f,16.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                quadTo(19.0f,13.0f,22.0f,9.0f)
                quadTo(19.0f,5.0f,15.0f,9.0f)
                quadTo(19.0f,5.0f,15.0f,2.0f)
                quadTo(11.0f,5.0f,15.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(5.42f,12.42f)
            }
}

public val LucideIcons.All.CarrotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carrot: ImageVector
    @Composable get() = CarrotDefinition.asImageVector()
