package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Magnet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.352f,10.648f)
                curveTo(1.8815035f,11.1185665f,1.8815035f,11.881433f,2.352f,12.351999f)
                lineTo(4.648f,14.647999f)
                curveTo(5.118567f,15.118496f,5.8814325f,15.118496f,6.3519998f,14.647999f)
                lineTo(12.381f,8.6189995f)
                curveTo(12.916092f,8.0791f,13.6991625f,7.8667717f,14.433696f,8.062416f)
                curveTo(15.16823f,8.258061f,15.741938f,8.831769f,15.937583f,9.566303f)
                curveTo(16.133226f,10.300837f,15.920899f,11.083907f,15.381f,11.6189995f)
                lineTo(9.351999f,17.647999f)
                curveTo(8.881502f,18.118567f,8.881502f,18.881432f,9.351999f,19.352f)
                lineTo(11.647999f,21.647999f)
                curveTo(12.1185665f,22.118496f,12.881432f,22.118496f,13.351999f,21.647999f)
                lineTo(19.717f,15.280998f)
                curveTo(22.731146f,12.239218f,22.719728f,7.333263f,19.69146f,4.3055434f)
                curveTo(16.663189f,1.2778239f,11.757232f,1.2673002f,8.716f,4.282f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(9.0f,12.0f)
            }
}

public val LucideIcons.All.MagnetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Magnet: ImageVector
    @Composable get() = MagnetDefinition.asImageVector()
