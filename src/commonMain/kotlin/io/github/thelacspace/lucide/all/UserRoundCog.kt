package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.305f,19.53f)
                lineTo(15.228001f,19.148f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.228f,16.852f)
                lineTo(14.304999f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,15.228f)
                lineTo(16.469f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.852f,20.772f)
                lineTo(16.469f,21.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.148f,15.228f)
                lineTo(19.531f,14.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.53f,21.696f)
                lineTo(19.148f,20.772f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(2.0002356f,18.446352f,3.2195742f,16.04625f,5.2818236f,14.540179f)
                curveTo(7.344073f,13.034109f,10.001414f,12.603052f,12.434f,13.38f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,16.852f)
                lineTo(21.696f,16.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.772f,19.148f)
                lineTo(21.696f,19.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                curveTo(4.991987f,9.791655f,5.943226f,11.450651f,7.4935226f,12.3488f)
                curveTo(9.043819f,13.246948f,10.956181f,13.246948f,12.506477f,12.3488f)
                curveTo(14.056774f,11.450651f,15.008013f,9.791655f,15.0f,8.0f)
                curveTo(15.008013f,6.2083454f,14.056774f,4.549349f,12.506477f,3.6512005f)
                curveTo(10.956181f,2.7530522f,9.043819f,2.7530522f,7.4935226f,3.6512005f)
                curveTo(5.943226f,4.549349f,4.991987f,6.2083454f,5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
}

public val LucideIcons.All.UserRoundCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundCog: ImageVector
    @Composable get() = UserRoundCogDefinition.asImageVector()
