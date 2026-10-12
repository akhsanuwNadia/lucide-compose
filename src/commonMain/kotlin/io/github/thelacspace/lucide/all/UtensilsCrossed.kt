package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UtensilsCrossed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(13.699999809265137,4.300000190734863)
                curveTo(12.556571006774902,5.466530799865723,12.556571006774902,7.333469390869141,13.699999809265137,8.5)
                lineTo(15.5,10.300000190734863)
                curveTo(16.66653060913086,11.443428993225098,18.533470153808594,11.443428993225098,19.700000762939453,10.300000190734863)
                lineTo(22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(3.299999952316284,3.299999952316284)
                curveTo(2.493736505508423,4.089973449707031,2.0393874645233154,5.171231269836426,2.0393874645233154,6.300000190734863)
                curveTo(2.0393874645233154,7.428769111633301,2.493736505508423,8.510026931762695,3.299999952316284,9.300000190734863)
                lineTo(10.600000381469727,16.600000381469727)
                curveTo(11.300000190734863,17.30000114440918,12.600000381469727,17.30000114440918,13.40000057220459,16.600000381469727)
                lineTo(15.0,15.0)
                close()
                moveTo(15.0,15.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0999999046325684,21.799999237060547)
                lineTo(8.5,15.499999046325684)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(12.0,12.0)
            }
}

public val LucideIcons.All.UtensilsCrossedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UtensilsCrossed: ImageVector
    @Composable get() = UtensilsCrossedDefinition.asImageVector()
