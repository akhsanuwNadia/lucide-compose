package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Caravan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,19.0)
                lineTo(18.0,9.0)
                curveTo(18.0,6.790861129760742,16.209138870239258,5.0,14.0,5.0)
                lineTo(6.0,5.0)
                curveTo(3.790860891342163,5.0,2.0,6.790861129760742,2.0,9.0)
                lineTo(2.0,17.0)
                curveTo(2.0,18.104570388793945,2.895430564880371,19.0,4.0,19.0)
                lineTo(6.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,9.0)
                lineTo(5.0,9.0)
                curveTo(5.5522847175598145,9.0,6.0,9.447714805603027,6.0,10.0)
                lineTo(6.0,12.0)
                curveTo(6.0,12.552285194396973,5.5522847175598145,13.0,5.0,13.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                lineTo(22.0,18.0)
                curveTo(22.0,18.552284240722656,21.552284240722656,19.0,21.0,19.0)
                lineTo(10.0,19.0)
                lineTo(10.0,10.0)
                curveTo(10.0,9.447714805603027,10.447714805603027,9.0,11.0,9.0)
                lineTo(13.0,9.0)
                curveTo(13.552285194396973,9.0,14.0,9.447714805603027,14.0,10.0)
                lineTo(14.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                curveTo(5.996795177459717,19.71666145324707,6.37729024887085,20.380260467529297,6.997409343719482,20.739519119262695)
                curveTo(7.617527961730957,21.098779678344727,8.382472038269043,21.098779678344727,9.002591133117676,20.739519119262695)
                curveTo(9.622709274291992,20.380260467529297,10.003205299377441,19.71666145324707,10.0,19.0)
                curveTo(10.003205299377441,18.28333854675293,9.622709274291992,17.619739532470703,9.002591133117676,17.260480880737305)
                curveTo(8.382472038269043,16.901220321655273,7.617527961730957,16.901220321655273,6.997409343719482,17.260480880737305)
                curveTo(6.37729024887085,17.619739532470703,5.996795177459717,18.28333854675293,6.0,19.0)
            }
}

public val LucideIcons.All.CaravanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Caravan: ImageVector
    @Composable get() = CaravanDefinition.asImageVector()
