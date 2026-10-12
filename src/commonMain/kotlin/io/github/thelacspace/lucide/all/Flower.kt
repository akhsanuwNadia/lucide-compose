package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Flower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                curveTo(8.995192527770996,13.074993133544922,9.565935134887695,14.070390701293945,10.496113777160645,14.60927963256836)
                curveTo(11.426291465759277,15.148168563842773,12.573708534240723,15.148168563842773,13.503886222839355,14.60927963256836)
                curveTo(14.434064865112305,14.070390701293945,15.004807472229004,13.074993133544922,15.0,12.0)
                curveTo(15.004807472229004,10.925006866455078,14.434064865112305,9.929609298706055,13.503886222839355,9.39072036743164)
                curveTo(12.573708534240723,8.851831436157227,11.426291465759277,8.851831436157227,10.496113777160645,9.39072036743164)
                curveTo(9.565935134887695,9.929609298706055,8.995192527770996,10.925006866455078,9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.5)
                curveTo(12.0,18.985280990600586,9.985280990600586,21.0,7.5,21.0)
                curveTo(5.014718532562256,21.0,3.0,18.985280990600586,3.0,16.5)
                curveTo(3.0,14.014719009399414,5.014718532562256,12.0,7.5,12.0)
                curveTo(5.014718532562256,12.0,3.0,9.985280990600586,3.0,7.5)
                curveTo(3.0,5.014718532562256,5.014718532562256,3.0,7.5,3.0)
                curveTo(9.985280990600586,3.0,12.0,5.014718532562256,12.0,7.5)
                curveTo(12.0,5.014718532562256,14.014719009399414,3.0,16.5,3.0)
                curveTo(18.985280990600586,3.0,21.0,5.014718532562256,21.0,7.5)
                curveTo(21.0,9.985280990600586,18.985280990600586,12.0,16.5,12.0)
                curveTo(18.985280990600586,12.0,21.0,14.014719009399414,21.0,16.5)
                curveTo(21.0,18.985280990600586,18.985280990600586,21.0,16.5,21.0)
                curveTo(14.014719009399414,21.0,12.0,18.985280990600586,12.0,16.5)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.5)
                lineTo(12.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,12.0)
                lineTo(9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,12.0)
                lineTo(15.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.5)
                lineTo(12.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(9.880000114440918,9.880000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(14.119999885559082,9.880000114440918)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(9.880000114440918,14.119999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(14.119999885559082,14.119999885559082)
                lineTo(16.0,16.0)
            }
}

public val LucideIcons.All.FlowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Flower: ImageVector
    @Composable get() = FlowerDefinition.asImageVector()
