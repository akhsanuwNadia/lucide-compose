package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,6.8954306f,21.10457f,6.0f,20.0f,6.0f)
                lineTo(12.07f,6.0f)
                curveTo(11.400962f,5.9965386f,10.7779665f,5.65877f,10.41f,5.1f)
                lineTo(9.59f,3.8999999f)
                curveTo(9.2220335f,3.3412294f,8.599038f,3.0034611f,7.93f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.1f,2.9f,20.0f,4.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,13.0f)
                curveTo(10.998398f,13.358331f,11.188645f,13.69013f,11.498705f,13.86976f)
                curveTo(11.8087635f,14.04939f,12.1912365f,14.04939f,12.501295f,13.86976f)
                curveTo(12.811355f,13.69013f,13.001602f,13.358331f,13.0f,13.0f)
                curveTo(13.001602f,12.641669f,12.811355f,12.30987f,12.501295f,12.13024f)
                curveTo(12.1912365f,11.95061f,11.8087635f,11.95061f,11.498705f,12.13024f)
                curveTo(11.188645f,12.30987f,10.998398f,12.641669f,11.0f,13.0f)
            }
}

public val LucideIcons.All.FolderDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderDot: ImageVector
    @Composable get() = FolderDotDefinition.asImageVector()
