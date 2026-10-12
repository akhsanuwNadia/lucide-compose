package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PictureInPicture2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,9.0f)
                lineTo(21.0f,6.0f)
                curveTo(21.0f,4.8954306f,20.10457f,4.0f,19.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,16.0f)
                curveTo(2.0f,17.1f,2.9f,18.0f,4.0f,18.0f)
                lineTo(8.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(20.0f,13.0f)
                lineTo(22.0f,13.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(14.0f,20.0f)
                lineTo(12.0f,20.0f)
                lineTo(12.0f,13.0f)
                lineTo(14.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.PictureInPicture2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PictureInPicture2: ImageVector
    @Composable get() = PictureInPicture2Definition.asImageVector()
