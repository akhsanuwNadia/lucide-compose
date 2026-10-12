package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DiscAlbum") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                curveTo(6.991987f,13.791655f,7.943226f,15.450651f,9.493523f,16.348799f)
                curveTo(11.043819f,17.246948f,12.956181f,17.246948f,14.506477f,16.348799f)
                curveTo(16.056774f,15.450651f,17.008013f,13.791655f,17.0f,12.0f)
                curveTo(17.008013f,10.208345f,16.056774f,8.549349f,14.506477f,7.651201f)
                curveTo(12.956181f,6.753052f,11.043819f,6.753052f,9.493523f,7.651201f)
                curveTo(7.943226f,8.549349f,6.991987f,10.208345f,7.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.01f,12.0f)
            }
}

public val LucideIcons.All.DiscAlbumDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DiscAlbum: ImageVector
    @Composable get() = DiscAlbumDefinition.asImageVector()
