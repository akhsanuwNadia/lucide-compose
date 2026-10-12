package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BanknoteArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(4.0,18.0)
                curveTo(2.895430564880371,18.0,2.0,17.104570388793945,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(2.0,6.895430564880371,2.895430564880371,6.0,4.0,6.0)
                lineTo(20.0,6.0)
                curveTo(21.104570388793945,6.0,22.0,6.895430564880371,22.0,8.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(18.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,22.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(19.0,16.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(6.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                curveTo(9.996794700622559,12.71666145324707,10.377290725708008,13.380260467529297,10.997408866882324,13.739520072937012)
                curveTo(11.617527961730957,14.09877872467041,12.382472038269043,14.09877872467041,13.002591133117676,13.739520072937012)
                curveTo(13.622709274291992,13.380260467529297,14.003205299377441,12.71666145324707,14.0,12.0)
                curveTo(14.003205299377441,11.28333854675293,13.622709274291992,10.619739532470703,13.002591133117676,10.260479927062988)
                curveTo(12.382472038269043,9.90122127532959,11.617527961730957,9.90122127532959,10.997408866882324,10.260479927062988)
                curveTo(10.377290725708008,10.619739532470703,9.996794700622559,11.28333854675293,10.0,12.0)
            }
}

public val LucideIcons.All.BanknoteArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BanknoteArrowUp: ImageVector
    @Composable get() = BanknoteArrowUpDefinition.asImageVector()
