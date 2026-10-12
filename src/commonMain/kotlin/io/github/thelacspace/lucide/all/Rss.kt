package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rss") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,11.0f)
                curveTo(8.970563f,11.0f,13.0f,15.029437f,13.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                curveTo(12.836556f,4.0f,20.0f,11.163444f,20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,19.0f)
                curveTo(3.9983976f,19.358332f,4.1886454f,19.69013f,4.4987044f,19.86976f)
                curveTo(4.808764f,20.049389f,5.191236f,20.049389f,5.5012956f,19.86976f)
                curveTo(5.8113546f,19.69013f,6.0016026f,19.358332f,6.0f,19.0f)
                curveTo(6.0016026f,18.641668f,5.8113546f,18.30987f,5.5012956f,18.13024f)
                curveTo(5.191236f,17.950611f,4.808764f,17.950611f,4.4987044f,18.13024f)
                curveTo(4.1886454f,18.30987f,3.9983976f,18.641668f,4.0f,19.0f)
            }
}

public val LucideIcons.All.RssDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rss: ImageVector
    @Composable get() = RssDefinition.asImageVector()
