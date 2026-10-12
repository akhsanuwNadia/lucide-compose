package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scroll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,17.0)
                lineTo(19.0,5.0)
                curveTo(19.0,3.895430564880371,18.104570388793945,3.0,17.0,3.0)
                lineTo(4.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                lineTo(22.0,18.0)
                curveTo(22.0,17.447715759277344,21.552284240722656,17.0,21.0,17.0)
                lineTo(11.0,17.0)
                curveTo(10.447714805603027,17.0,10.0,17.447715759277344,10.0,18.0)
                lineTo(10.0,19.0)
                curveTo(10.003205299377441,19.71666145324707,9.622709274291992,20.380260467529297,9.002591133117676,20.739519119262695)
                curveTo(8.382472038269043,21.098779678344727,7.617527961730957,21.098779678344727,6.997409343719482,20.739519119262695)
                curveTo(6.37729024887085,20.380260467529297,5.996795177459717,19.71666145324707,6.0,19.0)
                lineTo(6.0,5.0)
                curveTo(6.003204822540283,4.2833380699157715,5.62270975112915,3.619739532470703,5.002590656280518,3.2604801654815674)
                curveTo(4.382472038269043,2.9012207984924316,3.617527961730957,2.9012207984924316,2.9974091053009033,3.2604801654815674)
                curveTo(2.3772902488708496,3.619739532470703,1.9967949390411377,4.2833380699157715,2.0,5.0)
                lineTo(2.0,7.0)
                curveTo(2.0,7.5522847175598145,2.4477152824401855,8.0,3.0,8.0)
                lineTo(6.0,8.0)
            }
}

public val LucideIcons.All.ScrollDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scroll: ImageVector
    @Composable get() = ScrollDefinition.asImageVector()
