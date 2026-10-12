package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GripHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,9.0f)
                curveTo(10.998398f,9.358331f,11.188645f,9.69013f,11.498705f,9.86976f)
                curveTo(11.8087635f,10.04939f,12.1912365f,10.04939f,12.501295f,9.86976f)
                curveTo(12.811355f,9.69013f,13.001602f,9.358331f,13.0f,9.0f)
                curveTo(13.001602f,8.641669f,12.811355f,8.30987f,12.501295f,8.13024f)
                curveTo(12.1912365f,7.9506106f,11.8087635f,7.9506106f,11.498705f,8.13024f)
                curveTo(11.188645f,8.30987f,10.998398f,8.641669f,11.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                curveTo(17.998398f,9.358331f,18.188644f,9.69013f,18.498705f,9.86976f)
                curveTo(18.808764f,10.04939f,19.191236f,10.04939f,19.501295f,9.86976f)
                curveTo(19.811356f,9.69013f,20.001602f,9.358331f,20.0f,9.0f)
                curveTo(20.001602f,8.641669f,19.811356f,8.30987f,19.501295f,8.13024f)
                curveTo(19.191236f,7.9506106f,18.808764f,7.9506106f,18.498705f,8.13024f)
                curveTo(18.188644f,8.30987f,17.998398f,8.641669f,18.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                curveTo(3.9983976f,9.358331f,4.1886454f,9.69013f,4.4987044f,9.86976f)
                curveTo(4.808764f,10.04939f,5.191236f,10.04939f,5.5012956f,9.86976f)
                curveTo(5.8113546f,9.69013f,6.0016026f,9.358331f,6.0f,9.0f)
                curveTo(6.0016026f,8.641669f,5.8113546f,8.30987f,5.5012956f,8.13024f)
                curveTo(5.191236f,7.9506106f,4.808764f,7.9506106f,4.4987044f,8.13024f)
                curveTo(4.1886454f,8.30987f,3.9983976f,8.641669f,4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,15.0f)
                curveTo(10.998398f,15.358331f,11.188645f,15.69013f,11.498705f,15.86976f)
                curveTo(11.8087635f,16.049389f,12.1912365f,16.049389f,12.501295f,15.86976f)
                curveTo(12.811355f,15.69013f,13.001602f,15.358331f,13.0f,15.0f)
                curveTo(13.001602f,14.641669f,12.811355f,14.30987f,12.501295f,14.13024f)
                curveTo(12.1912365f,13.95061f,11.8087635f,13.95061f,11.498705f,14.13024f)
                curveTo(11.188645f,14.30987f,10.998398f,14.641669f,11.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                curveTo(17.998398f,15.358331f,18.188644f,15.69013f,18.498705f,15.86976f)
                curveTo(18.808764f,16.049389f,19.191236f,16.049389f,19.501295f,15.86976f)
                curveTo(19.811356f,15.69013f,20.001602f,15.358331f,20.0f,15.0f)
                curveTo(20.001602f,14.641669f,19.811356f,14.30987f,19.501295f,14.13024f)
                curveTo(19.191236f,13.95061f,18.808764f,13.95061f,18.498705f,14.13024f)
                curveTo(18.188644f,14.30987f,17.998398f,14.641669f,18.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,15.0f)
                curveTo(3.9983976f,15.358331f,4.1886454f,15.69013f,4.4987044f,15.86976f)
                curveTo(4.808764f,16.049389f,5.191236f,16.049389f,5.5012956f,15.86976f)
                curveTo(5.8113546f,15.69013f,6.0016026f,15.358331f,6.0f,15.0f)
                curveTo(6.0016026f,14.641669f,5.8113546f,14.30987f,5.5012956f,14.13024f)
                curveTo(5.191236f,13.95061f,4.808764f,13.95061f,4.4987044f,14.13024f)
                curveTo(4.1886454f,14.30987f,3.9983976f,14.641669f,4.0f,15.0f)
            }
}

public val LucideIcons.All.GripHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GripHorizontal: ImageVector
    @Composable get() = GripHorizontalDefinition.asImageVector()
