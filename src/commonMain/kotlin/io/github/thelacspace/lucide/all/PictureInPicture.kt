package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PictureInPicture") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(8.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,4.0f)
                lineTo(8.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,10.0f)
                lineTo(21.0f,7.0f)
                curveTo(21.0f,5.8954306f,20.10457f,5.0f,19.0f,5.0f)
                lineTo(12.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                lineTo(3.0f,16.0f)
                curveTo(3.0f,17.10457f,3.8954306f,18.0f,5.0f,18.0f)
                lineTo(8.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,14.0f)
                lineTo(21.0f,14.0f)
                lineTo(22.0f,14.0f)
                lineTo(22.0f,21.0f)
                lineTo(21.0f,21.0f)
                lineTo(13.0f,21.0f)
                lineTo(12.0f,21.0f)
                lineTo(12.0f,14.0f)
                lineTo(13.0f,14.0f)
                close()
            }
}

public val LucideIcons.All.PictureInPictureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PictureInPicture: ImageVector
    @Composable get() = PictureInPictureDefinition.asImageVector()
