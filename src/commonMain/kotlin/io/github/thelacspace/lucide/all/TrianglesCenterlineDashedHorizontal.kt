package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.298f,20.288f)
                curveTo(7.0091457f,20.57287f,6.921026f,21.004028f,7.0749426f,21.37939f)
                curveTo(7.228859f,21.754753f,7.5943065f,21.999928f,8.0f,22.0f)
                lineTo(16.0f,22.0f)
                curveTo(16.405876f,22.000332f,16.771694f,21.755306f,16.925867f,21.379852f)
                curveTo(17.08004f,21.004398f,16.991983f,20.572998f,16.703f,20.288f)
                lineTo(12.711999f,16.298f)
                curveTo(12.524213f,16.10732f,12.267832f,15.999867f,12.000208f,15.9996805f)
                curveTo(11.732584f,15.999493f,11.476052f,16.106585f,11.287999f,16.297f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.298f,3.712f)
                curveTo(7.0091457f,3.42713f,6.921026f,2.9959724f,7.0749426f,2.6206095f)
                curveTo(7.228859f,2.245247f,7.5943065f,2.0000727f,8.0f,2.0f)
                lineTo(16.0f,2.0f)
                curveTo(16.405876f,1.9996673f,16.771694f,2.244693f,16.925867f,2.6201472f)
                curveTo(17.08004f,2.9956014f,16.991983f,3.4270024f,16.703f,3.712f)
                lineTo(12.711999f,7.7019997f)
                curveTo(12.524213f,7.8926797f,12.267832f,8.000133f,12.000208f,8.00032f)
                curveTo(11.732585f,8.000508f,11.476052f,7.8934155f,11.287999f,7.7029996f)
                close()
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedHorizontal: ImageVector
    @Composable get() = TrianglesCenterlineDashedHorizontalDefinition.asImageVector()
