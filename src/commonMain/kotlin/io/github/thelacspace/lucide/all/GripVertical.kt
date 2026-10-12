package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GripVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                curveTo(7.9983974f,12.358331f,8.188645f,12.69013f,8.498705f,12.86976f)
                curveTo(8.8087635f,13.04939f,9.1912365f,13.04939f,9.501295f,12.86976f)
                curveTo(9.811355f,12.69013f,10.001602f,12.358331f,10.0f,12.0f)
                curveTo(10.001602f,11.641669f,9.811355f,11.30987f,9.501295f,11.13024f)
                curveTo(9.1912365f,10.95061f,8.8087635f,10.95061f,8.498705f,11.13024f)
                curveTo(8.188645f,11.30987f,7.9983974f,11.641669f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,5.0f)
                curveTo(7.9983974f,5.3583307f,8.188645f,5.69013f,8.498705f,5.86976f)
                curveTo(8.8087635f,6.0493894f,9.1912365f,6.0493894f,9.501295f,5.86976f)
                curveTo(9.811355f,5.69013f,10.001602f,5.3583307f,10.0f,5.0f)
                curveTo(10.001602f,4.6416693f,9.811355f,4.30987f,9.501295f,4.13024f)
                curveTo(9.1912365f,3.9506104f,8.8087635f,3.9506104f,8.498705f,4.13024f)
                curveTo(8.188645f,4.30987f,7.9983974f,4.6416693f,8.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                curveTo(7.9983974f,19.358332f,8.188645f,19.69013f,8.498705f,19.86976f)
                curveTo(8.8087635f,20.049389f,9.1912365f,20.049389f,9.501295f,19.86976f)
                curveTo(9.811355f,19.69013f,10.001602f,19.358332f,10.0f,19.0f)
                curveTo(10.001602f,18.641668f,9.811355f,18.30987f,9.501295f,18.13024f)
                curveTo(9.1912365f,17.950611f,8.8087635f,17.950611f,8.498705f,18.13024f)
                curveTo(8.188645f,18.30987f,7.9983974f,18.641668f,8.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.998398f,12.358331f,14.188645f,12.69013f,14.498705f,12.86976f)
                curveTo(14.8087635f,13.04939f,15.1912365f,13.04939f,15.501295f,12.86976f)
                curveTo(15.811355f,12.69013f,16.001602f,12.358331f,16.0f,12.0f)
                curveTo(16.001602f,11.641669f,15.811355f,11.30987f,15.501295f,11.13024f)
                curveTo(15.1912365f,10.95061f,14.8087635f,10.95061f,14.498705f,11.13024f)
                curveTo(14.188645f,11.30987f,13.998398f,11.641669f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                curveTo(13.998398f,5.3583307f,14.188645f,5.69013f,14.498705f,5.86976f)
                curveTo(14.8087635f,6.0493894f,15.1912365f,6.0493894f,15.501295f,5.86976f)
                curveTo(15.811355f,5.69013f,16.001602f,5.3583307f,16.0f,5.0f)
                curveTo(16.001602f,4.6416693f,15.811355f,4.30987f,15.501295f,4.13024f)
                curveTo(15.1912365f,3.9506104f,14.8087635f,3.9506104f,14.498705f,4.13024f)
                curveTo(14.188645f,4.30987f,13.998398f,4.6416693f,14.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,19.0f)
                curveTo(13.998398f,19.358332f,14.188645f,19.69013f,14.498705f,19.86976f)
                curveTo(14.8087635f,20.049389f,15.1912365f,20.049389f,15.501295f,19.86976f)
                curveTo(15.811355f,19.69013f,16.001602f,19.358332f,16.0f,19.0f)
                curveTo(16.001602f,18.641668f,15.811355f,18.30987f,15.501295f,18.13024f)
                curveTo(15.1912365f,17.950611f,14.8087635f,17.950611f,14.498705f,18.13024f)
                curveTo(14.188645f,18.30987f,13.998398f,18.641668f,14.0f,19.0f)
            }
}

public val LucideIcons.All.GripVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GripVertical: ImageVector
    @Composable get() = GripVerticalDefinition.asImageVector()
