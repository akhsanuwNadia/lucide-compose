package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shuffle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,14.0f)
                lineTo(22.0f,18.0f)
                lineTo(18.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,2.0f)
                lineTo(22.0f,6.0f)
                lineTo(18.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,18.0f)
                lineTo(3.973f,18.0f)
                curveTo(5.2852654f,18.008963f,6.5184603f,17.37368f,7.273f,16.3f)
                lineTo(12.726999f,7.699999f)
                curveTo(13.481539f,6.6263185f,14.714733f,5.991036f,16.026999f,5.999999f)
                lineTo(22.0f,5.999999f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,6.0f)
                lineTo(3.9720001f,6.0f)
                curveTo(5.4926276f,5.9894176f,6.8877378f,6.8419847f,7.572f,8.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(15.959f,18.0f)
                curveTo(14.62803f,17.986425f,13.391002f,17.311684f,12.658999f,16.2f)
                lineTo(12.299999f,15.750001f)
            }
}

public val LucideIcons.All.ShuffleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shuffle: ImageVector
    @Composable get() = ShuffleDefinition.asImageVector()
