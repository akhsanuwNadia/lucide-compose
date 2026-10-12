package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Landmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,18.0f)
                lineTo(10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.119f,2.205f)
                curveTo(11.674689f,1.9323401f,12.325312f,1.9323401f,12.8810005f,2.205f)
                lineTo(20.721f,6.0509996f)
                curveTo(20.930082f,6.1534424f,21.040783f,6.386643f,20.987976f,6.613405f)
                curveTo(20.935167f,6.8401675f,20.73283f,7.0004683f,20.5f,7.0f)
                lineTo(3.5f,7.0f)
                curveTo(3.2673583f,7.000001f,3.0654535f,6.8395486f,3.0129151f,6.612917f)
                curveTo(2.9603767f,6.3862853f,3.0710878f,6.1533613f,3.28f,6.051f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                lineTo(14.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,22.0f)
                lineTo(21.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.0f,11.0f)
            }
}

public val LucideIcons.All.LandmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Landmark: ImageVector
    @Composable get() = LandmarkDefinition.asImageVector()
