package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PictureInPicture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                lineTo(8.0,10.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,4.0)
                lineTo(8.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,10.0)
                lineTo(21.0,7.0)
                curveTo(21.0,5.895430564880371,20.104570388793945,5.0,19.0,5.0)
                lineTo(12.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,14.0)
                lineTo(3.0,16.0)
                curveTo(3.0,17.104570388793945,3.895430564880371,18.0,5.0,18.0)
                lineTo(8.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,14.0)
                lineTo(21.0,14.0)
                lineTo(22.0,14.0)
                lineTo(22.0,21.0)
                lineTo(21.0,21.0)
                lineTo(13.0,21.0)
                lineTo(12.0,21.0)
                lineTo(12.0,14.0)
                lineTo(13.0,14.0)
                close()
            }
}

public val LucideIcons.All.PictureInPictureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PictureInPicture: ImageVector
    @Composable get() = PictureInPictureDefinition.asImageVector()
