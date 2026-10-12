package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                quadTo(4.5,14.0,7.0,12.0)
                quadTo(9.5,10.0,12.0,12.0)
                quadTo(14.5,14.0,17.0,12.0)
                quadTo(19.5,10.0,22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                quadTo(4.5,21.0,7.0,19.0)
                quadTo(9.5,17.0,12.0,19.0)
                quadTo(14.5,21.0,17.0,19.0)
                quadTo(19.5,17.0,22.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,5.0)
                quadTo(4.5,7.0,7.0,5.0)
                quadTo(9.5,3.0,12.0,5.0)
                quadTo(14.5,7.0,17.0,5.0)
                quadTo(19.5,3.0,22.0,5.0)
            }
}

public val LucideIcons.All.WavesHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesHorizontal: ImageVector
    @Composable get() = WavesHorizontalDefinition.asImageVector()
