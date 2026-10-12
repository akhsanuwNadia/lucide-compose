package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ALargeSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                lineTo(17.536f,8.672f)
                curveTo(17.678104f,8.261019f,18.065144f,7.9853234f,18.5f,7.9853234f)
                curveTo(18.934855f,7.9853234f,19.321894f,8.261019f,19.463999f,8.672f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.697f,14.0f)
                lineTo(21.303f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(6.039f,6.3100004f)
                curveTo(6.116658f,6.1237264f,6.298686f,6.0024004f,6.5004997f,6.0024004f)
                curveTo(6.702314f,6.0024004f,6.8843417f,6.1237264f,6.962f,6.3100004f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f,13.0f)
                lineTo(9.696f,13.0f)
            }
}

public val LucideIcons.All.ALargeSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ALargeSmall: ImageVector
    @Composable get() = ALargeSmallDefinition.asImageVector()
