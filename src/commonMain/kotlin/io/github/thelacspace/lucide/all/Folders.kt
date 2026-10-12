package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Folders") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,5.0f)
                curveTo(21.10457f,5.0f,22.0f,5.8954306f,22.0f,7.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,15.104569f,21.10457f,16.0f,20.0f,16.0f)
                lineTo(9.0f,16.0f)
                curveTo(7.8954306f,16.0f,7.0f,15.104569f,7.0f,14.0f)
                lineTo(7.0f,5.0f)
                curveTo(7.0f,3.8954306f,7.8954306f,3.0f,9.0f,3.0f)
                lineTo(11.5f,3.0f)
                curveTo(11.972136f,3.0f,12.4167185f,3.2222912f,12.7f,3.6f)
                lineTo(13.3f,4.4f)
                curveTo(13.5832815f,4.777709f,14.027864f,5.0f,14.5f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,8.268f)
                curveTo(2.3793535f,8.626326f,1.9978701f,9.289344f,2.0f,10.006f)
                lineTo(2.0f,19.0f)
                curveTo(2.0f,20.10457f,2.8954306f,21.0f,4.0f,21.0f)
                lineTo(15.0f,21.0f)
                curveTo(15.714513f,20.999983f,16.374744f,20.618786f,16.732f,20.0f)
            }
}

public val LucideIcons.All.FoldersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Folders: ImageVector
    @Composable get() = FoldersDefinition.asImageVector()
