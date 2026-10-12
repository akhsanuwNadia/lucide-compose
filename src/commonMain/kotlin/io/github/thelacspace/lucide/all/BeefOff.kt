package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeefOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.771f,6.109f)
                curveTo(12.654424f,5.839894f,13.614247f,6.079724f,14.267262f,6.732738f)
                curveTo(14.920277f,7.385752f,15.160107f,8.345576f,14.891f,9.229f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.852f,12.185f)
                curveTo(19.625f,9.603633f,19.305326f,6.125018f,17.091555f,3.9100225f)
                curveTo(14.877785f,1.6950269f,11.399347f,1.3734287f,8.816999f,3.1450005f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.013f,18.013f)
                curveTo(15.029f,20.349f,10.831f,22.0f,7.0f,22.0f)
                curveTo(5.864501f,21.998447f,4.827189f,21.355934f,4.3199997f,20.34f)
                lineTo(2.4f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5f,6.0f)
                lineTo(20.69f,10.5f)
                curveTo(21.156855f,11.935811f,21.10769f,13.489574f,20.551f,14.893f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.355f,6.37f)
                curveTo(6.328677f,6.446229f,6.3036733f,6.522907f,6.28f,6.6f)
                curveTo(5.1800003f,9.73f,5.5f,10.5f,3.1000001f,12.68f)
                curveTo(2.1201034f,13.483346f,1.7505984f,14.8157215f,2.1767728f,16.00901f)
                curveTo(2.6029475f,17.2023f,3.7328925f,17.999155f,5.0f,18.0f)
                curveTo(8.356f,18.0f,11.993f,16.733f,14.85f,14.849f)
            }
}

public val LucideIcons.All.BeefOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeefOff: ImageVector
    @Composable get() = BeefOffDefinition.asImageVector()
