package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cookie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,17.0f)
                lineTo(11.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.496f,2.0f)
                curveTo(11.820001f,1.984f,12.054f,2.292f,12.025001f,2.615f)
                curveTo(11.914989f,3.7801814f,12.320799f,4.935093f,13.13548f,5.775358f)
                curveTo(13.95016f,6.6156235f,15.091975f,7.0569406f,16.26f,6.983f)
                curveTo(16.464663f,6.9696374f,16.665167f,7.045055f,16.810287f,7.1899853f)
                curveTo(16.95541f,7.3349156f,17.031092f,7.5353203f,17.018f,7.74f)
                curveTo(16.943527f,8.907979f,17.384312f,10.049985f,18.22419f,10.865048f)
                curveTo(19.06407f,11.680111f,20.218777f,12.086458f,21.383999f,11.976999f)
                curveTo(21.706999f,11.947f,22.013998f,12.181f,21.998f,12.504f)
                curveTo(21.873182f,14.978181f,20.834429f,17.317959f,19.083f,19.07f)
                curveTo(16.55879f,21.617067f,12.864692f,22.618853f,9.399497f,21.696022f)
                curveTo(5.934302f,20.773191f,3.2277377f,18.066818f,2.304662f,14.601689f)
                curveTo(1.3815862f,11.1365595f,2.3831098f,7.44239f,4.93f,4.918f)
                curveTo(6.6815753f,3.1654692f,9.021409f,2.1256223f,11.496f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(16.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                lineTo(16.01f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,4.0f)
                lineTo(21.01f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(21.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,14.0f)
                lineTo(7.01f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,8.0f)
                lineTo(9.01f,8.0f)
            }
}

public val LucideIcons.All.CookieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cookie: ImageVector
    @Composable get() = CookieDefinition.asImageVector()
