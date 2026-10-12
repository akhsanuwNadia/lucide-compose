package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowUpFromDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                lineTo(12.0f,2.0f)
                lineTo(19.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,21.0f)
                curveTo(10.998398f,21.358332f,11.188645f,21.69013f,11.498705f,21.86976f)
                curveTo(11.8087635f,22.049389f,12.1912365f,22.049389f,12.501295f,21.86976f)
                curveTo(12.811355f,21.69013f,13.001602f,21.358332f,13.0f,21.0f)
                curveTo(13.001602f,20.641668f,12.811355f,20.30987f,12.501295f,20.13024f)
                curveTo(12.1912365f,19.950611f,11.8087635f,19.950611f,11.498705f,20.13024f)
                curveTo(11.188645f,20.30987f,10.998398f,20.641668f,11.0f,21.0f)
            }
}

public val LucideIcons.All.ArrowUpFromDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowUpFromDot: ImageVector
    @Composable get() = ArrowUpFromDotDefinition.asImageVector()
