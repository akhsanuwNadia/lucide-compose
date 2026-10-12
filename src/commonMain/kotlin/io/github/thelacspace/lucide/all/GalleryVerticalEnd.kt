package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GalleryVerticalEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,6.0)
                lineTo(19.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(19.0,10.0)
                lineTo(21.0,10.0)
                lineTo(21.0,22.0)
                lineTo(19.0,22.0)
                lineTo(5.0,22.0)
                lineTo(3.0,22.0)
                lineTo(3.0,10.0)
                lineTo(5.0,10.0)
                close()
            }
}

public val LucideIcons.All.GalleryVerticalEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GalleryVerticalEnd: ImageVector
    @Composable get() = GalleryVerticalEndDefinition.asImageVector()
