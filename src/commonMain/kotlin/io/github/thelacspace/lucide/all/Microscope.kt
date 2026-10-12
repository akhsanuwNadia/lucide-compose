package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(14.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,22.0)
                lineTo(21.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,22.0)
                curveTo(16.508316040039062,22.01121711730957,18.83091163635254,20.67948341369629,20.088319778442383,18.50906753540039)
                curveTo(21.345726013183594,16.338651657104492,21.345726013183594,13.661347389221191,20.088319778442383,11.490931510925293)
                curveTo(18.83091163635254,9.320516586303711,16.508316040039062,7.9887824058532715,14.0,8.0)
                lineTo(13.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,14.0)
                lineTo(11.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                curveTo(7.895430564880371,12.0,7.0,11.104569435119629,7.0,10.0)
                lineTo(7.0,6.0)
                lineTo(13.0,6.0)
                lineTo(13.0,10.0)
                curveTo(13.0,11.104569435119629,12.104569435119629,12.0,11.0,12.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,3.0)
                curveTo(12.0,2.4477152824401855,11.552285194396973,2.0,11.0,2.0)
                lineTo(9.0,2.0)
                curveTo(8.447714805603027,2.0,8.0,2.4477152824401855,8.0,3.0)
                lineTo(8.0,6.0)
            }
}

public val LucideIcons.All.MicroscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microscope: ImageVector
    @Composable get() = MicroscopeDefinition.asImageVector()
