package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                quadTo(4.5f,14.0f,7.0f,12.0f)
                quadTo(9.5f,10.0f,12.0f,12.0f)
                quadTo(14.5f,14.0f,17.0f,12.0f)
                quadTo(19.5f,10.0f,22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                quadTo(4.5f,21.0f,7.0f,19.0f)
                quadTo(9.5f,17.0f,12.0f,19.0f)
                quadTo(14.5f,21.0f,17.0f,19.0f)
                quadTo(19.5f,17.0f,22.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,5.0f)
                quadTo(4.5f,7.0f,7.0f,5.0f)
                quadTo(9.5f,3.0f,12.0f,5.0f)
                quadTo(14.5f,7.0f,17.0f,5.0f)
                quadTo(19.5f,3.0f,22.0f,5.0f)
            }
}

public val LucideIcons.All.WavesHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesHorizontal: ImageVector
    @Composable get() = WavesHorizontalDefinition.asImageVector()
