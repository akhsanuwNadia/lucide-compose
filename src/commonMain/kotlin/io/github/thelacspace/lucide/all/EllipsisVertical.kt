package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EllipsisVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,5.0f)
                curveTo(10.998398f,5.3583307f,11.188645f,5.69013f,11.498705f,5.86976f)
                curveTo(11.8087635f,6.0493894f,12.1912365f,6.0493894f,12.501295f,5.86976f)
                curveTo(12.811355f,5.69013f,13.001602f,5.3583307f,13.0f,5.0f)
                curveTo(13.001602f,4.6416693f,12.811355f,4.30987f,12.501295f,4.13024f)
                curveTo(12.1912365f,3.9506104f,11.8087635f,3.9506104f,11.498705f,4.13024f)
                curveTo(11.188645f,4.30987f,10.998398f,4.6416693f,11.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                curveTo(10.998398f,19.358332f,11.188645f,19.69013f,11.498705f,19.86976f)
                curveTo(11.8087635f,20.049389f,12.1912365f,20.049389f,12.501295f,19.86976f)
                curveTo(12.811355f,19.69013f,13.001602f,19.358332f,13.0f,19.0f)
                curveTo(13.001602f,18.641668f,12.811355f,18.30987f,12.501295f,18.13024f)
                curveTo(12.1912365f,17.950611f,11.8087635f,17.950611f,11.498705f,18.13024f)
                curveTo(11.188645f,18.30987f,10.998398f,18.641668f,11.0f,19.0f)
            }
}

public val LucideIcons.All.EllipsisVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EllipsisVertical: ImageVector
    @Composable get() = EllipsisVerticalDefinition.asImageVector()
