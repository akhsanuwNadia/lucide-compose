package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,4.702f)
                curveTo(11.004628f,4.4147496f,10.833275f,4.153835f,10.567832f,4.0439506f)
                curveTo(10.302389f,3.9340668f,9.996757f,3.997526f,9.797f,4.204f)
                lineTo(6.413f,7.587f)
                curveTo(6.1492105f,7.8523674f,5.7901707f,8.001097f,5.416f,8.0f)
                lineTo(3.0f,8.0f)
                curveTo(2.4477153f,8.0f,2.0f,8.447715f,2.0f,9.0f)
                lineTo(2.0f,15.0f)
                curveTo(2.0f,15.552285f,2.4477153f,16.0f,3.0f,16.0f)
                lineTo(5.416f,16.0f)
                curveTo(5.7901707f,15.998903f,6.1492105f,16.147633f,6.413f,16.413f)
                lineTo(9.796f,19.797f)
                curveTo(9.995767f,20.00437f,10.302139f,20.068256f,10.568137f,19.958014f)
                curveTo(10.834136f,19.847769f,11.005492f,19.585886f,11.0f,19.298f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,14.5f)
                lineTo(21.5f,9.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,9.5f)
                lineTo(21.5f,14.5f)
            }
}

public val LucideIcons.All.VolumeXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeX: ImageVector
    @Composable get() = VolumeXDefinition.asImageVector()
