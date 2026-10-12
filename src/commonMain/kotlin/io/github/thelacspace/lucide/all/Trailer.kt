package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trailer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,11.340999603271484)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                lineTo(18.0,8.0)
                curveTo(18.0,6.895430564880371,17.104570388793945,6.0,16.0,6.0)
                lineTo(4.0,6.0)
                curveTo(2.895430564880371,6.0,2.0,6.895430564880371,2.0,8.0)
                lineTo(2.0,15.0)
                curveTo(2.0,16.104570388793945,2.895430564880371,17.0,4.0,17.0)
                lineTo(6.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,15.0)
                lineTo(22.0,16.0)
                curveTo(22.0,16.552284240722656,21.552284240722656,17.0,21.0,17.0)
                lineTo(10.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.340999603271484)
                lineTo(6.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                curveTo(5.996795177459717,17.71666145324707,6.37729024887085,18.380260467529297,6.997409343719482,18.739519119262695)
                curveTo(7.617527961730957,19.098779678344727,8.382472038269043,19.098779678344727,9.002591133117676,18.739519119262695)
                curveTo(9.622709274291992,18.380260467529297,10.003205299377441,17.71666145324707,10.0,17.0)
                curveTo(10.003205299377441,16.28333854675293,9.622709274291992,15.619739532470703,9.002591133117676,15.260479927062988)
                curveTo(8.382472038269043,14.90122127532959,7.617527961730957,14.90122127532959,6.997409343719482,15.260479927062988)
                curveTo(6.37729024887085,15.619739532470703,5.996795177459717,16.28333854675293,6.0,17.0)
            }
}

public val LucideIcons.All.TrailerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trailer: ImageVector
    @Composable get() = TrailerDefinition.asImageVector()
