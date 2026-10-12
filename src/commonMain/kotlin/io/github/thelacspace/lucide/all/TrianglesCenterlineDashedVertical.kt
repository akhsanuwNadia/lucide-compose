package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,14.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.288f,16.703f)
                curveTo(20.572998f,16.991983f,21.004398f,17.08004f,21.379852f,16.925867f)
                curveTo(21.755306f,16.771694f,22.000332f,16.405876f,22.0f,16.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.000334f,7.5941243f,21.755308f,7.2283053f,21.379852f,7.0741324f)
                curveTo(21.004398f,6.919959f,20.572998f,7.008016f,20.288f,7.297f)
                lineTo(16.298f,11.288f)
                curveTo(16.10732f,11.475786f,15.999867f,11.732167f,15.9996805f,11.999791f)
                curveTo(15.999493f,12.267415f,16.106585f,12.523947f,16.297f,12.712f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.712f,16.703f)
                curveTo(3.4270024f,16.991983f,2.9956014f,17.08004f,2.6201472f,16.925867f)
                curveTo(2.244693f,16.771694f,1.9996673f,16.405876f,2.0f,16.0f)
                lineTo(2.0f,8.0f)
                curveTo(1.9996668f,7.5941243f,2.2446926f,7.2283053f,2.6201468f,7.0741324f)
                curveTo(2.9956012f,6.919959f,3.4270022f,7.008016f,3.712f,7.297f)
                lineTo(7.7019997f,11.288f)
                curveTo(7.8926797f,11.475786f,8.000133f,11.732167f,8.00032f,11.999791f)
                curveTo(8.000508f,12.267414f,7.8934155f,12.523947f,7.7029996f,12.712f)
                close()
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedVertical: ImageVector
    @Composable get() = TrianglesCenterlineDashedVerticalDefinition.asImageVector()
