package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Panda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25f,17.25f)
                lineTo(12.75f,17.25f)
                lineTo(12.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(17.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.902f,6.599f)
                curveTo(17.742785f,6.4250455f,17.575954f,6.258216f,17.402f,6.099f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.5f)
                curveTo(2.0f,19.47f,6.48f,22.0f,12.0f,22.0f)
                curveTo(17.52f,22.0f,22.0f,19.47f,22.0f,14.5f)
                curveTo(21.982817f,12.805871f,21.53549f,11.143881f,20.7f,9.67f)
                curveTo(21.912676f,8.4355f,22.310028f,6.6149845f,21.722025f,4.9874635f)
                curveTo(21.134024f,3.3599424f,19.664848f,2.2137783f,17.943172f,2.039422f)
                curveTo(16.221495f,1.8650658f,14.55236f,2.6934097f,13.650001f,4.17f)
                curveTo(12.5619545f,3.9406595f,11.438046f,3.9406595f,10.35f,4.17f)
                curveTo(9.453491f,2.6804097f,7.77911f,1.8405036f,6.04908f,2.0125642f)
                curveTo(4.31905f,2.184625f,2.8428986f,3.3378685f,2.2573442f,4.974858f)
                curveTo(1.6717899f,6.6118474f,2.0815969f,8.439702f,3.3100004f,9.67f)
                curveTo(2.4710178f,11.142946f,2.0202353f,12.804992f,2.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.099f,6.599f)
                curveTo(6.258216f,6.4250455f,6.4250455f,6.258216f,6.599f,6.099f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(7.0f,14.0f)
            }
}

public val LucideIcons.All.PandaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Panda: ImageVector
    @Composable get() = PandaDefinition.asImageVector()
