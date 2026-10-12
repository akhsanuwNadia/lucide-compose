package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MirrorRectangular") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,6.0f)
                lineTo(8.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.0f)
                lineTo(8.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,22.0f)
                lineTo(18.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.MirrorRectangularDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MirrorRectangular: ImageVector
    @Composable get() = MirrorRectangularDefinition.asImageVector()
