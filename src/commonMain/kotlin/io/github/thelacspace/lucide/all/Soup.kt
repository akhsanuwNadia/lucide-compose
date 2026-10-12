package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Soup") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.248f,3.0f)
                curveTo(11.521f,3.1f,12.056f,3.53f,11.995f,4.36f)
                curveTo(11.945f,5.19f,11.057f,5.5600004f,11.006f,6.38f)
                curveTo(10.945999f,7.16f,11.339f,7.62f,11.733f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.252f,3.0f)
                curveTo(16.52f,3.1f,17.046001f,3.53f,16.997002f,4.36f)
                curveTo(16.937002f,5.19f,16.074001f,5.5600004f,16.004002f,6.38f)
                curveTo(15.954001f,7.16f,16.342001f,7.62f,16.729002f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5f,12.0f)
                lineTo(22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                curveTo(3.711787f,12.000321f,3.437727f,12.12498f,3.2480865f,12.342012f)
                curveTo(3.058446f,12.559046f,2.9716673f,12.847347f,3.01f,13.133f)
                curveTo(3.5834498f,17.652819f,7.4440556f,21.03117f,12.0f,21.0f)
                curveTo(16.555944f,21.03117f,20.41655f,17.652819f,20.99f,13.132999f)
                curveTo(21.028332f,12.847347f,20.941553f,12.559045f,20.751913f,12.342012f)
                curveTo(20.562273f,12.12498f,20.288214f,12.000321f,20.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.252f,3.0f)
                curveTo(6.52f,3.1f,7.046f,3.53f,6.9969997f,4.36f)
                curveTo(6.937f,5.19f,6.074f,5.5600004f,6.0039997f,6.38f)
                curveTo(5.9539995f,7.16f,6.3419995f,7.62f,6.739f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
}

public val LucideIcons.All.SoupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Soup: ImageVector
    @Composable get() = SoupDefinition.asImageVector()
