package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Layers") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.83f,2.18f)
                curveTo(12.302794f,1.9395239f,11.697206f,1.9395239f,11.17f,2.18f)
                lineTo(2.6f,6.08f)
                curveTo(2.237428f,6.23987f,2.0034537f,6.5987463f,2.0034537f,6.995f)
                curveTo(2.0034537f,7.3912535f,2.237428f,7.7501297f,2.6f,7.91f)
                lineTo(11.18f,11.82f)
                curveTo(11.707206f,12.060476f,12.312795f,12.060476f,12.84f,11.82f)
                lineTo(21.42f,7.9199996f)
                curveTo(21.782572f,7.7601295f,22.016546f,7.401253f,22.016546f,7.0049996f)
                curveTo(22.016546f,6.608746f,21.782572f,6.24987f,21.42f,6.0899997f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9990336f,12.390571f,2.225546f,12.745961f,2.58f,12.91f)
                lineTo(11.18f,16.82f)
                curveTo(11.704372f,17.057446f,12.305628f,17.057446f,12.83f,16.82f)
                lineTo(21.41f,12.92f)
                curveTo(21.771677f,12.757434f,22.003132f,12.396521f,22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                curveTo(1.9990336f,17.390572f,2.225546f,17.74596f,2.58f,17.91f)
                lineTo(11.18f,21.82f)
                curveTo(11.704372f,22.057446f,12.305628f,22.057446f,12.83f,21.82f)
                lineTo(21.41f,17.92f)
                curveTo(21.771677f,17.757435f,22.003132f,17.39652f,22.0f,17.0f)
            }
}

public val LucideIcons.All.LayersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Layers: ImageVector
    @Composable get() = LayersDefinition.asImageVector()
