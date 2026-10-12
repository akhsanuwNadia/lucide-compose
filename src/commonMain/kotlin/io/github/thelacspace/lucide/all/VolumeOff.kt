package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                curveTo(16.504356f,9.6723385f,16.83109f,10.460969f,16.95f,11.293f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.364f,5.636f)
                curveTo(21.981417f,8.251928f,22.73084f,12.203372f,21.253f,15.596001f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.0f)
                lineTo(6.413f,7.587f)
                curveTo(6.1492105f,7.8523674f,5.7901707f,8.001097f,5.416f,8.0f)
                lineTo(3.0f,8.0f)
                curveTo(2.4477153f,8.0f,2.0f,8.447715f,2.0f,9.0f)
                lineTo(2.0f,15.0f)
                curveTo(2.0f,15.552285f,2.4477153f,16.0f,3.0f,16.0f)
                lineTo(5.416f,16.0f)
                curveTo(5.7901707f,15.998903f,6.1492105f,16.147633f,6.413f,16.413f)
                lineTo(9.796f,19.797f)
                curveTo(9.997644f,19.999044f,10.301225f,20.059553f,10.564925f,19.950262f)
                curveTo(10.828625f,19.840971f,11.000398f,19.58345f,11.0f,19.298f)
                lineTo(11.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.828f,4.172f)
                curveTo(10.024097f,3.9751523f,10.319571f,3.9160347f,10.57631f,4.0222793f)
                curveTo(10.83305f,4.128524f,11.000345f,4.3791456f,11.0f,4.657f)
                lineTo(11.0f,5.343f)
            }
}

public val LucideIcons.All.VolumeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeOff: ImageVector
    @Composable get() = VolumeOffDefinition.asImageVector()
