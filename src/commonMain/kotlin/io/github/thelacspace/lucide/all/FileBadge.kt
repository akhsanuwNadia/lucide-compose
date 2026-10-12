package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBadge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,7.3f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.69f,16.479f)
                lineTo(8.98f,21.359001f)
                curveTo(9.035897f,21.54889f,8.974511f,21.753878f,8.823443f,21.881786f)
                curveTo(8.672376f,22.009697f,8.4600725f,22.036444f,8.282f,21.95f)
                lineTo(6.4389997f,21.101002f)
                curveTo(6.161552f,20.965641f,5.8371387f,20.96601f,5.5599995f,21.102001f)
                lineTo(3.7139995f,21.952002f)
                curveTo(3.5360544f,22.035337f,3.325795f,22.006721f,3.1765916f,21.878864f)
                curveTo(3.0273883f,21.751007f,2.9669046f,21.547611f,3.0219996f,21.359001f)
                lineTo(4.3119993f,16.479f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                curveTo(2.9951925f,15.074993f,3.5659356f,16.07039f,4.496114f,16.60928f)
                curveTo(5.426292f,17.148169f,6.573708f,17.148169f,7.503886f,16.60928f)
                curveTo(8.434065f,16.07039f,9.004807f,15.074993f,9.0f,14.0f)
                curveTo(9.004807f,12.925007f,8.434065f,11.929609f,7.503886f,11.39072f)
                curveTo(6.573708f,10.851831f,5.426292f,10.851831f,4.496114f,11.39072f)
                curveTo(3.5659356f,11.929609f,2.9951925f,12.925007f,3.0f,14.0f)
            }
}

public val LucideIcons.All.FileBadgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBadge: ImageVector
    @Composable get() = FileBadgeDefinition.asImageVector()
