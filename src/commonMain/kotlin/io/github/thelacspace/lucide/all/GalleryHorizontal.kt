package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,3.0f)
                lineTo(2.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(16.0f,3.0f)
                lineTo(18.0f,3.0f)
                lineTo(18.0f,21.0f)
                lineTo(16.0f,21.0f)
                lineTo(8.0f,21.0f)
                lineTo(6.0f,21.0f)
                lineTo(6.0f,3.0f)
                lineTo(8.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,3.0f)
                lineTo(22.0f,21.0f)
            }
}

public val LucideIcons.All.GalleryHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryHorizontal: ImageVector
    @Composable get() = GalleryHorizontalDefinition.asImageVector()
