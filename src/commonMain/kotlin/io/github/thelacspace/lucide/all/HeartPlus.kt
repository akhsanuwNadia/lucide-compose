package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HeartPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.479f,19.374f)
                lineTo(13.508f,20.313f)
                curveTo(13.131067f,20.745916f,12.586294f,20.99601f,12.012289f,20.999643f)
                curveTo(11.438283f,21.003279f,10.890386f,20.760107f,10.508f,20.331999f)
                lineTo(5.0f,15.0f)
                curveTo(3.5f,13.5f,2.0f,11.8f,2.0f,9.5f)
                curveTo(2.000042f,7.2219462f,3.404444f,5.1796904f,5.5316086f,4.3643994f)
                curveTo(7.6587734f,3.549108f,10.068389f,4.1295424f,11.591f,5.824f)
                curveTo(11.69689f,5.9372215f,11.844977f,6.001483f,12.0f,6.001483f)
                curveTo(12.155022f,6.001483f,12.303109f,5.9372215f,12.408999f,5.824f)
                curveTo(13.927117f,4.1182027f,16.342613f,3.5302377f,18.474874f,4.347482f)
                curveTo(20.607136f,5.1647267f,22.010878f,7.216514f,22.0f,9.5f)
                curveTo(21.99969f,10.0046625f,21.925917f,10.506592f,21.781f,10.99f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,15.0f)
                lineTo(21.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.0f,18.0f)
            }
}

public val LucideIcons.All.HeartPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HeartPlus: ImageVector
    @Composable get() = HeartPlusDefinition.asImageVector()
