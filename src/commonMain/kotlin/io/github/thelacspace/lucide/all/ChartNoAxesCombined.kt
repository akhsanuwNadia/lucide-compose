package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNoAxesCombined") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,16.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.639f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,10.656f)
                lineTo(20.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,3.0f)
                lineTo(13.354f,11.646f)
                curveTo(13.260196f,11.740042f,13.132828f,11.792893f,13.0f,11.792893f)
                curveTo(12.867172f,11.792893f,12.739804f,11.740042f,12.646f,11.646f)
                lineTo(9.354f,8.354f)
                curveTo(9.158751f,8.15881f,8.84225f,8.15881f,8.647f,8.354f)
                lineTo(2.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.463f)
                lineTo(4.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,14.656f)
                lineTo(8.0f,21.0f)
            }
}

public val LucideIcons.All.ChartNoAxesCombinedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNoAxesCombined: ImageVector
    @Composable get() = ChartNoAxesCombinedDefinition.asImageVector()
