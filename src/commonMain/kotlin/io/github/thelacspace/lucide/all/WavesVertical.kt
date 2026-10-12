package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                quadTo(14.0,4.5,12.0,7.0)
                quadTo(10.0,9.5,12.0,12.0)
                quadTo(14.0,14.5,12.0,17.0)
                quadTo(10.0,19.5,12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                quadTo(21.0,4.5,19.0,7.0)
                quadTo(17.0,9.5,19.0,12.0)
                quadTo(21.0,14.5,19.0,17.0)
                quadTo(17.0,19.5,19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                quadTo(7.0,4.5,5.0,7.0)
                quadTo(3.0,9.5,5.0,12.0)
                quadTo(7.0,14.5,5.0,17.0)
                quadTo(3.0,19.5,5.0,22.0)
            }
}

public val LucideIcons.All.WavesVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesVertical: ImageVector
    @Composable get() = WavesVerticalDefinition.asImageVector()
