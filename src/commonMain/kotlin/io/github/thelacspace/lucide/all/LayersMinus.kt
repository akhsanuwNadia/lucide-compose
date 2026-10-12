package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersMinus") { strokeWidth ->
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
                curveTo(21.783794f,7.7606697f,22.018822f,7.401155f,22.018822f,7.0039997f)
                curveTo(22.018822f,6.606844f,21.783794f,6.247329f,21.42f,6.0879993f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,17.0f)
                lineTo(22.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.003f,11.995f)
                curveTo(2.0030792f,12.391361f,2.2372503f,12.750266f,2.6f,12.91f)
                lineTo(11.18f,16.82f)
                curveTo(11.44059f,16.938728f,11.723638f,17.000113f,12.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.003f,16.995f)
                curveTo(2.003079f,17.391361f,2.23725f,17.750269f,2.6f,17.910002f)
                lineTo(11.18f,21.820002f)
                curveTo(11.44059f,21.93873f,11.723638f,22.000114f,12.01f,22.000002f)
                curveTo(12.296363f,22.000114f,12.579411f,21.93873f,12.84f,21.820002f)
                lineTo(14.95f,20.860003f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.018f,12.004f)
                curveTo(22.018143f,12.40096f,21.783472f,12.760422f,21.42f,12.92f)
                lineTo(21.243f,13.0f)
            }
}

public val LucideIcons.All.LayersMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersMinus: ImageVector
    @Composable get() = LayersMinusDefinition.asImageVector()
