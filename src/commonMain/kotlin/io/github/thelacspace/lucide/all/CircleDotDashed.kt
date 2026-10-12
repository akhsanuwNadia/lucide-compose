package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDotDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f,2.18f)
                curveTo(11.3548565f,1.935377f,12.645144f,1.935377f,13.900001f,2.18f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.6f,3.71f)
                curveTo(18.662271f,4.428255f,19.575693f,5.3450713f,20.29f,6.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.82f,10.1f)
                curveTo(22.064623f,11.3548565f,22.064623f,12.645144f,21.82f,13.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.29f,17.6f)
                curveTo(19.571745f,18.662271f,18.65493f,19.575693f,17.59f,20.29f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f,21.82f)
                curveTo(12.64512f,22.064371f,11.354879f,22.064371f,10.099999f,21.82f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.4f,20.29f)
                curveTo(5.337729f,19.571745f,4.4243083f,18.654928f,3.71f,17.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.18f,13.9f)
                curveTo(1.935377f,12.6451435f,1.935377f,11.354856f,2.18f,10.099999f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.71f,6.4f)
                curveTo(4.428255f,5.337729f,5.3450713f,4.4243083f,6.41f,3.71f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
}

public val LucideIcons.All.CircleDotDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDotDashed: ImageVector
    @Composable get() = CircleDotDashedDefinition.asImageVector()
