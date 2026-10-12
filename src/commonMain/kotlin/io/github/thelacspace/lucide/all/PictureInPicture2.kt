package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PictureInPicture2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                lineTo(21.0,6.0)
                curveTo(21.0,4.895430564880371,20.104570388793945,4.0,19.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,16.0)
                curveTo(2.0,17.100000381469727,2.9000000953674316,18.0,4.0,18.0)
                lineTo(8.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(20.0,13.0)
                lineTo(22.0,13.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(14.0,20.0)
                lineTo(12.0,20.0)
                lineTo(12.0,13.0)
                lineTo(14.0,13.0)
                close()
            }
}

public val LucideIcons.All.PictureInPicture2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PictureInPicture2: ImageVector
    @Composable get() = PictureInPicture2Definition.asImageVector()
