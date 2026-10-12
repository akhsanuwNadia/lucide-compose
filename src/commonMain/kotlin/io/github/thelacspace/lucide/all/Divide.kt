package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Divide") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,6.0f)
                curveTo(10.998398f,6.3583307f,11.188645f,6.69013f,11.498705f,6.86976f)
                curveTo(11.8087635f,7.0493894f,12.1912365f,7.0493894f,12.501295f,6.86976f)
                curveTo(12.811355f,6.69013f,13.001602f,6.3583307f,13.0f,6.0f)
                curveTo(13.001602f,5.6416693f,12.811355f,5.30987f,12.501295f,5.13024f)
                curveTo(12.1912365f,4.9506106f,11.8087635f,4.9506106f,11.498705f,5.13024f)
                curveTo(11.188645f,5.30987f,10.998398f,5.6416693f,11.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,12.0f)
                lineTo(19.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,18.0f)
                curveTo(10.998398f,18.358332f,11.188645f,18.69013f,11.498705f,18.86976f)
                curveTo(11.8087635f,19.049389f,12.1912365f,19.049389f,12.501295f,18.86976f)
                curveTo(12.811355f,18.69013f,13.001602f,18.358332f,13.0f,18.0f)
                curveTo(13.001602f,17.641668f,12.811355f,17.30987f,12.501295f,17.13024f)
                curveTo(12.1912365f,16.950611f,11.8087635f,16.950611f,11.498705f,17.13024f)
                curveTo(11.188645f,17.30987f,10.998398f,17.641668f,11.0f,18.0f)
            }
}

public val LucideIcons.All.DivideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Divide: ImageVector
    @Composable get() = DivideDefinition.asImageVector()
