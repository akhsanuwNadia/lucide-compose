package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                lineTo(18.0f,7.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,16.0f)
                lineTo(18.0f,7.0f)
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

public val LucideIcons.All.AArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AArrowUp: ImageVector
    @Composable get() = AArrowUpDefinition.asImageVector()
