package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSunRain") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.93f,4.93f)
                lineTo(6.3399997f,6.3399997f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.07f,4.93f)
                lineTo(17.66f,6.3399997f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.947f,12.65f)
                curveTo(16.198185f,11.12846f,15.552331f,9.598037f,14.287012f,8.716478f)
                curveTo(13.021693f,7.834919f,11.362296f,7.759253f,10.021999f,8.521999f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,20.0f)
                curveTo(1.7696704f,18.357962f,1.6674098f,16.130938f,2.7420812f,14.383058f)
                curveTo(3.8167524f,12.635178f,5.850191f,11.721272f,7.8707666f,12.078031f)
                curveTo(9.891342f,12.434788f,11.488866f,13.989783f,11.9f,16.0f)
                lineTo(13.0f,16.0f)
                curveTo(14.245733f,15.99817f,15.362979f,16.76639f,15.807193f,17.930231f)
                curveTo(16.251408f,19.094072f,15.930149f,20.41134f,15.0f,21.24f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                lineTo(11.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,19.0f)
                lineTo(7.0f,21.0f)
            }
}

public val LucideIcons.All.CloudSunRainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSunRain: ImageVector
    @Composable get() = CloudSunRainDefinition.asImageVector()
