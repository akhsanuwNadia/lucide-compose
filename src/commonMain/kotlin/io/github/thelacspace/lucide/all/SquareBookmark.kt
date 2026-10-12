package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,3.0f)
                lineTo(11.0f,10.750999f)
                curveTo(10.999828f,10.847373f,11.055066f,10.935263f,11.141979f,10.976904f)
                curveTo(11.228891f,11.018545f,11.332001f,11.006521f,11.407f,10.945999f)
                lineTo(13.686999f,9.1119995f)
                curveTo(13.870038f,8.964679f,14.13096f,8.964679f,14.313999f,9.1119995f)
                lineTo(16.594f,10.945999f)
                curveTo(16.669014f,11.005901f,16.771704f,11.01756f,16.858236f,10.975998f)
                curveTo(16.94477f,10.934437f,16.999863f,10.846996f,17.0f,10.750999f)
                lineTo(17.0f,3.0f)
            }
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
}

public val LucideIcons.All.SquareBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBookmark: ImageVector
    @Composable get() = SquareBookmarkDefinition.asImageVector()
