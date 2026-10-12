package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ellipsis") { strokeWidth ->
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
                moveTo(18.0f,12.0f)
                curveTo(17.998398f,12.358331f,18.188644f,12.69013f,18.498705f,12.86976f)
                curveTo(18.808764f,13.04939f,19.191236f,13.04939f,19.501295f,12.86976f)
                curveTo(19.811356f,12.69013f,20.001602f,12.358331f,20.0f,12.0f)
                curveTo(20.001602f,11.641669f,19.811356f,11.30987f,19.501295f,11.13024f)
                curveTo(19.191236f,10.95061f,18.808764f,10.95061f,18.498705f,11.13024f)
                curveTo(18.188644f,11.30987f,17.998398f,11.641669f,18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.9983976f,12.358331f,4.1886454f,12.69013f,4.4987044f,12.86976f)
                curveTo(4.808764f,13.04939f,5.191236f,13.04939f,5.5012956f,12.86976f)
                curveTo(5.8113546f,12.69013f,6.0016026f,12.358331f,6.0f,12.0f)
                curveTo(6.0016026f,11.641669f,5.8113546f,11.30987f,5.5012956f,11.13024f)
                curveTo(5.191236f,10.95061f,4.808764f,10.95061f,4.4987044f,11.13024f)
                curveTo(4.1886454f,11.30987f,3.9983976f,11.641669f,4.0f,12.0f)
            }
}

public val LucideIcons.All.EllipsisDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ellipsis: ImageVector
    @Composable get() = EllipsisDefinition.asImageVector()
