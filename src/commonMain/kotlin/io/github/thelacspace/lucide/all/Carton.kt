package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carton") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(13.0f,10.0f)
                curveTo(12.999702f,9.492448f,13.192386f,9.003767f,13.539f,8.633f)
                lineTo(16.0f,6.0f)
                lineTo(8.0f,6.0f)
                lineTo(5.539f,8.633f)
                curveTo(5.192386f,9.003767f,4.999702f,9.492448f,5.0f,10.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,21.10457f,5.8954306f,22.0f,7.0f,22.0f)
                lineTo(17.0f,22.0f)
                curveTo(18.10457f,22.0f,19.0f,21.10457f,19.0f,20.0f)
                lineTo(19.0f,10.0f)
                curveTo(19.000298f,9.492448f,18.807613f,9.003767f,18.461f,8.633f)
                lineTo(16.0f,6.0f)
                lineTo(16.0f,3.0f)
                curveTo(16.0f,2.4477153f,15.552285f,2.0f,15.0f,2.0f)
                lineTo(9.0f,2.0f)
                curveTo(8.447715f,2.0f,8.0f,2.4477153f,8.0f,3.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,10.0f)
                lineTo(13.0f,10.0f)
            }
}

public val LucideIcons.All.CartonDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carton: ImageVector
    @Composable get() = CartonDefinition.asImageVector()
