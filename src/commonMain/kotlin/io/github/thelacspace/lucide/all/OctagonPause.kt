package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("OctagonPause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(10.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.586f,16.726f)
                curveTo(2.2109013f,16.351015f,2.0001135f,15.84239f,2.0f,15.312f)
                lineTo(2.0f,8.688f)
                curveTo(2.0001132f,8.15761f,2.2109013f,7.6489854f,2.586f,7.2739997f)
                lineTo(7.274f,2.5859995f)
                curveTo(7.6489854f,2.210901f,8.15761f,2.0001132f,8.688f,2.0f)
                lineTo(15.312f,2.0f)
                curveTo(15.84239f,2.0001135f,16.351015f,2.2109013f,16.726f,2.586f)
                lineTo(21.414f,7.274f)
                curveTo(21.789099f,7.6489854f,21.999886f,8.15761f,22.0f,8.688f)
                lineTo(22.0f,15.312f)
                curveTo(21.999886f,15.84239f,21.789099f,16.351015f,21.414f,16.726f)
                lineTo(16.726f,21.414f)
                curveTo(16.351015f,21.789099f,15.84239f,21.999886f,15.312f,22.0f)
                lineTo(8.688f,22.0f)
                curveTo(8.15761f,21.999887f,7.648985f,21.789099f,7.2739997f,21.414f)
                close()
            }
}

public val LucideIcons.All.OctagonPauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.OctagonPause: ImageVector
    @Composable get() = OctagonPauseDefinition.asImageVector()
