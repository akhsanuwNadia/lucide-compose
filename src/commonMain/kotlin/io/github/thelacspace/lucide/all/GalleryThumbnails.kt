package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryThumbnails") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,17.0)
                lineTo(19.0,17.0)
                lineTo(5.0,17.0)
                lineTo(3.0,17.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(20.0,21.0)
            }
}

public val LucideIcons.All.GalleryThumbnailsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryThumbnails: ImageVector
    @Composable get() = GalleryThumbnailsDefinition.asImageVector()
