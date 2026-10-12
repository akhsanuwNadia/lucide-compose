package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.268f,21.0f)
                curveTo(10.625278f,21.618752f,11.285504f,21.999912f,12.0f,21.999912f)
                curveTo(12.714495f,21.999912f,13.374721f,21.618752f,13.731999f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(17.0f,10.0f)
                lineTo(21.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.8607f,4.4824f)
                curveTo(15.335566f,2.3749404f,12.626106f,1.4903713f,10.15125f,2.2919362f)
                curveTo(7.676393f,3.093501f,6.000005f,5.398573f,6.0f,8.0f)
                curveTo(6.0f,12.499f,4.589f,13.956f,3.262f,15.326f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.262f,15.326f)
                curveTo(2.995089f,15.618546f,2.925957f,16.041039f,3.0857067f,16.403399f)
                curveTo(3.2454565f,16.765757f,3.6039896f,16.99971f,4.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(20.395962f,17.000141f,20.754717f,16.766636f,20.914888f,16.404514f)
                curveTo(21.075062f,16.042395f,21.006483f,15.61987f,20.74f,15.327f)
                curveTo(20.209f,14.779f,19.665f,14.218f,19.203f,13.454f)
            }
}

public val LucideIcons.All.BellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BellCheck: ImageVector
    @Composable get() = BellCheckDefinition.asImageVector()
