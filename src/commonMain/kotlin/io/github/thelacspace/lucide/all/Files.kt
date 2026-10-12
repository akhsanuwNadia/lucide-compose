package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Files") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(11.0f,2.0f)
                curveTo(9.895431f,2.0f,9.0f,2.8954306f,9.0f,4.0f)
                lineTo(9.0f,15.0f)
                curveTo(9.0f,16.10457f,9.895431f,17.0f,11.0f,17.0f)
                lineTo(19.0f,17.0f)
                curveTo(20.10457f,17.0f,21.0f,16.10457f,21.0f,15.0f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.706f,2.706f)
                curveTo(16.254227f,2.252594f,15.640058f,1.9984305f,15.0f,2.0f)
                lineTo(15.0f,7.0f)
                curveTo(15.0f,7.5522847f,15.447715f,8.0f,16.0f,8.0f)
                lineTo(21.0f,8.0f)
                curveTo(21.00157f,7.3599424f,20.747406f,6.745774f,20.294f,6.294f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,7.0f)
                curveTo(3.8954306f,7.0f,3.0f,7.8954306f,3.0f,9.0f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,21.10457f,3.8954306f,22.0f,5.0f,22.0f)
                lineTo(13.0f,22.0f)
                curveTo(13.714513f,21.999983f,14.374743f,21.618786f,14.732f,21.0f)
            }
}

public val LucideIcons.All.FilesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Files: ImageVector
    @Composable get() = FilesDefinition.asImageVector()
