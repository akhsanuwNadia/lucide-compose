package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,6.0f)
                lineTo(12.0f,13.750999f)
                curveTo(11.999828f,13.847373f,12.055066f,13.935263f,12.141979f,13.976904f)
                curveTo(12.228891f,14.018545f,12.332001f,14.006521f,12.407f,13.945999f)
                lineTo(14.686999f,12.1119995f)
                curveTo(14.870038f,11.964679f,15.13096f,11.964679f,15.313999f,12.1119995f)
                lineTo(17.594f,13.945999f)
                curveTo(17.669014f,14.005901f,17.771704f,14.01756f,17.858236f,13.975998f)
                curveTo(17.94477f,13.934437f,17.999863f,13.846996f,18.0f,13.750999f)
                lineTo(18.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,6.8954306f,21.10457f,6.0f,20.0f,6.0f)
                lineTo(12.1f,6.0f)
                curveTo(11.420333f,6.006664f,10.783802f,5.667683f,10.41f,5.1f)
                lineTo(9.6f,3.9f)
                curveTo(9.230078f,3.3382795f,8.602587f,3.0001106f,7.93f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                close()
            }
}

public val LucideIcons.All.FolderBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderBookmark: ImageVector
    @Composable get() = FolderBookmarkDefinition.asImageVector()
