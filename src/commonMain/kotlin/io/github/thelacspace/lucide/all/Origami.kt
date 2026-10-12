package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Origami") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,4.0f)
                curveTo(12.0f,3.4477153f,12.447715f,3.0f,13.0f,3.0f)
                lineTo(19.297f,3.0f)
                curveTo(19.71539f,3.0000377f,20.089525f,3.2605336f,20.234743f,3.652911f)
                curveTo(20.379961f,4.045288f,20.265558f,4.4865913f,19.948002f,4.759f)
                lineTo(15.252002f,8.784f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,21.0f)
                lineTo(4.586f,13.586f)
                curveTo(4.2109013f,13.211015f,4.000113f,12.70239f,4.0f,12.172f)
                lineTo(4.0f,6.415f)
                curveTo(4.0020185f,6.011546f,4.2458158f,5.6486583f,4.6185675f,5.494273f)
                curveTo(4.9913197f,5.339888f,5.4203057f,5.4241247f,5.707f,5.708f)
                lineTo(20.0f,20.009f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.214f,3.381f)
                lineTo(20.627998f,18.347f)
                curveTo(20.848043f,18.738792f,20.779732f,19.229248f,20.460999f,19.546f)
                lineTo(19.293f,20.709f)
                curveTo(19.105425f,20.89557f,18.85156f,21.00021f,18.587f,21.0f)
                lineTo(6.351f,21.0f)
                curveTo(6.1238394f,21.000107f,5.903412f,20.922869f,5.726f,20.781f)
                lineTo(3.25f,18.8f)
                curveTo(2.917343f,18.534006f,2.7896755f,18.086496f,2.9319155f,17.685022f)
                curveTo(3.0741556f,17.28355f,3.4550831f,17.016232f,3.881f,17.019f)
                lineTo(8.046f,17.046f)
            }
}

public val LucideIcons.All.OrigamiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Origami: ImageVector
    @Composable get() = OrigamiDefinition.asImageVector()
