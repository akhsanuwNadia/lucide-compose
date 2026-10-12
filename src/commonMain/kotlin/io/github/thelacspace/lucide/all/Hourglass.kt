package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hourglass") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,22.0f)
                lineTo(19.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                lineTo(19.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,22.0f)
                lineTo(17.0f,17.828f)
                curveTo(16.999886f,17.29761f,16.789099f,16.788984f,16.414f,16.414f)
                lineTo(12.0f,12.0f)
                lineTo(7.586f,16.414f)
                curveTo(7.2109013f,16.788984f,7.0001135f,17.29761f,7.0f,17.828f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,2.0f)
                lineTo(7.0f,6.172f)
                curveTo(7.0001135f,6.7023897f,7.2109013f,7.2110143f,7.586f,7.586f)
                lineTo(12.0f,12.0f)
                lineTo(16.414f,7.586f)
                curveTo(16.789099f,7.2110147f,16.999887f,6.7023897f,17.0f,6.172f)
                lineTo(17.0f,2.0f)
            }
}

public val LucideIcons.All.HourglassDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hourglass: ImageVector
    @Composable get() = HourglassDefinition.asImageVector()
