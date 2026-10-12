package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wallpaper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(15.100000381469727,10.899999618530273)
                curveTo(15.881628036499023,10.13392162322998,17.13384437561035,10.138378143310547,17.90999984741211,10.90999984741211)
                lineTo(22.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                curveTo(5.996795177459717,9.71666145324707,6.37729024887085,10.380260467529297,6.997409343719482,10.739520072937012)
                curveTo(7.617527961730957,11.09877872467041,8.382472038269043,11.09877872467041,9.002591133117676,10.739520072937012)
                curveTo(9.622709274291992,10.380260467529297,10.003205299377441,9.71666145324707,10.0,9.0)
                curveTo(10.003205299377441,8.28333854675293,9.622709274291992,7.619739532470703,9.002591133117676,7.2604804039001465)
                curveTo(8.382472038269043,6.901220798492432,7.617527961730957,6.901220798492432,6.997409343719482,7.2604804039001465)
                curveTo(6.37729024887085,7.619739532470703,5.996795177459717,8.28333854675293,6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(4.0,17.0)
                lineTo(2.0,17.0)
                lineTo(2.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
}

public val LucideIcons.All.WallpaperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wallpaper: ImageVector
    @Composable get() = WallpaperDefinition.asImageVector()
