package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volume2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,4.702f)
                curveTo(10.999588f,4.417171f,10.827826f,4.1605706f,10.564654f,4.051627f)
                curveTo(10.301483f,3.9426832f,9.9986105f,4.002801f,9.797f,4.204f)
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
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                curveTo(17.333334f,10.777778f,17.333334f,13.222222f,16.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.364f,18.364f)
                curveTo(21.051851f,16.67617f,22.000078f,14.386968f,22.000078f,12.0f)
                curveTo(22.000078f,9.613033f,21.051851f,7.323831f,19.364f,5.6360006f)
            }
}

public val LucideIcons.All.Volume2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volume2: ImageVector
    @Composable get() = Volume2Definition.asImageVector()
