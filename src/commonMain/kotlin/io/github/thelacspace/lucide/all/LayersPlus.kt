package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.83f,2.18f)
                curveTo(12.302794f,1.9395239f,11.697206f,1.9395239f,11.17f,2.18f)
                lineTo(2.6f,6.08f)
                curveTo(2.237428f,6.23987f,2.0034537f,6.5987463f,2.0034537f,6.995f)
                curveTo(2.0034537f,7.3912535f,2.237428f,7.7501297f,2.6f,7.91f)
                lineTo(11.18f,11.82f)
                curveTo(11.44059f,11.938728f,11.723638f,12.000112f,12.01f,12.0f)
                curveTo(12.296363f,12.000112f,12.579411f,11.938728f,12.84f,11.82f)
                lineTo(21.42f,7.9199996f)
                curveTo(21.783182f,7.7603984f,22.017681f,7.4012036f,22.017681f,7.0044994f)
                curveTo(22.017681f,6.6077957f,21.783182f,6.248601f,21.42f,6.0889997f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(19.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9990336f,12.390571f,2.225546f,12.745961f,2.58f,12.91f)
                lineTo(11.18f,16.82f)
                curveTo(11.439208f,16.937342f,11.720469f,16.998026f,12.005f,16.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                curveTo(1.9990336f,17.390572f,2.225546f,17.74596f,2.58f,17.91f)
                lineTo(11.18f,21.82f)
                curveTo(11.704372f,22.057446f,12.305628f,22.057446f,12.83f,21.82f)
                lineTo(14.946f,20.858f)
            }
}

public val LucideIcons.All.LayersPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersPlus: ImageVector
    @Composable get() = LayersPlusDefinition.asImageVector()
