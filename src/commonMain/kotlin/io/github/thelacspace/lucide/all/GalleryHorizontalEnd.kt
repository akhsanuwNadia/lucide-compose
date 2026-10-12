package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryHorizontalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,7.0)
                lineTo(2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,5.0)
                lineTo(6.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,21.0)
                lineTo(20.0,21.0)
                lineTo(12.0,21.0)
                lineTo(10.0,21.0)
                lineTo(10.0,3.0)
                lineTo(12.0,3.0)
                close()
            }
}

public val LucideIcons.All.GalleryHorizontalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryHorizontalEnd: ImageVector
    @Composable get() = GalleryHorizontalEndDefinition.asImageVector()
