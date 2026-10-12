package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellRing") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f,21.0f)
                curveTo(10.625278f,21.618752f,11.285504f,21.999912f,12.0f,21.999912f)
                curveTo(12.714495f,21.999912f,13.374721f,21.618752f,13.731999f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,8.0f)
                curveTo(22.0f,5.7f,21.2f,3.6999998f,20.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.262f,15.326f)
                curveTo(2.995089f,15.618546f,2.925957f,16.041039f,3.0857067f,16.403399f)
                curveTo(3.2454565f,16.765757f,3.6039896f,16.99971f,4.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(20.395962f,17.000141f,20.754717f,16.766636f,20.914888f,16.404514f)
                curveTo(21.075062f,16.042395f,21.006483f,15.61987f,20.74f,15.327f)
                curveTo(19.41f,13.956f,18.0f,12.499f,18.0f,8.0f)
                curveTo(17.985228f,4.6967654f,15.3032675f,2.026773f,12.0f,2.026773f)
                curveTo(8.6967325f,2.026773f,6.0147724f,4.6967654f,6.0f,8.0f)
                curveTo(6.0f,12.499001f,4.5889997f,13.955999f,3.262f,15.326f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,2.0f)
                curveTo(2.8f,3.7f,2.0f,5.7f,2.0f,8.0f)
            }
}

public val LucideIcons.All.BellRingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellRing: ImageVector
    @Composable get() = BellRingDefinition.asImageVector()
