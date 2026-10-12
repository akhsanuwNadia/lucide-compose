package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,3.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(16.0,3.0)
                lineTo(18.0,3.0)
                lineTo(18.0,21.0)
                lineTo(16.0,21.0)
                lineTo(8.0,21.0)
                lineTo(6.0,21.0)
                lineTo(6.0,3.0)
                lineTo(8.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,3.0)
                lineTo(22.0,21.0)
            }
}

public val LucideIcons.All.GalleryHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryHorizontal: ImageVector
    @Composable get() = GalleryHorizontalDefinition.asImageVector()
