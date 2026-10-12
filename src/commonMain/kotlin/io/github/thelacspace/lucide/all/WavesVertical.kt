package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                quadTo(14.0f,4.5f,12.0f,7.0f)
                quadTo(10.0f,9.5f,12.0f,12.0f)
                quadTo(14.0f,14.5f,12.0f,17.0f)
                quadTo(10.0f,19.5f,12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,2.0f)
                quadTo(21.0f,4.5f,19.0f,7.0f)
                quadTo(17.0f,9.5f,19.0f,12.0f)
                quadTo(21.0f,14.5f,19.0f,17.0f)
                quadTo(17.0f,19.5f,19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                quadTo(7.0f,4.5f,5.0f,7.0f)
                quadTo(3.0f,9.5f,5.0f,12.0f)
                quadTo(7.0f,14.5f,5.0f,17.0f)
                quadTo(3.0f,19.5f,5.0f,22.0f)
            }
}

public val LucideIcons.All.WavesVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesVertical: ImageVector
    @Composable get() = WavesVerticalDefinition.asImageVector()
