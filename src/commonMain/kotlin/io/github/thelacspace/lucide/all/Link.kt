package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Link") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,13.0f)
                curveTo(10.868956f,14.161694f,12.199628f,14.8887005f,13.64665f,14.992333f)
                curveTo(15.093673f,15.095966f,16.514366f,14.566007f,17.54f,13.54f)
                lineTo(20.54f,10.54f)
                curveTo(22.43486f,8.578105f,22.40776f,5.4595776f,20.479092f,3.530909f)
                curveTo(18.550425f,1.6022407f,15.431896f,1.5751406f,13.470001f,3.4699998f)
                lineTo(11.750001f,5.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                curveTo(13.131044f,9.838307f,11.800373f,9.1112995f,10.35335f,9.007667f)
                curveTo(8.906327f,8.904034f,7.4856343f,9.433994f,6.46f,10.46f)
                lineTo(3.46f,13.46f)
                curveTo(1.5651215f,15.421892f,1.5922126f,18.540436f,3.5208888f,20.469112f)
                curveTo(5.449565f,22.397789f,8.568109f,22.42488f,10.530001f,20.53f)
                lineTo(12.240001f,18.82f)
            }
}

public val LucideIcons.All.LinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Link: ImageVector
    @Composable get() = LinkDefinition.asImageVector()
