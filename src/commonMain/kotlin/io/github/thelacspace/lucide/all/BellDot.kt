package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f,21.0f)
                curveTo(10.625278f,21.618752f,11.285504f,21.999912f,12.0f,21.999912f)
                curveTo(12.714495f,21.999912f,13.374721f,21.618752f,13.731999f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.68f,2.009f)
                curveTo(8.495356f,2.1790898f,6.000245f,4.810817f,6.0f,8.0f)
                curveTo(6.0f,12.499001f,4.5889997f,13.955999f,3.262f,15.326f)
                curveTo(2.995089f,15.618546f,2.925957f,16.041039f,3.0857067f,16.403399f)
                curveTo(3.2454565f,16.765757f,3.6039896f,16.99971f,4.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(20.395962f,17.000141f,20.754717f,16.766636f,20.914888f,16.404514f)
                curveTo(21.075062f,16.042395f,21.006483f,15.61987f,20.74f,15.327f)
                curveTo(19.916f,14.476999f,19.062f,13.596f,18.529999f,11.979f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                curveTo(14.995193f,6.0749927f,15.565935f,7.0703907f,16.496113f,7.6092796f)
                curveTo(17.426292f,8.148169f,18.573708f,8.148169f,19.503887f,7.6092796f)
                curveTo(20.434065f,7.0703907f,21.004808f,6.0749927f,21.0f,5.0f)
                curveTo(21.004808f,3.925007f,20.434065f,2.9296093f,19.503887f,2.3907204f)
                curveTo(18.573708f,1.8518313f,17.426292f,1.8518313f,16.496113f,2.3907204f)
                curveTo(15.565935f,2.9296093f,14.995193f,3.925007f,15.0f,5.0f)
            }
}

public val LucideIcons.All.BellDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellDot: ImageVector
    @Composable get() = BellDotDefinition.asImageVector()
