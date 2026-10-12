package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LandPlot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(18.0f,5.0f)
                lineTo(12.0f,2.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,11.99f)
                lineTo(2.5f,15.13f)
                curveTo(2.1866891f,15.307561f,1.993051f,15.6398735f,1.993051f,16.0f)
                curveTo(1.993051f,16.360128f,2.1866891f,16.69244f,2.5f,16.87f)
                lineTo(11.0f,21.730001f)
                curveTo(11.618802f,22.087267f,12.381198f,22.087267f,13.0f,21.730001f)
                lineTo(21.5f,16.87f)
                curveTo(21.81331f,16.69244f,22.006948f,16.360128f,22.006948f,16.0f)
                curveTo(22.006948f,15.639874f,21.81331f,15.307562f,21.5f,15.130001f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.49f,12.85f)
                lineTo(17.51f,19.150002f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.51f,12.85f)
                lineTo(6.5f,19.15f)
            }
}

public val LucideIcons.All.LandPlotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LandPlot: ImageVector
    @Composable get() = LandPlotDefinition.asImageVector()
