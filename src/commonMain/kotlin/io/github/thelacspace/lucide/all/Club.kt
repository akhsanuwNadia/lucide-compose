package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Club") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.28f,9.05f)
                curveTo(17.9357f,6.8018913f,17.095991f,4.385132f,15.187616f,3.027914f)
                curveTo(13.279242f,1.6706965f,10.720759f,1.6706965f,8.812385f,3.027914f)
                curveTo(6.9040093f,4.385132f,6.064302f,6.8018913f,6.7200003f,9.05f)
                curveTo(4.236249f,9.407044f,2.3090537f,11.399903f,2.0353963f,13.894219f)
                curveTo(1.7617389f,16.388536f,3.2110095f,18.751835f,5.5582666f,19.6389f)
                curveTo(7.905524f,20.525965f,10.555583f,19.711868f,12.0f,17.66f)
                curveTo(13.440874f,19.717611f,16.09274f,20.537544f,18.443523f,19.652285f)
                curveTo(20.79431f,18.767023f,22.246607f,16.401539f,21.972328f,13.904612f)
                curveTo(21.69805f,11.407682f,19.7669f,9.413858f,17.28f,9.059999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.66f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.ClubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Club: ImageVector
    @Composable get() = ClubDefinition.asImageVector()
